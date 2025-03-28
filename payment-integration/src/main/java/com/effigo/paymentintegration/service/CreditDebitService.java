package com.effigo.paymentintegration.service;

import com.effigo.paymentintegration.entity.*;
import com.effigo.paymentintegration.mapper.CreditDebitMapper;
import com.effigo.paymentintegration.mapper.CreditDebitResponseMapper;
import com.effigo.paymentintegration.mapper.CreditDebitViewMapper;
import com.effigo.paymentintegration.repository.*;
import com.effigo.paymentintegration.utils.AppConstants;
import com.effigo.shared.dto.v1.CreditDebitDtoV1;
import com.effigo.shared.dto.v1.CreditDebitExternalResponseDtoV1;
import com.effigo.shared.dto.v1.CreditDebitResponseDtoV1;
import com.effigo.shared.dto.v1.InvoiceIntegrtations.CreditDebitInternalViewDto;
import com.effigo.shared.util.ApiResponse;
import com.effigo.shared.util.ApiResponsePagination;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.swing.text.StyledEditorKit;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static com.effigo.paymentintegration.utils.AppConstants.NO_DETAILS_FOUND;
import static com.effigo.paymentintegration.utils.CommonUtil.*;

@Service
public class CreditDebitService {
    private final Logger log = LoggerFactory.getLogger(CreditDebitService.class);

    @Autowired
    private CreditDebitMapper creditDebitMapper;

    @Autowired
    private CreditDebitViewMapper creditDebitViewMapper;

    @Autowired
    private CreditDebitRepository creditDebitRepository;

    @Autowired
    private CreditDebitResponseMapper creditDebitResponseMapper;

    @Autowired
    private CreditDebitViewRepository creditDebitViewRepository;

    @Autowired
    private CreditDebitTitleRepository creditDebitTitleRepository;

    @Autowired
    private CreditDebitSupplierTitleRepository creditDebitSupplierTitleRepository;

    @Autowired
    private MasterUserRepository masterUserRepository;

    @Autowired
    private MastersIntegrationPreferenceViewRepository mastersIntegrationPreferenceViewRepository;

    @Autowired
    private SupplierUserRepository supplierUserRepository;

    public CreditDebitExternalResponseDtoV1 saveCreditDebitDetails(List<CreditDebitDtoV1> creditDebitDtoV1List) {
        CreditDebitExternalResponseDtoV1 creditDebitExternalResponseDtoV1 = new CreditDebitExternalResponseDtoV1();

        if (!CollectionUtils.isEmpty(creditDebitDtoV1List)) {
            List<CreditDebitEntity> creditDebitEntityList = creditDebitMapper.toDomainList(creditDebitDtoV1List);
            List<CreditDebitEntity> existingCdEntity = new ArrayList<>();
            List<CreditDebitEntity> removeCdEntity = new ArrayList<>();
            log.info("creditDebitEntityList: {}", creditDebitEntityList);
            creditDebitEntityList.forEach(i ->{
                boolean hasReversalInfo = StringUtils.isNotBlank(i.getRevDocNo()) &&
                        StringUtils.isNotBlank(i.getRevDocFiscalYear());


                if(hasReversalInfo) {
                    List<CreditDebitEntity> existingCreditAndDebit = creditDebitRepository.findByAccountingDocNoAndFiscalYearAndPostingDate(i.getRevDocNo(), i.getRevDocFiscalYear(), i.getPostingDate());
                    if(!CollectionUtils.isEmpty(existingCreditAndDebit)) {
                        for(CreditDebitEntity existingCreditAndDebits : existingCreditAndDebit) {
                            existingCreditAndDebits.setStatus(Boolean.FALSE);
                            creditDebitRepository.save(existingCreditAndDebits);
                        }
                    } else {
                        updateCreditDebitNotes(existingCdEntity, removeCdEntity, i);
                    }
                } else {
                    updateCreditDebitNotes(existingCdEntity, removeCdEntity, i);
                }
            });
            if(!CollectionUtils.isEmpty(existingCdEntity)) {
                creditDebitEntityList.removeAll(removeCdEntity);
                creditDebitEntityList.addAll(existingCdEntity);
            }
            List<CreditDebitEntity> creditDebitEntities = creditDebitRepository.saveAll(creditDebitEntityList);
            if (!CollectionUtils.isEmpty(creditDebitEntities)) {
                List<CreditDebitResponseDtoV1> creditDebitResponseDtoV1List = creditDebitResponseMapper.toDto(
                        creditDebitEntities);
                creditDebitExternalResponseDtoV1.setCreditDebitResponseDtoV1List(creditDebitResponseDtoV1List);
            }
        }
        return creditDebitExternalResponseDtoV1;
    }

