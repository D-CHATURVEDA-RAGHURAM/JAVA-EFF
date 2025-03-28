package com.effigo.paymentintegration.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Table(name = "invoice_header", schema = "upeg")
@IdClass(InvoiceHeaderIdEntity.class)
public class InvoiceHeader {



	@Column(name = "header_inv_doc_no")
	private String invDocNo;
	@Id
	@Column(name = "header_fiscal_year")
	private String fiscalYear;
	@Column(name = "header_document_type")
	private String documentType;
	@Column(name = "header_transaction_type")
	private String transactionType;
	@Column(name = "header_reversal_doc")
	private String reversalDoc;
	@Column(name = "header_reverse_year")
	private String reverseYear;
	@Column(name = "header_purchase_doc")
	private String purchaseDoc;
	@Id
	@Column(name = "header_fi_document")
	private String fiDocument;
	@Id
	@Column(name = "header_posting_date")
	private String postingDate;
	@Column(name = "header_awkey")
	private String awkey;
	@Column(name = "header_plant")
	private String plant;
	@Column(name = "header_ref_doc")
	private String refDoc;
	@Column(name = "header_mat_doc")
	private String matDoc;
	@Column(name = "header_tax_amount")
	private String taxAmount;
	@Column(name = "header_total_amount")
	private String totalAmount;
	@Column(name = "hedaer_basic_amount")
	private String basicAmount;
	@Column(name = "cusfield1")
	private String cusfield1;
	@Column(name = "cusfield2")
	private String cusfield2;
	@Column(name = "cusfield3")
	private String cusfield3;
	@Column(name = "cusfield4")
	private String cusfield4;
	@Column(name = "cusfield5")
	private String cusfield5;
	@Column(name = "cusfield6")
	private String cusfield6;

}
