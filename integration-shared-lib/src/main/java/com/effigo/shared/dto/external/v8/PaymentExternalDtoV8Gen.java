package com.effigo.shared.dto.external.v8;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PaymentExternalDtoV8Gen {
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
    private double paymentAmount;
    @JsonProperty("UTR_NUMBER")
    private String utrNumber;
    @JsonProperty("PAY_PDF_FILENAME")
    private String payPdfFilename;
    @JsonProperty("PAY_PDF_FILE")
    private String payPdfFile;
}