    private void updateCreditDebitNotes(List<CreditDebitEntity> existingCdEntity, List<CreditDebitEntity> removeCdEntity,
            CreditDebitEntity i) {
        final Optional<CreditDebitEntity> byExistingKey = creditDebitRepository.findByExistingKey(
                getCdExistingKey.apply(i));
        byExistingKey.ifPresent(existing -> {
            creditDebitMapper.partialUpdate(i, existing);
            existingCdEntity.add(existing);
            removeCdEntity.add(i);
        });
        updateStatus(existingCdEntity);
        updateNewStatus(i);
    }
    private void updateNewStatus(CreditDebitEntity i) {
        if(StringUtils.isBlank(i.getRevDocNo()) ||
                StringUtils.isBlank(i.getRevDocFiscalYear())) {
            i.setStatus(Boolean.TRUE);
        }else {
            i.setStatus(Boolean.FALSE);
        }
    }

    private void updateStatus(List<CreditDebitEntity> existingCdEntity) {
        existingCdEntity.forEach(k->{
            if(StringUtils.isBlank(k.getRevDocNo()) ||
                    StringUtils.isBlank(k.getRevDocFiscalYear())){
                k.setStatus(Boolean.TRUE);
            }else{
                k.setStatus(Boolean.FALSE);
            }
        });
    }

    public ApiResponsePagination getCreditDebitDetails(String companyId,String pageNo,String pageSize,String userId,String fromDate,String toDate,String appType,String tenantId) {
        ApiResponsePagination apiResponse = new ApiResponsePagination();
        List<CreditDebitInternalViewDto> creditDebitViewList;
        List<CreditDebitDtoV1> creditDebitDtoV1List;
        Pageable pageable = getPageablePayment(pageNo, pageSize);
        boolean isCentralizedUser = false;
        boolean status = false;
        boolean isAdditionalUserCentralized = false;
        apiResponse.setMessage(AppConstants.RETRIEVAL_FAIL);
        Optional<MastersIntegrationPreferenceView> allById = mastersIntegrationPreferenceViewRepository.findByTenantId(
                tenantId);
        if (allById.isPresent()) {
            status = Boolean.parseBoolean(allById.get().getReportsIndicator());
        }
        if (org.springframework.util.StringUtils.hasLength(userId) && appType.equals("true")) {
            isCentralizedUser = masterUserRepository.checkCentralizedUser(userId);
        }
        if (org.springframework.util.StringUtils.hasLength(userId) && status && appType.equals("false")) {
            isAdditionalUserCentralized = supplierUserRepository.checkAdditionalUser(userId);
        }
        try {
            Page<CreditDebitInternalViewDto> page;
            if (status && appType.equals("false")) {
                if (!isAdditionalUserCentralized) {
                    page = creditDebitViewRepository.findCreditDebitDetailsForAdditionalUsers(
                            likeOperator.apply(companyId), pageable, fromDate,
                            toDate, userId);
                } else {
                    page = creditDebitViewRepository.findCreditDebitDetailsForCentralizedUser(
                            likeOperator.apply(companyId), pageable, fromDate, toDate);
                }
            } else {
                if (isCentralizedUser || StringUtils.isEmpty(userId)) {
                    page = creditDebitViewRepository.findCreditDebitDetailsForCentralizedUser(
                            likeOperator.apply(companyId), pageable, fromDate, toDate);

                } else {
                    page = creditDebitViewRepository.findCreditDebitDetails(likeOperator.apply(companyId), pageable,
                            userId, fromDate, toDate);
                }
            }
            if(page.hasContent()) {
                creditDebitViewList = page.getContent();
                apiResponse.setTotalElements(page.getTotalElements());
                apiResponse.setTotalPages(page.getTotalPages());
                apiResponse.setMessage(AppConstants.RETRIEVAL_SUCCESS);
                apiResponse.setSuccess(Boolean.TRUE);
                apiResponse.setStatus(HttpStatus.OK);
                creditDebitDtoV1List = creditDebitViewMapper.toDtoList(creditDebitViewList);
                apiResponse.setCreditDebitDtoV1List(creditDebitDtoV1List);
            }else{
                apiResponse.setMessage(NO_DETAILS_FOUND);
                apiResponse.setSuccess(Boolean.TRUE);
                apiResponse.setStatus(HttpStatus.OK);
            }
        }catch (Exception e){
            log.info(e.getMessage());
            apiResponse.setErrors(AppConstants.RETRIEVAL_FAIL_AT_DB);
            apiResponse.setSuccess(Boolean.TRUE);
            apiResponse.setStatus(HttpStatus.OK);
        }

        return apiResponse;
    }

