package com.effigo.shared.dto.v1.InvoiceIntegrtations;

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
public class InvoiceInternalDtoV1 {
	private String companyCode;
	private String invoiceDocumentNumber;
	private String invoiceDocumentItem;
	private String fiscalYear;
	private String documentType;
	private String documentPostingDate;
	private String transactionCode;
	private String transactionType;
	private String referenceDocumentNumber;
	private String purchaseDocumentNumber;
	private String purchaseDocumentItem;
	private String documentCurrencyAmount;
	private String accountingDocumentNumber;
	private String postingDate;
	private String fiscalPeriod;
	private String objectKey;
	private String quantity;
	private String purchaseOrderUom;
	private String plant;
	private String materialNumber;
	private String referenceDocument;
	private String referenceDocumentItem;
	private String fiscalYearCurrentPeriod;
	private String sgst;
	private String cgst;
	private String igst;
	private String tcs;
	private String tds;
	private String grossDocumentValue;
	private String materialDocumentNumber;
	private String materialDocumentItem;
	private String deliveryNoteQuantity;
	private String deliveryNoteUom;
	private String unitEntryQuantity;
	private String serviceCode;
	private String serviceLine;
	private String entryTime;
	private String entryDate;
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
	private String reversalDoc;
	private String reverseYear;
	private String companyName;
	private String currency;
	private String businessUnit;
	private String grnDate;
	private String materialDescription;
	private String asnId;
	private String dispatchDoc;
	private String supplierId;
}
