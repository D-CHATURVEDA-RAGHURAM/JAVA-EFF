package com.effigo.paymentintegration.service;

import com.effigo.paymentintegration.entity.*;
import com.effigo.paymentintegration.mapper.*;
import com.effigo.paymentintegration.repository.*;
import com.effigo.paymentintegration.utils.AppConstants;
import com.effigo.shared.dto.v1.InvoiceIntegrtations.*;
import com.effigo.shared.util.ApiResponse;
import com.effigo.shared.util.ApiResponsePagination;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import javax.persistence.criteria.Predicate;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
//import java.util.function.Predicate;

import static com.effigo.paymentintegration.utils.AppConstants.*;
import static com.effigo.paymentintegration.utils.CommonUtil.*;

@Service
public class InvoiceIntegrationsService {
	private final Logger log = LoggerFactory.getLogger(InvoiceIntegrationsService.class);
	@Autowired
	private InvoiceIntegrationsRepository invoiceIntegrationsRepository;
	@Autowired
	private InvoiceIntegrationsMapper invoiceIntegrationsMapper;
	@Autowired
	private PaymentMainViewRepository paymentMainViewRepository;
	@Autowired
	private PaymentStatusLogService paymentStatusLogService;
	@Autowired
	private InvoiceIntegrationsViewRepository invoiceIntegrationsViewRepository;
	@Autowired
	private InvoiceIntegrationsViewMapper invoiceIntegrationsViewMapper;
	@Autowired
	private InvoiceIntegrationsInternalMapper invoiceIntegrationsInternalMapper;

	@Autowired
	private InvoiceIntegrationTitlesViewRepository invoiceIntegrationTitlesViewRepository;

	@Autowired
	private InvoiceIntegrationSupplierTitlesViewRepository invoiceIntegrationSupplierTitlesViewRepository;

	@Autowired
	private MasterUserRepository masterUserRepository;

	@Autowired
	private InvoiceDtoViewMapper invoiceDtoViewMapper;

	@Autowired
	private InvoiceHeaderRepository invoiceHeaderRepository;

	@Autowired
	private InvoiceHeaderIntegrationsMapper invoiceHeaderIntegrationsMapper;

	@Autowired
	private MastersIntegrationPreferenceViewRepository mastersIntegrationPreferenceViewRepository;

	@Autowired
	private SupplierUserRepository supplierUserRepository;

	//    @Transactional
	public List<InvoiceIntegrationsResponseV1> addInvoices(
			List<InvoiceIntegrationInternalDtoV1> invoiceIntegrationInternalDtoV1s) {
		log.info("PaymentMainDtos: {}", invoiceIntegrationInternalDtoV1s);
		List<InvoiceIntegrationsResponseV1> invoiceIntegrationsResponse = new ArrayList<>();
		List<InvoiceIntegrations> saveHeaderInvoices = new ArrayList<>();
		List<InvoiceIntegrations> invoiceIntegrations = invoiceIntegrationsMapper.toDomainList(
				invoiceIntegrationInternalDtoV1s);

		invoiceIntegrations.forEach(i -> {
			InvoiceIntegrations existingInvoice = null;
			InvoiceIntegrationsResponseV1 iir = new InvoiceIntegrationsResponseV1();
			iir.setInvoiceDocumentNumber(i.getInvoiceDocumentNumber());
			iir.setInvoiceDocumentItem(i.getInvoiceDocumentItem());
			iir.setFiscalYear(i.getFiscalYear());
			SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
			SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
			iir.setCreatedOn(sdf1.format(new Timestamp(System.currentTimeMillis())));
			iir.setCreatedAt(sdf.format(new Timestamp(System.currentTimeMillis())));
			boolean hasReversalInfo = StringUtils.hasLength(i.getReversalDoc()) && StringUtils.hasLength(
					i.getReverseYear());
			if (hasReversalInfo) {
				reversalInvoice(i);
			} else {
				existingInvoice = updateExistingInvoices(saveHeaderInvoices, i, existingInvoice);
			}
			try {
				if (Objects.isNull(existingInvoice)) {
					invoiceIntegrationsRepository.save(i);
					saveHeaderInvoices.add(i);
				}
				iir.setMessage(AppConstants.INSERT_SUCCESS);
			} catch (Exception e) {
				log.info("Exception: {}", e.getMessage());
				iir.setMessage(AppConstants.INSERT_FAIL);
				iir.setErrorCode("500");
			}
			invoiceIntegrationsResponse.add(iir);
		});
		if (!CollectionUtils.isEmpty(saveHeaderInvoices)) {
			try {
				invoiceHeaderRepository.saveAll(invoiceHeaderIntegrationsMapper.toDomain(saveHeaderInvoices));
			} catch (Exception e) {
				log.error("Error occurred while saving to invoice header : {}", e.getMessage());
			}
		}
		return invoiceIntegrationsResponse;
	}

