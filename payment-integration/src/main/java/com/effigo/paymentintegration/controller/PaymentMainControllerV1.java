package com.effigo.paymentintegration.controller;

import com.effigo.paymentintegration.config.MultiTenantManager;
import com.effigo.paymentintegration.entity.InvoiceIntegrationView;
import com.effigo.paymentintegration.service.CreditDebitService;
import com.effigo.paymentintegration.service.InvoiceIntegrationsService;
import com.effigo.paymentintegration.service.PaymentAdvanceService;
import com.effigo.paymentintegration.service.PaymentService;
import com.effigo.paymentintegration.utils.JwtTokenDetails;
import com.effigo.shared.dto.v1.CreditDebitDtoV1;
import com.effigo.shared.dto.v1.CreditDebitExternalResponseDtoV1;
import com.effigo.shared.dto.v1.InvoiceIntegrtations.*;
import com.effigo.shared.dto.v1.PaymentAdvanceDtoV1;
import com.effigo.shared.dto.v1.PaymentExternalResponseDtoV1;
import com.effigo.shared.dto.v1.PaymentMainDtoV1;
import com.effigo.shared.util.ApiResponse;
import com.effigo.shared.util.ApiResponsePagination;
import org.postgresql.util.PSQLException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/effigo/payment/integration/v1/{tenantId}")
@CrossOrigin
public class PaymentMainControllerV1 {
    private final Logger log = LoggerFactory.getLogger(PaymentMainControllerV1.class);
    @Autowired
    private MultiTenantManager multiTenantManager;
    @Autowired
    private PaymentService paymentService;
    @Autowired
    private InvoiceIntegrationsService invoiceIntegrationsService;
    @Autowired
    private CreditDebitService creditDebitService;
    @Autowired
    private JwtTokenDetails jwtTokenDetails;
    
    @Autowired
    private PaymentAdvanceService paymentAdvanceService;
    
