package com.effigo.paymentintegration.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.UUID;

//Create table query: need to create table before executing any operations related to payments-integration
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "invoice_integrations", schema = "upeg")
public class InvoiceIntegrations {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid2")
    @Column(name = "invoice_integrations_id")
    private UUID invoiceIntegrationsId;
    @Column(name = "company_code")
    private String companyCode;
    @Column(name = "inv_doc_no")
    private String invoiceDocumentNumber;
    @Column(name = "inv_doc_item")
    private String invoiceDocumentItem;
    @Column(name = "fiscal_year")
    private String fiscalYear;
    @Column(name = "document_type")
    private String documentType;
    @Column(name = "doc_posting_date")
    private String documentPostingDate;
    @Column(name = "transaction_code")
    private String transactionCode;
    @Column(name = "transaction_type")
    private String transactionType;
    @Column(name = "ref_doc_no")
    private String referenceDocumentNumber;
    @Column(name = "purchase_doc_no")
    private String purchaseDocumentNumber;
    @Column(name = "purchase_doc_item")
    private String purchaseDocumentItem;
    @Column(name = "doc_currency_amount")
    private String documentCurrencyAmount;
    @Column(name = "accounting_doc_no")
    private String accountingDocumentNumber;
    @Column(name = "posting_date")
    private String postingDate;
    @Column(name = "fiscal_period")
    private String fiscalPeriod;
    @Column(name = "obj_key")
    private String objectKey;
    @Column(name = "quantity")
    private String quantity;
    @Column(name = "po_uom")
    private String purchaseOrderUom;
    @Column(name = "plant")
    private String plant;
    @Column(name = "material_no")
    private String materialNumber;
    @Column(name = "ref_doc")
    private String referenceDocument;
    @Column(name = "ref_doc_item")
    private String referenceDocumentItem;
    @Column(name = "fiscal_year_curr_period")
    private String fiscalYearCurrentPeriod;
    @Column(name = "s_gst")
    private String sgst;
    @Column(name = "c_gst")
    private String cgst;
    @Column(name = "i_gst")
    private String igst;
    @Column(name = "tcs")
    private String tcs;
    @Column(name = "tds")
    private String tds;
    @Column(name = "gross_doc_val")
    private String grossDocumentValue;
    @Column(name = "material_doc_no")
    private String materialDocumentNumber;
    @Column(name = "material_doc_item")
    private String materialDocumentItem;
    @Column(name = "dn_quantity")
    private String deliveryNoteQuantity;
    @Column(name = "dn_uom")
    private String deliveryNoteUom;
    @Column(name = "unit_entry_quantity")
    private String unitEntryQuantity;
    @Column(name = "service_code")
    private String serviceCode;
    @Column(name = "service_line")
    private String serviceLine;
    @Column(name = "entry_time")
    private String entryTime;
    @Column(name = "entry_date")
    private String entryDate;
    @Column(name = "cus_field_1")
    private String customField1;
    @Column(name = "cus_field_2")
    private String customField2;
    @Column(name = "cus_field_3")
    private String customField3;
    @Column(name = "cus_field_4")
    private String customField4;
    @Column(name = "cus_field_5")
    private String customField5;
    @Column(name = "cus_field_6")
    private String customField6;
    @Column(name = "cus_field_7")
    private String customField7;
    @Column(name = "cus_field_8")
    private String customField8;
    @Column(name = "cus_field_9")
    private String customField9;
    @Column(name = "cus_field_10")
    private String customField10;
    @Column(name = "reversal_doc")
    private String reversalDoc;
    @Column(name = "reverse_year")
    private String reverseYear;
    @CreationTimestamp
    @Column(name = "createdDate",updatable = false)
    private Timestamp createdDate;
    @Column(name = "currency")
    private String currency;
    @Column(name = "status")
    private boolean status;
}


