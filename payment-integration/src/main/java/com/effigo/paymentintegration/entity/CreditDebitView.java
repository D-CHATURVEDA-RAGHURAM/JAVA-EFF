package com.effigo.paymentintegration.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "v_credit_debit", schema = "upeg")
public class CreditDebitView {


	private static final long serialVersionUID = -448518692370909495L;
	@Id
	@Column(name = "credit_debit_id")
	private String creditDebitId;
	@Column(name = "company_code",nullable = false)
	private String companyCode;
	@Column(name = "fiscal_year")
	private String fiscalYear;
	@Column(name = "accounting_doc_no")
	private String accountingDocNo;
	@Column(name = "document_type")
	private String documentType;
	@Column(name = "document_date")
	private String documentDate;
	@Column(name = "posting_date")
	private String postingDate;
	@Column(name = "doc_currency_amount")
	private String docCurrencyAmount;
	@Column(name = "cgst")
	private String cgst;
	@Column(name = "sgst")
	private String sgst;
	@Column(name = "igst")
	private String igst;
	@Column(name = "material_no")
	private String materialNo;
	@Column(name = "material_desc")
	private String materialDesc;
	@Column(name = "gross")
	private String gross;
	@Column(name = "vendor_acc_no")
	private String vendorAccNo;
	@Column(name = "doc_lot_no")
	private String docLotNo;
	@Column(name = "assignment_no")
	private String assignmentNo;
	@Column(name = "doc_header_text")
	private String docHeaderText;
	@Column(name = "ref_doc_no")
	private String refDocNo;
	@Column(name = "item_text")
	private String itemText;
	@Column(name = "category")
	private String category;
	@Column(name = "read_text")
	private String readText;
	@Column(name = "invoice_doc_no")
	private String invoiceDocNo;
	@Column(name = "invoice_doc_year")
	private String invoiceDocYear;
	@Column(name = "rev_doc_no")
	private String revDocNo;
	@Column(name = "rev_doc_fiscal_year")
	private String revDocFiscalYear;
	@Column(name = "currency_key")
	private String currencyKey;
	@Column(name = "local_currency_amount")
	private String localCurrencyAmount;
	@Column(name = "field1")
	private String field1;
	@Column(name = "field2")
	private String field2;
	@Column(name = "field3")
	private String field3;
	@Column(name = "field4")
	private String field4;
	@Column(name = "field5")
	private String field5;
	@Column(name = "field6")
	private String field6;
	@Column(name = "field7")
	private String field7;
	@Column(name = "field8")
	private String field8;
	@Column(name = "field9")
	private String field9;
	@Column(name = "field10")
	private String field10;
	@Column(name = "quantity")
	private String quantity;
	@Column(name = "uom")
	private String uom;
	@Column(name = "hsn_code")
	private String hsnCode;
	@Column(name = "rate")
	private String rate;
	@Column(name = "plant")
	private String plant;
	@Column(name = "company_id")
	private String companyId;
	@Column(name="company_name")
	private String companyName;
	@Column(name="created_date")
	private String createdDate;
	@Column(name = "business_unit")
	private String businessUnit;


}
