package com.effigo.paymentintegration.entity;

import com.effigo.shared.dto.v1.InvoiceIntegrtations.*;
import com.effigo.shared.dto.v1.InvoiceIntegrtations.InvoiceInternalViewDto;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.ConstructorResult;
import javax.persistence.ColumnResult;
import javax.persistence.SqlResultSetMapping;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

//@NamedNativeQuery(
//        name = "InvoiceIntegrationView.findInvoices",
//        query = """
//            SELECT 
//                CAST(i.invoice_integrations_id AS TEXT) AS invoice_integrations_id, 
//                i.company_code, 
//                i.inv_doc_no, 
//                i.inv_doc_item, 
//                i.fiscal_year, 
//                i.document_type, 
//                CAST(i.doc_currency_amount AS TEXT) AS doc_currency_amount, 
//                CAST(i.c_gst AS TEXT) AS c_gst, 
//                CAST(i.s_gst AS TEXT) AS s_gst, 
//                CAST(i.i_gst AS TEXT) AS i_gst, 
//                CAST(i.tcs AS TEXT) AS tcs, 
//                CAST(i.tds AS TEXT) AS tds, 
//                CAST(i.gross_doc_val AS TEXT) AS gross_doc_val, 
//                t.title, 
//                i.transaction_code  
//            FROM upeg.invoice_integrations_view i  
//            LEFT JOIN upeg.invoice_integrations_titles_view t  
//            ON i.document_type = t.field  
//            WHERE (:documentType IS NULL OR i.document_type = :documentType)  
//            AND (:documentCurrencyAmount IS NULL OR i.doc_currency_amount = :documentCurrencyAmount)  
//            AND (:cgst IS NULL OR i.c_gst = :cgst)  
//            AND (:fiscalYear IS NULL OR i.fiscal_year = :fiscalYear)  
//            AND (:transactionCode IS NULL OR i.transaction_code = :transactionCode)
//        """,
//        resultSetMapping = "Mapping.InvoiceIntegrationsViewDtoV1"
//)
//
//@SqlResultSetMapping(
//        name = "Mapping.InvoiceIntegrationsViewDtoV1",
//        classes = @ConstructorResult(
//                targetClass = InvoiceIntegrationsViewDtoV1.class,
//                columns = {
//                        @ColumnResult(name = "invoice_integrations_id", type = String.class),
//                        @ColumnResult(name = "company_code", type = String.class),
//                        @ColumnResult(name = "inv_doc_no", type = String.class),
//                        @ColumnResult(name = "inv_doc_item", type = String.class),
//                        @ColumnResult(name = "fiscal_year", type = String.class),
//                        @ColumnResult(name = "document_type", type = String.class),
//                        @ColumnResult(name = "doc_currency_amount", type = String.class),
//                        @ColumnResult(name = "c_gst", type = String.class),
//                        @ColumnResult(name = "s_gst", type = String.class),
//                        @ColumnResult(name = "i_gst", type = String.class),
//                        @ColumnResult(name = "tcs", type = String.class),
//                        @ColumnResult(name = "tds", type = String.class),
//                        @ColumnResult(name = "gross_doc_val", type = String.class),
//                        @ColumnResult(name = "title", type = String.class),
//                        @ColumnResult(name = "transaction_code", type = String.class)
//                }
//        )
//)

@Entity
@Table(name = "invoice_integrations_view", schema = "upeg")
public class InvoiceIntegrationView {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "invoice_integrations_id")
    private String invoiceIntegrationId;
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
    @JsonProperty("reversal_doc")
    private String reversalDoc;
    @JsonProperty("reverse_year")
    private String reverseYear;
    @JsonProperty("company_id")
    private String companyId;
    @JsonProperty("internal_company_id")
    private String internalCompanyId;
    @JsonProperty("company_name")
    private String companyName;
    @Column(name = "business_unit")
    private String businessUnit;
    @JsonProperty("created_date")
    private String createdDate;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("grn_date")
    private String grnDate;
    @JsonProperty("material_description")
    private String materialDescription;
    @Column(name = "asn_id")
    private String asnId;
    @Column(name = "dispatch_doc_name")
    private String dispatchDoc;
    @Column(name = "supplier_id")
    private String supplierId;
}