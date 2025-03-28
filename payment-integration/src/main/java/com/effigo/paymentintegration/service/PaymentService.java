package com.effigo.paymentintegration.service;

import com.effigo.paymentintegration.entity.*;
import com.effigo.paymentintegration.mapper.PaymentMainMapper;
import com.effigo.paymentintegration.mapper.PaymentMainViewMapper;
import com.effigo.paymentintegration.repository.*;
import com.effigo.paymentintegration.utils.AppConstants;
import com.effigo.shared.dto.v1.InvoiceIntegrtations.PaymentInternalViewDto;
import com.effigo.shared.dto.v1.PaymentMainDtoV1;
import com.effigo.shared.dto.v1.PaymentMainViewInternalDto;
import com.effigo.shared.util.ApiResponse;
import com.effigo.shared.util.ApiResponsePagination;
import org.postgresql.util.PSQLException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static com.effigo.paymentintegration.utils.AppConstants.NO_DETAILS_FOUND;
import static com.effigo.paymentintegration.utils.CommonUtil.getPageablePayment;

@Service
public class PaymentService {
	private final Logger log = LoggerFactory.getLogger(PaymentService.class);
	@Autowired
	private PaymentMainRepository paymentMainRepository;
	@Autowired
	private PaymentMainMapper paymentMainMapper;

	@Autowired
	private PaymentMainViewMapper paymentMainViewMapper;
	@Autowired
	private PaymentMainViewRepository paymentMainViewRepository;
	@Autowired
	private PaymentStatusLogService paymentStatusLogService;
	@Autowired
	private PaymentMainTitlesViewRepository paymentMainTitlesViewRepository;
	@Autowired
	private PaymentMainSupplierTitlesViewRepository paymentMainSupplierTitlesViewRepository;
	@Autowired
	private MasterUserRepository masterUserRepository;

	@Autowired
	private MastersIntegrationPreferenceViewRepository mastersIntegrationPreferenceViewRepository;

	@Autowired
	private SupplierUserRepository supplierUserRepository;

	@Autowired
	private PaymentRepository paymentRepository;

	//    @Transactional
	public ApiResponse addPayments(List<PaymentMainDtoV1> paymentMainDtoV1s) throws PSQLException {
		log.info("PaymentMainDtos: {}", paymentMainDtoV1s);
		List<PaymentMain> paymentMains = new ArrayList<>();
		ApiResponse apiResponse = new ApiResponse();
		apiResponse.setMessage(AppConstants.INSERT_FAIL);
		try {
			List<PaymentMain> paymentMains1 = paymentMainMapper.toDomain(paymentMainDtoV1s);
			log.info("paymentMains: {}", paymentMains1);
			Map<String, PaymentMain> docNumPaymentMap = new HashMap<>();
			Set<String> invoiceNum = paymentMains1.stream().map(PaymentMain::getInvoiceDocument)
					.collect(Collectors.toSet());
			Set<String> paymentNum = paymentMains1.stream().map(PaymentMain::getPaymentDocumentNumber)
					.collect(Collectors.toSet());
			paymentMains1.forEach(
					paymentMain -> docNumPaymentMap.put(
							paymentMain.getPaymentDocumentNumber() + paymentMain.getInvoiceDocument(), paymentMain)
			);
			List<PaymentMain> dbPaymentDetails = paymentMainRepository.getPaymentDetailsByDocNumber(
					paymentNum, invoiceNum);
			Map<String, PaymentMain> dbPaymentMainMap = dbPaymentDetails.stream()
					.collect(Collectors.toMap(t -> t.getPaymentDocumentNumber() + t.getInvoiceDocument(),
							Function.identity()));
			List<PaymentMain> newPaymentMains = new ArrayList<>();

			docNumPaymentMap.keySet().forEach(docNumber -> {
						PaymentMain paymentMain = docNumPaymentMap.get(docNumber);
						if (dbPaymentMainMap.containsKey(docNumber)) {
							PaymentMain dbPaymentMain = dbPaymentMainMap.get(docNumber);
							paymentMainMapper.partialUpdate(paymentMain, dbPaymentMain);
							newPaymentMains.add(dbPaymentMain);
						} else {
							newPaymentMains.add(paymentMain);
						}

					}

			);
			log.info("Payments to be saved : {}", newPaymentMains);
			if (!CollectionUtils.isEmpty(newPaymentMains)) {
				paymentMains.addAll(paymentMainRepository.saveAll(newPaymentMains));
			}
			log.info("Saved Payments: {}", newPaymentMains);
			apiResponse.setData(paymentMainMapper.toDtoList(paymentMains));
			apiResponse.setMessage(AppConstants.INSERT_SUCCESS);
			apiResponse.setSuccess(Boolean.TRUE);

		} catch (Exception e) {
			log.info(e.getMessage());
			apiResponse.setErrors(AppConstants.INSERT_FAIL_AT_DB);
		}
		apiResponse.setStatus(HttpStatus.OK);
		paymentStatusLogService.saveAddPaymentsStatusLog(paymentMains);
		return apiResponse;
	}
	public ApiResponsePagination getPayments(String companyId, String pageNo, String pageSize, String userId,
			String fromDate, String toDate, String tenantId, String appType) {
		ApiResponsePagination apiResponse = new ApiResponsePagination();
		Pageable pageable = getPageablePayment(pageNo, pageSize);
		boolean isCentralizedUser = false;
		boolean status = false;
		boolean isAdditionalUserCentralized = false;
		List<PaymentInternalViewDto> paymentMainViewList = new ArrayList<>();
		//List<PaymentInternalViewDto> paymentMainViewList1 = new ArrayList<>();
		List<PaymentMainViewInternalDto> paymentMainDtoV1List = new ArrayList<>();
		Optional<MastersIntegrationPreferenceView> allById = mastersIntegrationPreferenceViewRepository.findByTenantId(
				tenantId);
		if (allById.isPresent()) {
			status = Boolean.parseBoolean(allById.get().getReportsIndicator());
		}
		if (StringUtils.hasLength(userId) && appType.equals("true")) {
			isCentralizedUser = masterUserRepository.checkCentralizedUser(userId);
		}
		if (StringUtils.hasLength(userId) && status && appType.equals("false")) {
			isAdditionalUserCentralized = supplierUserRepository.checkAdditionalUser(userId);
		}
		try {
			Page<PaymentInternalViewDto> page;
			if (status && appType.equals("false")) {
				if (!isAdditionalUserCentralized) {
					page = paymentMainViewRepository.findPaymentDetailsForAdditionalUsers(companyId, pageable, fromDate,
							toDate, userId);
				} else {
					page = paymentMainViewRepository.findPaymentDetailsForCentralizedUser(companyId, pageable, fromDate,
							toDate);
				}
			}else {

                if (isCentralizedUser || !StringUtils.hasLength(userId)) {
                    page = paymentMainViewRepository.findPaymentDetailsForCentralizedUser(companyId, pageable, fromDate,
                            toDate);
                } else {
                    page = paymentMainViewRepository.findPaymentDetails(companyId, pageable, fromDate, toDate, userId);
                }
            }

			if (page.hasContent()) {
				paymentMainViewList = page.getContent();
				apiResponse.setTotalElements(page.getTotalElements());
				apiResponse.setTotalPages(page.getTotalPages());
				apiResponse.setMessage(AppConstants.RETRIEVAL_SUCCESS);
				paymentMainDtoV1List = paymentMainViewMapper.toDtoList(paymentMainViewList);
				apiResponse.setPaymentMainDtoV1List(paymentMainDtoV1List);
			} else {
				apiResponse.setMessage(NO_DETAILS_FOUND);
			}
		} catch (Exception e) {
			log.info(e.getMessage());
			apiResponse.setErrors(AppConstants.RETRIEVAL_FAIL_AT_DB);
		}
		apiResponse.setSuccess(Boolean.TRUE);
		apiResponse.setStatus(HttpStatus.OK);
		return apiResponse;
	}

