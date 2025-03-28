package com.effigo.shared.dto.external.v8;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

    @Builder
    @AllArgsConstructor
    @Data
    @NoArgsConstructor
    @JsonIgnoreProperties(ignoreUnknown = true)
    public class PaymentMainDtoV8 {
        @JsonProperty("PO_NUMBER")
        private String poId;
        @JsonProperty("VENDOR_CODE")
        private String vendorCode;
        @JsonProperty("IV_DOCUMENT")
        private String invoiceDocument;
        @JsonProperty("IV_DATE")
        private String invoiceDate;
        @JsonProperty("IV_QUANTITY")
        public BigDecimal invoiceQuantity;
        @JsonProperty("IV_BASIC_AMOUNT")
        private BigDecimal invoiceBasicAmount;
        @JsonProperty("IV_TAX_AMOUNT")
        private BigDecimal invoiceTaxAmount;
        @JsonProperty("IV_TOTAL_AMOUNT")
        private BigDecimal invoiceTotalAmount;
        @JsonProperty("VENDOR_INVOICE_NUMBER")
        private String vendorInvoiceNumber;
        @JsonProperty("PAYMENT_DOC_NUMBER")
        private String paymentDocumentNumber;
        @JsonProperty("PAYMENT_DATE")
        private String paymentDate;
        @JsonProperty("VENDOR_INV_DATE")
        private String vendorInvoiceDate;
        @JsonProperty("CURRENCY")
        private String currency;
        @JsonProperty("ADV_ADJUSTMENT")
        private String customField1;
        @JsonProperty("PAYMENT_POSTING_DATE")
        private String customField2;
        @JsonProperty("PO_ITEM_NO")
        private String customField3;
        @JsonProperty("FIELD4")
        private String customField4;
        @JsonProperty("FIELD5")
        private String customField5;
        @JsonProperty("FIELD6")
        private String customField6;
        @JsonProperty("FIELD7")
        private String customField7;
        @JsonProperty("PAYMENT_PAID_AMT")
        private String customField8;
        @JsonProperty("UTR_NUMBER")
        private String customField9;
        @JsonProperty("TDS")
        private String customField10;
        @JsonProperty("DOCUMENT")
        private String document;

        @Override
        public String toString() {
            return "PaymentMainDtoV1{" +
                    "poId='" + poId + '\'' +
                    ", vendorCode='" + vendorCode + '\'' +
                    ", invoiceDocument='" + invoiceDocument + '\'' +
                    ", invoiceDate='" + invoiceDate + '\'' +
                    ", invoiceQuantity=" + invoiceQuantity +
                    ", invoiceBasicAmount=" + invoiceBasicAmount +
                    ", invoiceTaxAmount=" + invoiceTaxAmount +
                    ", invoiceTotalAmount=" + invoiceTotalAmount +
                    ", vendorInvoiceNumber='" + vendorInvoiceNumber + '\'' +
                    ", paymentDocumentNumber='" + paymentDocumentNumber + '\'' +
                    ", paymentDate='" + paymentDate + '\'' +
                    ", vendorInvoiceDate='" + vendorInvoiceDate + '\'' +
                    ", currency='" + currency + '\'' +
                    ", customField1='" + customField1 + '\'' +
                    ", customField2='" + customField2 + '\'' +
                    ", customField3='" + customField3 + '\'' +
                    ", customField4='" + customField4 + '\'' +
                    ", customField5='" + customField5 + '\'' +
                    ", customField6='" + customField6 + '\'' +
                    ", customField7='" + customField7 + '\'' +
                    ", customField8='" + customField8 + '\'' +
                    ", customField9='" + customField9 + '\'' +
                    ", customField10='" + customField10 + '\'' +
                    '}';
        }
    }

