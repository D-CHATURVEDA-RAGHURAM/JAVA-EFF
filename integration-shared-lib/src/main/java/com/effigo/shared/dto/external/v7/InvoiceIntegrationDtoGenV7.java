package com.effigo.shared.dto.external.v7;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class InvoiceIntegrationDtoGenV7 {

	@JsonProperty("companyCode")
	private String companyCode;

	@JsonProperty("invoiceDocumentNumber")
	private String invoiceDocumentNumber;

	@JsonProperty("invoiceDocumentItem")
	private String invoiceDocumentItem;

	@JsonProperty("fiscalYear")
	private String fiscalYear;

	@JsonProperty("documentType")
	private String documentType;

	@JsonProperty("documentPostingDate")
	private String documentPostingDate;

	@JsonProperty("transactionCode")
	private String transactionCode;

	@JsonProperty("transactionType")
	private String transactionType;

	@JsonProperty("reversalDoc")
	private String reversalDoc;

	@JsonProperty("reverseYear")
	private String reverseYear;

	@JsonProperty("referenceDocumentNumber")
	private String referenceDocumentNumber;

	@JsonProperty("purchaseDocumentNumber")
	private String purchaseDocumentNumber;

	@JsonProperty("purchaseDocumentItem")
	private String purchaseDocumentItem;

	@JsonProperty("documentCurrencyAmount")
	private String documentCurrencyAmount;

	@JsonProperty("accountingDocumentNumber")
	private String accountingDocumentNumber;

	@JsonProperty("postingDate")
	private String postingDate;

	@JsonProperty("fiscalPeriod")
	private String fiscalPeriod;

	@JsonProperty("objectKey")
	private String objectKey;

	@JsonProperty("quantity")
	private String quantity;

	@JsonProperty("currency")
	private String currency;

	@JsonProperty("purchaseOrderUom")
	private String purchaseOrderUom;

	@JsonProperty("plant")
	private String plant;

	@JsonProperty("materialNumber")
	private String materialNumber;

	@JsonProperty("referenceDocument")
	private String referenceDocument;

	@JsonProperty("referenceDocumentItem")
	private String referenceDocumentItem;

	@JsonProperty("fiscalYearCurrentPeriod")
	private String fiscalYearCurrentPeriod;

	@JsonProperty("SGST")
	private String sgst;

	@JsonProperty("CGST")
	private String cgst;

	@JsonProperty("IGST")
	private String igst;

	@JsonProperty("TCS")
	private String tcs;

	@JsonProperty("TDS")
	private String tds;

	@JsonProperty("grossDocumentValue")
	private String grossDocumentValue;

	@JsonProperty("materialDocumentNumber")
	private String materialDocumentNumber;

	@JsonProperty("materialDocumentItem")
	private String materialDocumentItem;

	@JsonProperty("deliveryNoteQuantity")
	private String deliveryNoteQuantity;

	@JsonProperty("deliveryNoteUom")
	private String deliveryNoteUom;

	@JsonProperty("unitEntryQuantity")
	private String unitEntryQuantity;

	@JsonProperty("serviceCode")
	private String serviceCode;

	@JsonProperty("serviceLine")
	private String serviceLine;

	@JsonProperty("entryTime")
	private String entryTime;

	@JsonProperty("entryDate")
	private String entryDate;

	@JsonProperty("cusField1")
	private String customField1;

	@JsonProperty("cusField2")
	private String customField2;

	@JsonProperty("cusField3")
	private String customField3;

	@JsonProperty("cusField4")
	private String customField4;

	@JsonProperty("cusField5")
	private String customField5;

	@JsonProperty("cusField6")
	private String customField6;

	@JsonProperty("cusField7")
	private String customField7;

	@JsonProperty("cusField8")
	private String customField8;

	@JsonProperty("cusField9")
	private String customField9;

	@JsonProperty("cusField10")
	private String customField10;

}