	public ApiResponsePagination getInvoices(String companyId, String pageNo, String pageSize, String userId,
			String fromDate, String toDate, String appType, String tenantId) {
		ApiResponsePagination apiResponse = new ApiResponsePagination();
		List<InvoiceInternalViewDto> invoiceIntegrationViews = null;
		List<InvoiceInternalDtoV1> invoiceIntegrationInternalDtoV1s = null;
		boolean isCentralizedUser = false;
		boolean status = false;
		boolean isAdditionalUserCentralized = false;
		Pageable pageable = getPageablePayment(pageNo, pageSize);
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
			Page<InvoiceInternalViewDto> page;
			if (status && appType.equals("false")) {
				if (!isAdditionalUserCentralized) {
					page = invoiceIntegrationsViewRepository.findInvoiceDetailsForAdditionalUsers(
							likeOperator.apply(companyId), pageable, fromDate,
							toDate, userId);
				} else {
					page = invoiceIntegrationsViewRepository.findInvoiceForCentralUser(pageable, fromDate, toDate,
							likeOperator.apply(companyId));
				}
			} else {
				if (isCentralizedUser || !StringUtils.hasLength(userId)) {
					page = invoiceIntegrationsViewRepository.findInvoiceForCentralUser(pageable, fromDate, toDate,
							likeOperator.apply(companyId));
				} else {
					page = invoiceIntegrationsViewRepository.findInvoiceDetails(likeOperator.apply(companyId), userId,
							pageable, fromDate, toDate);
				}
			}
			if (page.hasContent()) {
				invoiceIntegrationViews = page.getContent();
				apiResponse.setTotalElements(page.getTotalElements());
				apiResponse.setTotalPages(page.getTotalPages());
				apiResponse.setMessage(RETRIEVAL_SUCCESS);
				apiResponse.setSuccess(Boolean.TRUE);
				apiResponse.setStatus(HttpStatus.OK);
				invoiceIntegrationInternalDtoV1s = invoiceIntegrationsViewMapper.toDto(invoiceIntegrationViews);
				apiResponse.setInvoiceInternalDtoV1List(invoiceIntegrationInternalDtoV1s);
			} else {
				apiResponse.setMessage(NO_DETAILS_FOUND);
				apiResponse.setSuccess(Boolean.TRUE);
				apiResponse.setStatus(HttpStatus.OK);
			}
		} catch (Exception e) {
			log.error(e.getMessage());
			apiResponse.setErrors(RETRIEVAL_FAIL_AT_DB);
		}
		return apiResponse;
	}

	public ApiResponse getInvoiceTitles() {
		ApiResponse apiResponse = new ApiResponse();
		apiResponse.setMessage(AppConstants.RETRIEVAL_FAIL);
		try {
			List<InvoiceIntegrationTitlesView> invoiceIntegrationTitlesViews = invoiceIntegrationTitlesViewRepository.findAll();
			log.info("invoiceIntegrationTitlesViews:{}", invoiceIntegrationTitlesViews);
			apiResponse.setData(invoiceIntegrationTitlesViews);
			apiResponse.setMessage(RETRIEVAL_SUCCESS);
			apiResponse.setSuccess(Boolean.TRUE);
			apiResponse.setStatus(HttpStatus.OK);
		} catch (Exception e) {
			log.info(e.getMessage());
			apiResponse.setErrors(RETRIEVAL_FAIL_AT_DB);
		}

		return apiResponse;

	}

	public ApiResponse getInvoiceSupplierTitles() {
		ApiResponse apiResponse = new ApiResponse();
		apiResponse.setMessage(AppConstants.RETRIEVAL_FAIL);
		try {
			List<InvoiceIntegrationSupplierTitlesView> invoiceIntegrationSupplierTitlesViews = invoiceIntegrationSupplierTitlesViewRepository.findAll();
			log.info("invoiceIntegrationSupplierTitlesViews:{}", invoiceIntegrationSupplierTitlesViews);
			apiResponse.setData(invoiceIntegrationSupplierTitlesViews);
			apiResponse.setMessage(RETRIEVAL_SUCCESS);
			apiResponse.setSuccess(Boolean.TRUE);
			apiResponse.setStatus(HttpStatus.OK);
		} catch (Exception e) {
			log.info(e.getMessage());
			apiResponse.setErrors(RETRIEVAL_FAIL_AT_DB);
		}
		return apiResponse;
	}

	public ApiResponse getInvoiceDropDownDetails() {
		ApiResponse apiResponse = new ApiResponse();
		apiResponse.setMessage(AppConstants.RETRIEVAL_FAIL);
		try {
			List<DropdownViewEntity> invoiceIntegrationSupplierTitlesViews = invoiceIntegrationsViewRepository.getInvoiceDropDownDetails();
			log.info("invoiceIntegrationSupplierTitlesViews:{}", invoiceIntegrationSupplierTitlesViews);
			apiResponse.setData(invoiceIntegrationSupplierTitlesViews);
			apiResponse.setMessage(RETRIEVAL_SUCCESS);
			apiResponse.setSuccess(Boolean.TRUE);
			apiResponse.setStatus(HttpStatus.OK);
		} catch (Exception e) {
			log.info(e.getMessage());
			apiResponse.setErrors(RETRIEVAL_FAIL_AT_DB);
		}
		return apiResponse;
	}

	private InvoiceIntegrations updateExistingInvoices(List<InvoiceIntegrations> saveHeaderInvoices,
			InvoiceIntegrations i, InvoiceIntegrations existingInvoice) {
		try {
			Optional<InvoiceIntegrations> existingInvoices = invoiceIntegrationsRepository
					.findExistingInvoicesByKey
							(getInvoiceExistingKey.apply(i), Boolean.TRUE);
			if (existingInvoices.isPresent()) {
				i.setStatus(Boolean.TRUE);
				invoiceIntegrationsMapper.partialUpdate(existingInvoices.get(), i);
				invoiceIntegrationsRepository.save(existingInvoices.get());
				existingInvoice = existingInvoices.get();

			}

		} catch (Exception e) {
			log.error("Error occurred while retrieving existing records for Inovice from DB : {}", e.getMessage());
		}

		i.setStatus(Boolean.TRUE);
		return existingInvoice;
	}

	private void reversalInvoice(InvoiceIntegrations i) {
		List<InvoiceIntegrations> existingReversalInvoices = invoiceIntegrationsRepository
				.findByAccountingDocumentNumberAndFiscalYearAndDocumentPostingDateAndInvoiceDocumentItemAndStatus
						(i.getReversalDoc(), i.getReverseYear(), i.getDocumentPostingDate(),
								i.getInvoiceDocumentItem(), Boolean.TRUE);
		if (!CollectionUtils.isEmpty(existingReversalInvoices)) {
			log.info("in reversal call");
			for (InvoiceIntegrations reversalInvoice : existingReversalInvoices) {
				if (i.getReversalDoc().equals(reversalInvoice.getAccountingDocumentNumber()) &&
						i.getReverseYear().equals(reversalInvoice.getFiscalYear())) {
					reversalInvoice.setStatus(Boolean.FALSE);
				} else {
					reversalInvoice.setStatus(Boolean.TRUE);
				}
				invoiceIntegrationsRepository.save(reversalInvoice);
			}
		}
	}

	public Page<InvoiceIntegrationView> getInvoicesViewService(
	        Integer page, Integer size, String sortBy, String sortDirection, String documentType,
	        String documentCurrencyAmount, String cgst, String fiscalYear, String transactionCode) {

	    Specification<InvoiceIntegrationView> spec = (root, query, criteriaBuilder) -> {
	        List<Predicate> predicates = new ArrayList<>();
	        if (documentType != null) {
	            predicates.add(criteriaBuilder.equal(root.get("documentType"), documentType));
	        }
	        if (documentCurrencyAmount != null) {
	            predicates.add(criteriaBuilder.equal(root.get("documentCurrencyAmount"), documentCurrencyAmount));
	        }
	        if (cgst != null) {
	            predicates.add(criteriaBuilder.equal(root.get("cgst"), cgst));
	        }
	        if (fiscalYear != null) {
	            predicates.add(criteriaBuilder.equal(root.get("fiscalYear"), fiscalYear));
	        }
	        if (transactionCode != null) {
	            predicates.add(criteriaBuilder.equal(root.get("transactionCode"), transactionCode));
	        }
	        return criteriaBuilder.and(predicates.toArray(new Predicate[0]));
	    };

	    long totalRecords = invoiceIntegrationsViewRepository.count(spec);
	    if (size == null || size <= 0) {
	        size = totalRecords > 0 ? calculateDynamicPageSize(totalRecords) : 10;
	    }
	    if (page == null || page < 0) {
	        page = 0;
	    }
	    if (sortBy == null || sortBy.trim().isEmpty()) {
	        sortBy = "invoiceIntegrationId";
	    }
	    Sort sort = sortDirection.equalsIgnoreCase("desc") ? Sort.by(sortBy).descending() : Sort.by(sortBy).ascending();
	    Pageable pageable = PageRequest.of(page, size, sort);

	    return invoiceIntegrationsViewRepository.findAll(spec, pageable);
	}

	private int calculateDynamicPageSize(long totalRecords) {
	    int targetPages = (int) Math.ceil(10 + Math.log10(totalRecords) * 10);
	    int pageSize = (int) Math.ceil((double) totalRecords / targetPages);
	    return Math.max(100, Math.min(pageSize, 500));
	}
}