    private static final String BEARER = "BEARER";
    @GetMapping("/tokenValidation")
    public Boolean securedEndpoint(@RequestHeader(name = "Authorization", required = false) String authorizationHeader) {
        try {
            String token = authorizationHeader.substring(BEARER.length()).trim();
            jwtTokenDetails.validateToken(token);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * This is for TRIL Payments Save.
     * @param paymentMainDtoV1s
     * @param tenantId
     * @return
     * @throws PSQLException
     */
    @PostMapping(value = "/addPayments",consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ApiResponse> addPayments(@RequestBody List<PaymentMainDtoV1> paymentMainDtoV1s,
                                                   @PathVariable(name = "tenantId") String tenantId)
            throws PSQLException {
        if (null != tenantId) {
            multiTenantManager.setCurrentTenant(tenantId);
        }
        log.info("Payload: {}",paymentMainDtoV1s);
        ApiResponse response=paymentService.addPayments(paymentMainDtoV1s);
        return new ResponseEntity<>(response, response.getStatus());
    }
    @GetMapping(value = "/getPayments", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ApiResponsePagination> getPayments(@PathVariable(name = "tenantId") String tenantId,@RequestParam(required = false) String companyId,
            @RequestParam(required = false) String pageNo,
            @RequestParam(required = false) String pageSize,
            @RequestParam(required = false) String userId,
            @RequestParam(required = false) String fromDate,
            @RequestParam(required = false) String toDate,
            @RequestParam(required = false)  String appType) {
        log.info("tenantId:{},pageNo:{},pageSize:{},companyId:{},userId:{},fromDate:{},toDate:{},appType:{}",tenantId,pageNo,pageSize,companyId,userId,fromDate,toDate,appType);
        if (null != tenantId) {
            multiTenantManager.setCurrentTenant(tenantId);
        }
        ApiResponsePagination response=paymentService.getPayments(companyId,pageNo,pageSize,userId,fromDate,toDate,tenantId,appType);
        return new ResponseEntity<>(response, response.getStatus());
    }
    @GetMapping(value = "/getPaymentTitles", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ApiResponse> getPaymentTitles(@PathVariable(name = "tenantId") String tenantId) {

        log.info("tenantId:{}",tenantId);
        if (null != tenantId) {
            multiTenantManager.setCurrentTenant(tenantId);
        }
        ApiResponse response=paymentService.getPaymentTitles();
        log.info("response:{}",response);
        return new ResponseEntity<>(response, response.getStatus());
    }
    @GetMapping(value = "/getPaymentSupplierTitles", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ApiResponse> getPaymentSupplierTitles(@PathVariable(name = "tenantId") String tenantId) {

        log.info("tenantId:{}",tenantId);
        if (null != tenantId) {
            multiTenantManager.setCurrentTenant(tenantId);
        }
        ApiResponse response=paymentService.getPaymentSupplierTitles();
        log.info("response:{}",response);
        return new ResponseEntity<>(response, response.getStatus());
    }
    @PostMapping(value = "/addInvoices",consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<InvoiceIntegrationsResponseV1>> addInvoices(@RequestBody List<InvoiceIntegrationInternalDtoV1> invoiceIntegrationInternalDtoV1s,
                                                   @PathVariable(name = "tenantId") String tenantId)
            throws PSQLException {
        if (null != tenantId) {
            multiTenantManager.setCurrentTenant(tenantId);
        }
        log.info("Payload: {}",invoiceIntegrationInternalDtoV1s);
        List<InvoiceIntegrationsResponseV1> response=invoiceIntegrationsService.addInvoices(invoiceIntegrationInternalDtoV1s);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
    @PostMapping(value = "/saveCreditDebitDetails",consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CreditDebitExternalResponseDtoV1> saveCreditDebitDetails(@RequestBody List<CreditDebitDtoV1> creditDebitDtoV1List,
                                                                                   @PathVariable(name = "tenantId") String tenantId) {
        log.info("tenantId : {} Payload: {}",tenantId,creditDebitDtoV1List);
        if (null != tenantId) {
            multiTenantManager.setCurrentTenant(tenantId);
        }
        CreditDebitExternalResponseDtoV1 creditDebitExternalResponseDtoV1 = null;
        try {
            creditDebitExternalResponseDtoV1 = creditDebitService.saveCreditDebitDetails(creditDebitDtoV1List);
            log.info("creditDebitExternalResponseDtoV1:{}",creditDebitExternalResponseDtoV1);
        }catch(Exception e){
            log.error("error in creditDebit Note:{}",e.getMessage());
            return ResponseEntity.badRequest().body(creditDebitExternalResponseDtoV1);

        }
       return ResponseEntity.ok().body(creditDebitExternalResponseDtoV1);
    }
    @GetMapping(value = "/getCreditDebit", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ApiResponsePagination> getCreditDebitDetails(@PathVariable(name = "tenantId") String tenantId,@RequestParam(required=false)  String companyId,
            @RequestParam(required = false) String pageNo,
            @RequestParam(required = false) String pageSize,
            @RequestParam(required = false) String userId,
            @RequestParam(required = false) String fromDate,
            @RequestParam(required = false) String toDate,
            @RequestParam(required = false)  String appType) {

        log.info("tenantId:{},companyId:{},userId:{},fromDate:{},toDate:{},appType:{}",tenantId,companyId,userId,fromDate,toDate,appType);
        if (null != tenantId) {
            multiTenantManager.setCurrentTenant(tenantId);
        }
        ApiResponsePagination response=creditDebitService.getCreditDebitDetails(companyId,pageNo,pageSize,userId,fromDate,toDate,appType,tenantId);
//        log.info("response:{}",response);
        return new ResponseEntity<>(response, response.getStatus());
    }
    @GetMapping(value = "/getCreditDebitTitles", produces =MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ApiResponse> getCreditDebitTitles(@PathVariable(name = "tenantId") String tenantId) {

        log.info("tenantId:{}",tenantId);
        if (null != tenantId) {
            multiTenantManager.setCurrentTenant(tenantId);
        }
        ApiResponse response=creditDebitService.getCreditDebitTitles();
        log.info("response:{}",response);
        return new ResponseEntity<>(response, response.getStatus());
    }
    @GetMapping(value = "/getCreditDebitSupplierTitles", produces =MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ApiResponse> getCreditDebitSupplierTitles(@PathVariable(name = "tenantId") String tenantId) {

        log.info("tenantId:{}",tenantId);
        if (null != tenantId) {
            multiTenantManager.setCurrentTenant(tenantId);
        }
        ApiResponse response=creditDebitService.getCreditDebitSupplierTitles();
        log.info("response:{}",response);
        return new ResponseEntity<>(response, response.getStatus());
    }
    @GetMapping(value = "/getInvoiceTitles", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ApiResponse> getInvoiceTitles(@PathVariable(name = "tenantId") String tenantId) {

        log.info("tenantId:{}",tenantId);
        if (null != tenantId) {
            multiTenantManager.setCurrentTenant(tenantId);
        }
        ApiResponse response=invoiceIntegrationsService.getInvoiceTitles();
        log.info("response:{}",response);
        return new ResponseEntity<>(response, response.getStatus());
    }
    @GetMapping(value = "/getInvoiceSupplierTitles", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ApiResponse> getInvoicePortalTitles(@PathVariable(name = "tenantId") String tenantId) {

        log.info("tenantId:{}",tenantId);
        if (null != tenantId) {
            multiTenantManager.setCurrentTenant(tenantId);
        }
        ApiResponse response=invoiceIntegrationsService.getInvoiceSupplierTitles();
        log.info("response:{}",response);
        return new ResponseEntity<>(response, response.getStatus());
    }

    @GetMapping(value = "/getInvoices", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ApiResponsePagination> getInvoices(@PathVariable String tenantId,@RequestParam(required = false) String companyId,
            @RequestParam(required = false) String pageNo,
            @RequestParam(required = false) String pageSize,
            @RequestParam(required = false) String userId,
            @RequestParam(required = false) String fromDate,
            @RequestParam(required = false) String toDate,
            @RequestParam(required = false)  String appType){

        log.info("tenantId:{},pageNo:{},pageSize:{},companyId:{},userId:{},fromDate:{},toDate:{},appType:{}",tenantId,pageNo,pageSize,companyId,userId,fromDate,toDate,appType);

        if(null != tenantId){
            multiTenantManager.setCurrentTenant(tenantId);
        }
            ApiResponsePagination response = invoiceIntegrationsService.getInvoices(companyId,pageNo,pageSize,userId,fromDate,toDate,appType,tenantId);
        return new ResponseEntity<>(response, response.getStatus());
    }

    /**
     * This is for Varroc Payments.
     * @param paymentAdvanceDtoV1
     * @param tenantId
     * @return
     */
    @PostMapping(value = "/savePaymentDetails",consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<PaymentExternalResponseDtoV1> savePaymentDetails(@RequestBody List<PaymentAdvanceDtoV1> paymentAdvanceDtoV1,
                                                                                   @PathVariable(name = "tenantId") String tenantId) {
        log.info("tenantId : {} Payload: {}",tenantId,paymentAdvanceDtoV1);
        if (null != tenantId) {
            multiTenantManager.setCurrentTenant(tenantId);
        }
        PaymentExternalResponseDtoV1 paymentExternalResponseDtoV1 = null;
        try {
        	paymentExternalResponseDtoV1 = paymentAdvanceService.savePaymentDetails(paymentAdvanceDtoV1);
            log.info("paymentExternalResponseDtoV1:{}",paymentExternalResponseDtoV1);
        }catch(Exception e){
            log.error("error in saving payment :{}",e.getMessage());
            return ResponseEntity.badRequest().body(paymentExternalResponseDtoV1);

        }
       return ResponseEntity.ok().body(paymentExternalResponseDtoV1);
    }

    @GetMapping(value = "/getInvoiceDropDownDetails",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ApiResponse> getInvoiceDropDownDetails(@PathVariable String tenantId){
        log.info("tenantId:{}",tenantId);
        if(StringUtils.hasLength(tenantId)){
            multiTenantManager.setCurrentTenant(tenantId);
        }
        ApiResponse response = invoiceIntegrationsService.getInvoiceDropDownDetails();
        return new ResponseEntity<>(response, response.getStatus());

    }
    @GetMapping(value = "/getPaymentDropDownDetails",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ApiResponse> getPaymentDropDownDetails(@PathVariable String tenantId){
        log.info("tenantId:{}",tenantId);
        if(StringUtils.hasLength(tenantId)){
            multiTenantManager.setCurrentTenant(tenantId);
        }
        ApiResponse response = paymentService.getPaymentDropDownDetails();
        return new ResponseEntity<>(response, response.getStatus());

    }
    @GetMapping(value = "/getCreditDebitDropDownDetails",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ApiResponse> getCreditDebitDropDownDetails(@PathVariable String tenantId){
        log.info("tenantId:{}",tenantId);
        if(StringUtils.hasLength(tenantId)){
            multiTenantManager.setCurrentTenant(tenantId);
        }
        ApiResponse response = creditDebitService.getCreditDebitDropDownDetails();
        return new ResponseEntity<>(response, response.getStatus());

    }

    @GetMapping("/paginated")
    public ResponseEntity<Map<String, Object>> getInvoicesView(
            @RequestParam(required = false) Integer page,
            @RequestParam(required = false) Integer size,
            @RequestParam(required = false) String sortBy,
            @RequestParam(defaultValue = "ASC") String sortDirection,
            @RequestParam(required = false) String documentType,
            @RequestParam(required = false) String documentCurrencyAmount,
            @RequestParam(required = false) String cgst,
            @RequestParam(required = false) String fiscalYear,
            @RequestParam(required = false) String transactionCode) {

        Page<InvoiceIntegrationView> invoicesPage = invoiceIntegrationsService.getInvoicesViewService(
                page, size, sortBy, sortDirection, documentType, documentCurrencyAmount, cgst, fiscalYear, transactionCode);

        Map<String, Object> response = new HashMap<>();
        response.put("totalRecords", invoicesPage.getTotalElements());
        response.put("pageSize", invoicesPage.getSize());
        response.put("currentPage", invoicesPage.getNumber());
        response.put("totalPages", invoicesPage.getTotalPages());
        response.put("data", invoicesPage.getContent());

        return ResponseEntity.ok(response);
    }
}