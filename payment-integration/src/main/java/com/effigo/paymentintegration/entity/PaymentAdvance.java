package com.effigo.paymentintegration.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Table(name = "payment_advance",schema="upeg")
public class PaymentAdvance {
	
	  @Id
	  @GeneratedValue(generator="system-uuid")
	  @GenericGenerator(name="system-uuid", strategy = "uuid")
	  @Column(name = "payment_id")
	  private String paymenttId;
	 
	  @Column(name = "company_code")
	  private String companyCode;
	  
	  @Column(name = "vendor_no")
	  private String vendorNo;
	  
	  @Column(name = "clearing_doc")
	  private String clearingDoc;
	  
	  @Column(name = "clearing_date")
	  private String clearingDate;
	  
	  @Column(name = "clearing_year")
	  private String clearingYear;
	  
	  @Column(name = "fi_doc_no")
	  private String fiDocNo;
	  
	  @Column(name = "fi_doc_posting_date")
	  private String fiDocPostingDate;
	  
	  @Column(name = "fi_doc_doc_date")
	  private String fiDocDocDate;
	  
	  //fiscalYear
	  @Column(name = "fi_doc_year")
	  private String fiDocYear;
	  
	  @Column(name = "invoice_no")
	  private String invoiceNo;
	  
	  @Column(name = "amt")
	  private String amt;
	  
	  @Column(name = "tds")
	  private String tds;
	  
	  @Column(name = "gross_amount")
	  private String grossAmount;
	  
	  @Column(name = "advance_ind")
	  private String advanceInd;
	  
	  @Column(name = "debit_or_credit_ind")
	  private String debitOrCreditInd;
	  
	  @Column(name = "po_number")
	  private String poNumber;
	  
	  @Column(name = "po_item")
	  private String poItem;
	  
	  @Column(name = "currency")
	  private String currency;
	  
	  @Column(name = "rev_doc_no")
	  private String revDocNo;
	  
	  @Column(name = "rev_year")
	  private String revYear;
	  
	  @Column(name = "doc_category")
	  private String docCategory;
	  
	  @Column(name = "posting_key")
	  private String postingKey;
	  
	  @Column(name = "doc_type")
	  private String docType;
	  
	  @Column(name = "status")
	  private boolean status;
	  
	  @Column(name = "char_field1")
	  private String charField1;
	  
	  @Column(name = "char_field2")
	  private String charField2;

	  @Column(name = "char_field3")
	  private String charField3;
	  
	  @Column(name = "curreny_field1")
	  private String currenyField1;
	  
	  @Column(name = "curreny_field2")
	  private String currenyField2;
	  
	  @Column(name = "curreny_field3")
	  private String currenyField3;
	 
	  @Column(name = "date_field1")
	  private String dateField1;
	  
	  @Column(name = "date_field2")
	  private String dateField2;
	  
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

	  
	  


	  
	  

	  

}
