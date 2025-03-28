package com.effigo.shared.dto.internal.v7;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.UUID;


@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@Builder
public class InternalPaymentDtoV7 {

    @JsonProperty("payment_id")
    private UUID paymentId;

            @JsonProperty("PO_NUMBER")
    private String poId;

            @JsonProperty("VENDOR_CODE")
    private String vendorCode;

            @JsonProperty("IV_DOCUMENT")
    private String invoiceDocument;

            @JsonProperty("IV_DATE")
    private String invoiceDate;

            @JsonProperty("IV_QUANTITY")
    private BigDecimal invoiceQuantity;

            @JsonProperty("IV_BASIC_AMOUNT")
    private BigDecimal invoiceBasicAmount;

            @JsonProperty("IV_TAX_AMOUNT")
    private BigDecimal invoiceTaxAmount;

            @JsonProperty("IV_TOTAL_AMOUNT")
    private BigDecimal invoiceTotalAmount;

    @JsonProperty("IV_PAYMENT_AMOUNT")
    private BigDecimal invoicePaymentAmount;

            @JsonProperty("VENDOR_INVOICE_NUMBER")
    private String vendorInvoiceNumber;

            @JsonProperty("PAYMENT_DOC_NUMBER")
    private String paymentDocumentNumber;

            @JsonProperty("PAYMENT_DATE")
    private String paymentDate;

            @JsonProperty("created_date")
    private Timestamp createdDate;

            @JsonProperty("VENDOR_INV_DATE")
    private String vendorInvoiceDate;

            @JsonProperty("CURRENCY")
    private String currency;

            @JsonProperty("cus_field_1")
    private String customField1;

            @JsonProperty("cus_field_2")
    private String customField2;

            @JsonProperty("cus_field_3")
    private String customField3;

            @JsonProperty("cus_field_4")
    private String customField4;

            @JsonProperty("cus_field_5")
    private String customField5;

            @JsonProperty("cus_field_6")
    private String customField6;

            @JsonProperty("cus_field_7")
    private String customField7;

            @JsonProperty("cus_field_8")
    private String customField8;

            @JsonProperty("cus_field_9")
    private String customField9;

            @JsonProperty("cus_field_10")
    private String customField10;

    @JsonProperty("RECORD_ID")
    private String customField11;

    @JsonProperty("updated_date")
    private Timestamp updatedDate;

}

