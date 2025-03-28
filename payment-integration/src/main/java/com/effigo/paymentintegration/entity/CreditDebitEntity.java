package com.effigo.paymentintegration.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Table(name = "credit_debit",schema="upeg")
public class CreditDebitEntity {

    private static final long serialVersionUID = -7741829430806942260L;

    @Id
    @GeneratedValue(generator="system-uuid")
    @GenericGenerator(name="system-uuid", strategy = "uuid")
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
    private BigDecimal docCurrencyAmount;
    @Column(name = "cgst")
    private BigDecimal cgst;
    @Column(name = "sgst")
    private BigDecimal sgst;
    @Column(name = "igst")
    private BigDecimal igst;
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
    private BigDecimal localCurrencyAmount;
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
    private BigDecimal quantity;
    @Column(name = "uom")
    private String uom;
    @Column(name = "hsn_code")
    private String hsnCode;
    @Column(name = "rate")
    private BigDecimal rate;
    @Column(name = "plant")
    private String plant;
    @CreationTimestamp
    @Column(name = "createdDate",updatable = false)
    private Timestamp createdDate;
    @Column(name = "status")
    private boolean status;
}
