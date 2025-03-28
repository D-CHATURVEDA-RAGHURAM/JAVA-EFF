package com.effigo.shared.dto.v1;

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
public class PaymentMainViewDtoV1 {

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
	private String invoiceBasicAmount;
	@JsonProperty("IV_TAX_AMOUNT")
	private String invoiceTaxAmount;
	@JsonProperty("IV_TOTAL_AMOUNT")
	private String invoiceTotalAmount;
	@JsonProperty("VENDOR_INVOICE_NUMBER")
	private String vendorInvoiceNumber;
	@JsonProperty("PAYMENT_DOC_NUMBER")
	private String paymentDocumentNumber;
	@JsonProperty("PAYMENT_DATE")
	private String paymentDate;
	@JsonProperty("COMPANY_NAME")
	private String companyName;
	@JsonProperty("VENDOR_INV_DATE")
	private String vendorInvDate;
	@JsonProperty("CURRENCY")
	private String currency;
	@JsonProperty("cus_field_1")
	private String customField1;
	@JsonProperty( "cus_field_2")
	private String customField2;
	@JsonProperty("cus_field_3")
	private String customField3;
	@JsonProperty( "cus_field_4")
	private String customField4;
	@JsonProperty("cus_field_5")
	private String customField5;
	@JsonProperty( "cus_field_6")
	private String customField6;
	@JsonProperty( "cus_field_7")
	private String customField7;
	@JsonProperty("cus_field_8")
	private String customField8;
	@JsonProperty("cus_field_9")
	private String customField9;
	@JsonProperty("cus_field_10")
	private String customField10;
	@JsonProperty("ASN_YEAR")
	private String asnYear;

	@JsonProperty("cus_field_11")
	private String customField11;

	@JsonProperty("cus_field_12")
	private String customField12;

	@JsonProperty("cus_field_13")
	private String customField13;

	@JsonProperty("cus_field_14")
	private String customField14;

	@JsonProperty("cus_field_15")
	private String customField15;

	@JsonProperty("cus_field_16")
	private String customField16;

	@JsonProperty("cus_field_17")
	private String customField17;

	@JsonProperty("cus_field_18")
	private String customField118;

	@JsonProperty("cus_field_19")
	private String customField19;

	@JsonProperty("cus_field_20")
	private String customField20;

	@JsonProperty("credit_debit_ind")
	private String creditDebitInd;

	@JsonProperty("advance_ind")
	private String advanceInd;

	@JsonProperty("fiDocPostingDate")
	private String fiDocPostingDate;

	@JsonProperty("fiDocDocDate")
	private String fiDocDocDate;

	@JsonProperty("clearingDocNo")
	private String clearingDocNo;

	@JsonProperty("businessUnit")
	private String businessUnit;

	@JsonProperty("postingKey")
	private String postingKey;
}
