package com.effigo.shared.dto.V5;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Builder
@AllArgsConstructor
@Data
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class InvoiceIntegrationDtoV5 implements Serializable {

	private static final long serialVersionUID = -6864273707059683510L;

	@JsonProperty("ZBELNR")
	private String invoiceDocumentNumber;

	@JsonProperty("ZGJAHR")
	private String fiscalYear;

	@JsonProperty("ZBLDAT")
	private String documentPostingDate;

	@JsonProperty("ZBUDAT")
	private String postingDate;

	@JsonProperty("ZXBLNR")
	private String accountingDocumentNumber;

	@JsonProperty("ZLIFNR")
	private String plant;

	@JsonProperty("ZBUZEI")
	private String invoiceDocumentItem;

	@JsonProperty("ZMATNR")
	private String materialDocumentNumber;

	@JsonProperty("ZMAKTX")
	private String materialDocumentItem;

	@JsonProperty("ZMENGE")
	private String quantity;

	@JsonProperty("ZNETPR")
	private String documentCurrencyAmount;

	@JsonProperty("ZWRBTR")
	private String grossDocumentValue;

	@JsonProperty("ZEBELN")
	private String purchaseDocumentNumber;

	@JsonProperty("ZEBELP")
	private String purchaseDocumentItem;

	@JsonProperty("ZMENGE_PO")
	private String deliveryNoteQuantity;

	@JsonProperty("ZBLART")
	private String documentType;

	@JsonProperty("ZBSTME")
	private String purchaseOrderUom;

	@JsonProperty("ZWAERS")
	private String currency;

	@JsonProperty("ZKTEXT")
	private String customField1;

	@JsonProperty("ZSHKZG")
	private String customField2;

	@JsonProperty("ZERNAM")
	private String customField3;

	//	---------------
	@JsonProperty("BUKRS")
	private String companyCode;

	@JsonProperty("MATERIAL_CODE")
	private String materialNumber;

	@JsonProperty("TCODE")
	private String transactionCode;

	@JsonProperty("TRANSACTION_TYPE")
	private String transactionType;

	@JsonProperty("FI_DOCUMENT")
	private String referenceDocumentNumber;

	@JsonProperty("PERIOD")
	private String fiscalPeriod;

	@JsonProperty("AWKEY")
	private String objectKey;

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

}
