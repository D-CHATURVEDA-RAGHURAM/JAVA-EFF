package com.effigo.shared.dto.v1;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreditDebitDtoV1 {
	private String companyCode;
	private String fiscalYear;
	private String accountingDocNo;
	private String documentType;
	private String documentDate;
	private String postingDate;
	private String docCurrencyAmount;
	private String cgst;
	private String sgst;
	private String igst;
	private String materialNo;
	private String materialDesc;
	private String gross;
	private String vendorAccNo;
	private String docLotNo;
	private String assignmentNo;
	private String docHeaderText;
	private String refDocNo;
	private String itemText;
	private String category;
	private String readText;
	private String invoiceDocNo;
	private String invoiceDocYear;
	private String revDocNo;
	private String revDocFiscalYear;
	private String currencyKey;
	private String localCurrencyAmount;
	private String field1;
	private String field2;
	private String field3;
	private String field4;
	private String field5;
	private String field6;
	private String field7;
	private String field8;
	private String field9;
	private String field10;
	private String quantity;
	private String uom;
	private String hsnCode;
	private String rate;
	private String plant;
	private String businessUnit;
	private String purchaseDocNo;
	private String companyName;
}
