package com.effigo.shared.dto.v1.InvoiceIntegrtations;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@Data
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class InvoiceIntegrationInternalViewDto {

	@JsonProperty("BUKRS")
	private String companyCode;
	@JsonProperty("MIRO_DOC_NUMBER")
	private String invoiceDocumentNumber;
	@JsonProperty("MIRO_DOC_ITEM")
	private String invoiceDocumentItem;
	@JsonProperty("FISCAL_YEAR")
	private String fiscalYear;
	@JsonProperty("DOCUMENT_TYPE")
	private String documentType;
	@JsonProperty("DOC_POSTING_DATE")
	private String documentPostingDate;
	@JsonProperty("TCODE")
	private String transactionCode;
	@JsonProperty("TRANSACTION_TYPE")
	private String transactionType;
	@JsonProperty("XBLNR")
	private String referenceDocumentNumber;
	@JsonProperty("PURCHASE_DOC")
	private String purchaseDocumentNumber;
	@JsonProperty("PURCHASE_ITEM")
	private String purchaseDocumentItem;
	@JsonProperty("LINE_ITEM_VAL")
	private String documentCurrencyAmount;
	@JsonProperty("FI_DOCUMENT")
	private String accountingDocumentNumber;
	@JsonProperty("POSTING_DATE")
	private String postingDate;
	@JsonProperty("PERIOD")
	private String fiscalPeriod;
	@JsonProperty("AWKEY")
	private String objectKey;
	@JsonProperty("MIRO_QUANTITY")
	private String quantity;
	@JsonProperty("UNIT_OF_MEASURE")
	private String purchaseOrderUom;
	@JsonProperty("PLANT")
	private String plant;
	@JsonProperty("MATERIAL_CODE")
	private String materialNumber;
	@JsonProperty("REF_DOC")
	private String referenceDocument;
	@JsonProperty("REF_DOC_ITEM")
	private String referenceDocumentItem;
	@JsonProperty("ZYEAR")
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
	@JsonProperty("GROSS_DOCUMENT_VALUE")
	private String grossDocumentValue;
	@JsonProperty("MAT_DOC")
	private String materialDocumentNumber;
	@JsonProperty("MAT_DOC_ITEM")
	private String materialDocumentItem;
	@JsonProperty("DN_QUANTITY")
	private String deliveryNoteQuantity;
	@JsonProperty("DN_UOM")
	private String deliveryNoteUom;
	@JsonProperty("ERFMG")
	private String unitEntryQuantity;
	@JsonProperty("SERVICE_CODE")
	private String serviceCode;
	@JsonProperty("SERVICE_LINE")
	private String serviceLine;
	@JsonProperty("ENTERED_AT")
	private String entryTime;
	@JsonProperty("ENTERED_ON_DATE")
	private String entryDate;
	@JsonProperty("FIELD1")
	private String customField1;
	@JsonProperty("FIELD2")
	private String customField2;
	@JsonProperty("FIELD3")
	private String customField3;
	@JsonProperty("FIELD4")
	private String customField4;
	@JsonProperty("FIELD5")
	private String customField5;
	@JsonProperty("FIELD6")
	private String customField6;
	@JsonProperty("FIELD7")
	private String customField7;
	@JsonProperty("FIELD8")
	private String customField8;
	@JsonProperty("FIELD9")
	private String customField9;
	@JsonProperty("FIELD10")
	private String customField10;
	@JsonProperty("REVERSAL_DOC")
	private String reversalDoc;
	@JsonProperty("REVERSE_YEAR")
	private String reverseYear;
	@JsonProperty("COMPANY_NAME")
	private String companyName;
	@JsonProperty("CURRENCY")
	private String currency;
}