	public ApiResponse getPaymentTitles() {
		ApiResponse apiResponse = new ApiResponse();
		apiResponse.setMessage(AppConstants.RETRIEVAL_FAIL);
		try {
			List<PaymentMainTitlesView> paymentMainTitlesViews = paymentMainTitlesViewRepository.findAll();
			log.info("paymentMainTitlesViews:{}", paymentMainTitlesViews);
			apiResponse.setData(paymentMainTitlesViews);
			apiResponse.setMessage(AppConstants.RETRIEVAL_SUCCESS);
			apiResponse.setSuccess(Boolean.TRUE);
			apiResponse.setStatus(HttpStatus.OK);
		} catch (Exception e) {
			log.info(e.getMessage());
			apiResponse.setErrors(AppConstants.RETRIEVAL_FAIL_AT_DB);
		}

		return apiResponse;
	}

	public ApiResponse getPaymentSupplierTitles() {
		ApiResponse apiResponse = new ApiResponse();
		apiResponse.setMessage(AppConstants.RETRIEVAL_FAIL);
		try {
			List<PaymentMainSupplierTitlesView> paymentMainSupplierTitlesViews = paymentMainSupplierTitlesViewRepository.findAll();
			log.info("paymentMainSupplierTitlesViews:{}", paymentMainSupplierTitlesViews);
			apiResponse.setData(paymentMainSupplierTitlesViews);
			apiResponse.setMessage(AppConstants.RETRIEVAL_SUCCESS);
			apiResponse.setSuccess(Boolean.TRUE);
			apiResponse.setStatus(HttpStatus.OK);
		} catch (Exception e) {
			log.info(e.getMessage());
			apiResponse.setErrors(AppConstants.RETRIEVAL_FAIL_AT_DB);
		}

		return apiResponse;
	}

	public ApiResponse getPaymentDropDownDetails() {

		ApiResponse apiResponse = new ApiResponse();
		apiResponse.setMessage(AppConstants.RETRIEVAL_FAIL);
		try {
			List<PaymentDropdownViewEntity> paymentMainSupplierTitlesViews = paymentMainViewRepository.getPaymentDropDownDetails();
			log.info("paymentMainSupplierTitlesViews:{}", paymentMainSupplierTitlesViews);
			apiResponse.setData(paymentMainSupplierTitlesViews);
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
