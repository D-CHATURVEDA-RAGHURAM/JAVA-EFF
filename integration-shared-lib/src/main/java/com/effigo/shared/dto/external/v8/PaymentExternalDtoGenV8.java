package com.effigo.shared.dto.external.v8;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PaymentExternalDtoGenV8 {

    @JsonProperty("PO_NUMBER")
    private String poNumber;

    @JsonProperty("VENDOR_CODE")
    private String vendorCode;

    @JsonProperty("DOC_NUM")
    private String documentNumber;

    @JsonProperty("DOC_DATE")
    private String documentDate;

    @JsonProperty("QUANTITY")
    private int quantity;

    @JsonProperty("BASIC_AMOUNT")
    private double basicAmount;

    @JsonProperty("TAX_AMOUNT")
    private double taxAmount;

    @JsonProperty("TOTAL_AMOUNT")
    private double totalAmount;

    @JsonProperty("VENDOR_INV_NUMBER")
    private String vendorInvoiceNumber;

    @JsonProperty("VENDOR_INV_DATE")
    private String vendorInvoiceDate;

    @JsonProperty("PAYMENT_DOC_NUMBER")
    private String paymentDocumentNumber;

    @JsonProperty("PAYMENT_DATE")
    private String paymentDate;

    @JsonProperty("CURRENCY")
    private String currency;

    @JsonProperty("PAYMENT_AMOUNT")
    private double invoicePaymentAmount;

    @JsonProperty("UTR_NUMBER")
    private String utrNumber;

    @JsonProperty("PAY_PDF_FILENAME")
    private String payPdfFilename;

    @JsonProperty("PAY_PDF_FILE")
    private String payPdfFile;

    @JsonProperty("BU_ID")
    private String customField1;

    @JsonProperty("PAYMENT_YEAR")
    private String customField2;

    @JsonProperty("DOC_YEAR")
    private String customField3;

    @JsonProperty("ADVANCE_INDICATOR")
    private String customField4;

    @JsonProperty("DEBIT_CREDIT_INDICATOR")
    private String customField5;

    @JsonProperty("PO_ITEM_NO")
    private String customField6;

    @JsonProperty("STATUS")
    private String customField7;

    @JsonProperty("REVERSAL_YEAR")
    private String customField8;

    @JsonProperty("DOCUMENT_CATEGORY")
    private String customField9;

    @JsonProperty("POSTING_KEY")
    private String customField10;

    @JsonProperty("RECORD_ID")
    private String customField11;

}