    public ApiResponse getCreditDebitTitles() {
        ApiResponse apiResponse = new ApiResponse();
        apiResponse.setMessage(AppConstants.RETRIEVAL_FAIL);
        try {
            List<CreditDebitTitleView> creditDebitViewList =  creditDebitTitleRepository.findAll();
            log.info("creditDebitViewList:{}",creditDebitViewList);
            apiResponse.setData(creditDebitViewList);
            apiResponse.setMessage(AppConstants.RETRIEVAL_SUCCESS);
            apiResponse.setSuccess(Boolean.TRUE);
            apiResponse.setStatus(HttpStatus.OK);
        } catch (Exception e) {
            log.info(e.getMessage());
            apiResponse.setErrors(AppConstants.RETRIEVAL_FAIL_AT_DB);
        }

        return apiResponse;

    }
    public ApiResponse getCreditDebitSupplierTitles() {
        ApiResponse apiResponse = new ApiResponse();
        apiResponse.setMessage(AppConstants.RETRIEVAL_FAIL);
        try {
            List<CreditDebitSupplierTitleView> creditDebitSupplierTitleViews =  creditDebitSupplierTitleRepository.findAll();
            log.info("creditDebitSupplierTitleViews:{}",creditDebitSupplierTitleViews);
            apiResponse.setData(creditDebitSupplierTitleViews);
            apiResponse.setMessage(AppConstants.RETRIEVAL_SUCCESS);
            apiResponse.setSuccess(Boolean.TRUE);
            apiResponse.setStatus(HttpStatus.OK);
        } catch (Exception e) {
            log.info(e.getMessage());
            apiResponse.setErrors(AppConstants.RETRIEVAL_FAIL_AT_DB);
        }

        return apiResponse;

    }

    public ApiResponse getCreditDebitDropDownDetails() {

        ApiResponse apiResponse = new ApiResponse();
        apiResponse.setMessage(AppConstants.RETRIEVAL_FAIL);
        try {
            List<CreditDebitDropdownViewEntity> creditDebitDropDownDetails =  creditDebitViewRepository.getCreditDebitDropDownDetails();
            log.info("creditDebitDropDownDetails:{}",creditDebitDropDownDetails);
            apiResponse.setData(creditDebitDropDownDetails);
            apiResponse.setMessage(AppConstants.RETRIEVAL_SUCCESS);
            apiResponse.setSuccess(Boolean.TRUE);
            apiResponse.setStatus(HttpStatus.OK);
        } catch (Exception e) {
            log.info(e.getMessage());
            apiResponse.setErrors(AppConstants.RETRIEVAL_FAIL_AT_DB);
        }

        return apiResponse;
    }
}
