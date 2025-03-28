package com.effigo.shared.dto.v1.InvoiceIntegrtations;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.poiji.annotation.ExcelCellName;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@Data
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class InvoiceIntegrationDtoV1 {
	@JsonProperty("BUKRS")
	@ExcelCellName("Company_Code")
	private String companyCode;

	@ExcelCellName("Invoice_Document_Number")
	@JsonProperty("MIRO_DOC_NUMBER")
	private String invoiceDocumentNumber;

	@ExcelCellName("Invoice_Document_Item")
	@JsonProperty("MIRO_DOC_ITEM")
	private String invoiceDocumentItem;

	@ExcelCellName("Fiscal_Year")
	@JsonProperty("FISCAL_YEAR")
	private String fiscalYear;

	@ExcelCellName("Document_Type")
	@JsonProperty("DOCUMENT_TYPE")
	private String documentType;

	@ExcelCellName("Document_Posting_Date")
	@JsonProperty("DOC_POSTING_DATE")
	private String documentPostingDate;

	@ExcelCellName("Transaction_Code")
	@JsonProperty("TCODE")
	private String transactionCode;

	@ExcelCellName("Transaction_Type")
	@JsonProperty("TRANSACTION_TYPE")
	private String transactionType;

	@ExcelCellName("Reference_Document_Number")
	@JsonProperty("XBLNR")
	private String referenceDocumentNumber;

	@ExcelCellName("PO_Number")
	@JsonProperty("PURCHASE_DOC")
	private String purchaseDocumentNumber;

	@ExcelCellName("PO_Item_Number")
	@JsonProperty("PURCHASE_ITEM")
	private String purchaseDocumentItem;

	@ExcelCellName("Line_Item_Value")
	@JsonProperty("LINE_ITEM_VAL")
	private String documentCurrencyAmount;

	@ExcelCellName("Accounting_Document_Number")
	@JsonProperty("FI_DOCUMENT")
	private String accountingDocumentNumber;

	@ExcelCellName("Posting_Date\r\n" + "")
	@JsonProperty("POSTING_DATE")
	private String postingDate;

	@ExcelCellName("Fiscal_period")
	@JsonProperty("PERIOD")
	private String fiscalPeriod;

	@ExcelCellName("Object_Key")
	@JsonProperty("AWKEY")
	private String objectKey;

	@ExcelCellName("Quantity")
	@JsonProperty("MIRO_QUANTITY")
	private String quantity;

	@ExcelCellName("PO_UOM")
	@JsonProperty("UNIT_OF_MEASURE")
	private String purchaseOrderUom;

	@ExcelCellName("Plant")
	@JsonProperty("PLANT")
	private String plant;

	@ExcelCellName("Material_Number")
	@JsonProperty("MATERIAL_CODE")
	private String materialNumber;

	@ExcelCellName("Reference_Document_Number")
	@JsonProperty("REF_DOC")
	private String referenceDocument;

	@ExcelCellName("Reference_Document_Item")
	@JsonProperty("REF_DOC_ITEM")
	private String referenceDocumentItem;

	@ExcelCellName("Fiscal_Year_of_Current_Period")
	@JsonProperty("ZYEAR")
	private String fiscalYearCurrentPeriod;

	@ExcelCellName("SGST")
	@JsonProperty("SGST")
	private String sgst;

	@ExcelCellName("CGST")
	@JsonProperty("CGST")
	private String cgst;

	@ExcelCellName("IGST")
	@JsonProperty("IGST")
	private String igst;

	@ExcelCellName("TCS")
	@JsonProperty("TCS")
	private String tcs;

	@ExcelCellName("TDS")
	@JsonProperty("TDS")
	private String tds;

	@ExcelCellName("Gross_Amount")
	@JsonProperty("GROSS_DOCUMENT_VALUE")
	private String grossDocumentValue;

	@ExcelCellName("Material_Document_Number")
	@JsonProperty("MAT_DOC")
	private String materialDocumentNumber;

	@ExcelCellName("Material_Document_Item")
	@JsonProperty("MAT_DOC_ITEM")
	private String materialDocumentItem;

	@ExcelCellName("Delivery_Note_Quantity")
	@JsonProperty("DN_QUANTITY")
	private String deliveryNoteQuantity;

	@ExcelCellName("Delivery_Note_UOM")
	@JsonProperty("DN_UOM")
	private String deliveryNoteUom;

	@ExcelCellName("Quantity_in_unit_of_entry")
	@JsonProperty("ERFMG")
	private String unitEntryQuantity;

	@ExcelCellName("Service_Code")
	@JsonProperty("SERVICE_CODE")
	private String serviceCode;

	@ExcelCellName("Service_Line")
	@JsonProperty("SERVICE_LINE")
	private String serviceLine;

	@ExcelCellName("Entry_Time")
	@JsonProperty("ENTERED_AT")
	private String entryTime;

	@ExcelCellName("Entry_Date")
	@JsonProperty("ENTERED_ON_DATE")
	private String entryDate;

	@ExcelCellName("Field1")
	@JsonProperty("FIELD1")
	private String customField1;

	@ExcelCellName("Field2")
	@JsonProperty("FIELD2")
	private String customField2;

	@ExcelCellName("Field3")
	@JsonProperty("FIELD3")
	private String customField3;

	@ExcelCellName("Field4")
	@JsonProperty("FIELD4")
	private String customField4;

	@ExcelCellName("Field5")
	@JsonProperty("FIELD5")
	private String customField5;

	@ExcelCellName("Field6")
	@JsonProperty("FIELD6")
	private String customField6;

	@ExcelCellName("Field7")
	@JsonProperty("FIELD7")
	private String customField7;

	@ExcelCellName("Field8")
	@JsonProperty("FIELD8")
	private String customField8;

	@ExcelCellName("Field9")
	@JsonProperty("FIELD9")
	private String customField9;

	@ExcelCellName("Field10")
	@JsonProperty("FIELD10")
	private String customField10;

	@ExcelCellName("Reversal_Document_Number")
	@JsonProperty("REVERSAL_DOC")
	private String reversalDoc;

	@ExcelCellName("Reversal_Document_Fiscal_year")
	@JsonProperty("REVERSE_YEAR")
	private String reverseYear;

	@ExcelCellName("Currency")
	@JsonProperty("CURRENCY")
	private String currency;
}
