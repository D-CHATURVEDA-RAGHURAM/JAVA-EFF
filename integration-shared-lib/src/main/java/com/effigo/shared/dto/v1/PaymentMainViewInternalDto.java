package com.effigo.shared.dto.v1;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@Data

@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class PaymentMainViewInternalDto {

	private String poId;
	private String vendorCode;
	private String invoiceDocument;
	private String invoiceDate;
	private String invoiceQuantity;
	private String invoiceBasicAmount;
	private String invoiceTaxAmount;
	private String invoiceTotalAmount;
	private String vendorInvoiceNumber;
	private String paymentDocumentNumber;
	private String paymentDate;
	private String companyName;
	private String vendorInvDate;
	private String currency;
	private String customField1;
	private String customField2;
	private String customField3;
	private String customField4;
	private String customField5;
	private String customField6;
	private String customField7;
	private String customField8;
	private String customField9;
	private String customField10;
	private String asnYear;
	private String customField11;

	private String customField12;

	private String customField13;

	private String customField14;

	private String customField15;

	private String customField16;

	private String customField17;

	private String customField118;

	private String customField19;

	private String customField20;

	private String creditDebitInd;

	private String advanceInd;

	private String fiDocPostingDate;

	private String fiDocDocDate;

	private String clearingDocNo;

	private String businessUnit;

	private String postingKey;
}
