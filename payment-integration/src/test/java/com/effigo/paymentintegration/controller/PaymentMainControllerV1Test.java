//package com.effigo.paymentintegration.controller;
//
//import com.effigo.paymentintegration.config.MultiTenantManager;
//import com.effigo.paymentintegration.service.CreditDebitService;
//import com.effigo.paymentintegration.service.InvoiceIntegrationsService;
//import com.effigo.paymentintegration.service.PaymentService;
//import com.effigo.shared.dto.v1.CreditDebitDtoV1;
//import com.effigo.shared.dto.v1.CreditDebitExternalResponseDtoV1;
//import com.effigo.shared.dto.v1.CreditDebitResponseDtoV1;
//import com.effigo.shared.dto.v1.InvoiceIntegrtations.InvoiceIntegrationInternalDtoV1;
//import com.effigo.shared.dto.v1.InvoiceIntegrtations.InvoiceIntegrationsResponseV1;
//import com.effigo.shared.dto.v1.PaymentMainDtoV1;
//import com.effigo.shared.util.ApiResponse;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.Mockito;
//import org.mockito.junit.jupiter.MockitoExtension;
//import org.postgresql.util.PSQLException;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//
//import java.math.BigDecimal;
//import java.sql.Timestamp;
//import java.time.Instant;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.UUID;
//
//import static org.mockito.Mockito.when;
//
//@ExtendWith(MockitoExtension.class)
//public class PaymentMainControllerV1Test {
//    @InjectMocks
//    private PaymentMainControllerV1 paymentMainControllerV1;
//    @Mock
//    private PaymentService paymentService;
//    @Mock
//    private InvoiceIntegrationsService invoiceIntegrationsService;
//    @Mock
//    private MultiTenantManager multiTenantManager;
//    @Mock
//    private CreditDebitService creditDebitService;
//
//
//
//    @Test
//    void addPaymentsBs() throws PSQLException {
//        List<PaymentMainDtoV1> body =new ArrayList<>();
//        PaymentMainDtoV1 b1;
//        b1 = PaymentMainDtoV1.builder()
//                .poId("5001")
//                .vendorCode("82967")
//                .invoiceDocument("5105647634")
//                .invoiceDate(Timestamp.from(Instant.now()))
//                .invoiceQuantity(2000)
//                .invoiceBasicAmount(BigDecimal.valueOf(1540))
//                .invoiceTaxAmount(BigDecimal.valueOf(259.2))
//                .invoiceTotalAmount(BigDecimal.valueOf(1699.2))
//                .vendorInvoiceNumber("1480")
//                .paymentDocumentNumber(UUID.randomUUID().toString())
//                .paymentDate(Timestamp.from(Instant.now()))
//                .build();
//        body.add(b1);
//        Mockito.when(paymentService.addPayments(body)).thenReturn(ApiResponse.builder().status(HttpStatus.OK).success(true).build());
//        ResponseEntity<ApiResponse> actualResponse = paymentMainControllerV1.addPayments(body, "varroc");
//        Assertions.assertEquals(actualResponse.getBody().getSuccess(),true);
//
//    }
//    @Test
//    void addPaymentsNonUniquePaymentDocId() throws PSQLException {
//        List<PaymentMainDtoV1> body =new ArrayList<>();
//        PaymentMainDtoV1 b1;
//        b1 = PaymentMainDtoV1.builder()
//                .poId("5001")
//                .vendorCode("82967")
//                .invoiceDocument("5105647634")
//                .invoiceDate(Timestamp.from(Instant.now()))
//                .invoiceQuantity(2000)
//                .invoiceBasicAmount(BigDecimal.valueOf(1540))
//                .invoiceTaxAmount(BigDecimal.valueOf(259.2))
//                .invoiceTotalAmount(BigDecimal.valueOf(1699.2))
//                .vendorInvoiceNumber("1480")
//                .paymentDocumentNumber("090a0x0222xcdsf_20asvkazxicSDghj0")
//                .paymentDate(Timestamp.from(Instant.now()))
//                .build();
//        body.add(b1);
//        Mockito.when(paymentService.addPayments(body)).thenReturn(ApiResponse.builder().status(HttpStatus.OK).success(false).build());
//        ResponseEntity<ApiResponse> actualResponse = paymentMainControllerV1.addPayments(body, "varroc");
//        Assertions.assertEquals(actualResponse.getBody().getSuccess(),false);
//
//    }
//    @Test
//    void getPaymentsBs() throws PSQLException {
//        Mockito.when(paymentService.getPayments()).thenReturn(ApiResponse.builder().status(HttpStatus.OK).success(true).build());
//        ResponseEntity<ApiResponse> actualResponse = paymentMainControllerV1.getPayments("varroc");
//        Assertions.assertEquals(actualResponse.getBody().getSuccess(),true);
//
//    }
//    @Test
//    void getPaymentsViewNotCreated() throws PSQLException {
//        Mockito.when(paymentService.getPayments()).thenReturn(ApiResponse.builder().status(HttpStatus.INTERNAL_SERVER_ERROR).success(false).build());
//        ResponseEntity<ApiResponse> actualResponse = paymentMainControllerV1.getPayments("varroc");
//        Assertions.assertEquals(actualResponse.getBody().getSuccess(),false);
//        Assertions.assertEquals(actualResponse.getBody().getStatus(),HttpStatus.INTERNAL_SERVER_ERROR);
//
//    }
//    @Test
//    void addInvoicesBs() throws PSQLException {
//        List<InvoiceIntegrationInternalDtoV1> body =new ArrayList<>();
//        InvoiceIntegrationInternalDtoV1 b1;
//        b1 = InvoiceIntegrationInternalDtoV1.builder()
//                .companyCode("qw")
//                .invoiceDocumentNumber("124")
//                .invoiceDocumentItem("12")
//                .fiscalYear("1010")
//                .documentType("sd")
//                .documentCurrencyAmount("saf")
//                .transactionCode("1234")
//                .transactionType("ndaf")
//                .referenceDocumentNumber("123")
//                .purchaseDocumentNumber("1wdq")
//                .purchaseDocumentItem("test")
//                .documentCurrencyAmount("test")
//                .accountingDocumentNumber("test")
//                .postingDate("test")
//                .fiscalPeriod("test")
//                .objectKey("test")
//                .quantity("test")
//                .purchaseOrderUom("test")
//                .plant("test")
//                .materialNumber("test")
//                .referenceDocument("test")
//                .referenceDocumentItem("test")
//                .fiscalYearCurrentPeriod("test")
//                .sgst("test")
//                .cgst("test")
//                .igst("test")
//                .tcs("test")
//                .tds("test")
//                .grossDocumentValue("test")
//                .materialDocumentNumber("test")
//                .materialDocumentItem("test")
//                .deliveryNoteQuantity("test")
//                .unitEntryQuantity("test")
//                .serviceCode("test")
//                .serviceLine("test")
//                .entryTime("test")
//                .entryDate("test")
//                .customField1("test")
//                .build();
//        body.add(b1);
//        List<InvoiceIntegrationsResponseV1> response=new ArrayList<>();
//        response.add(InvoiceIntegrationsResponseV1.builder()
//                        .invoiceDocumentNumber(b1.getInvoiceDocumentNumber())
//                        .invoiceDocumentItem(b1.getInvoiceDocumentItem())
//                        .fiscalYear(b1.getFiscalYear())
//                        .createdOn(new Timestamp(System.currentTimeMillis()))
//                        .createdAt(new Timestamp(System.currentTimeMillis()))
//                .build());
//        Mockito.when(invoiceIntegrationsService.addInvoices(body)).thenReturn(response);
//        ResponseEntity<List<InvoiceIntegrationsResponseV1>> actualResponse = paymentMainControllerV1.addInvoices(body, "varroc");
//        Assertions.assertEquals(response,response);
//
//    }
//
//    @Test
//    void saveCreditDebit(){
//        CreditDebitExternalResponseDtoV1 responseDtoV1 = new CreditDebitExternalResponseDtoV1();
//        List<CreditDebitResponseDtoV1> response = new ArrayList<>();
//        CreditDebitResponseDtoV1 creditDebitResponseDtoV1 = new CreditDebitResponseDtoV1();
//        creditDebitResponseDtoV1 = CreditDebitResponseDtoV1.builder()
//                .accountingDocNo("invoiceDocNo")
//                .fiscalYear("2023").build();
//        response.add(creditDebitResponseDtoV1);
//        responseDtoV1.setCreditDebitResponseDtoV1List(response);
//        List<CreditDebitDtoV1> creditDebitDtoV1List = new ArrayList<>();
//        CreditDebitDtoV1 creditDebitDtoV1;
//        creditDebitDtoV1=CreditDebitDtoV1.builder().build();
//        creditDebitDtoV1List.add(creditDebitDtoV1);
//        Mockito.when(creditDebitService.saveCreditDebitDetails(creditDebitDtoV1List)).thenReturn(responseDtoV1);
//        ResponseEntity<CreditDebitExternalResponseDtoV1> actualResponse = paymentMainControllerV1.saveCreditDebitDetails(creditDebitDtoV1List,"varroc");
//        Assertions.assertEquals(responseDtoV1,actualResponse.getBody());
//    }
//
//    @Test
//    void getInvoices() throws PSQLException{
//        List<InvoiceIntegrationInternalDtoV1> invoiceIntegrationInternalDtoV1s = new ArrayList<>();
//        when(invoiceIntegrationsService.getInvoices()).thenReturn(invoiceIntegrationInternalDtoV1s);
//        ResponseEntity<List<InvoiceIntegrationInternalDtoV1>> listResponseEntity = paymentMainControllerV1.getInvoices("tenant");
//        Assertions.assertEquals(listResponseEntity.getBody(),invoiceIntegrationInternalDtoV1s);
//
//    }
//
//}
