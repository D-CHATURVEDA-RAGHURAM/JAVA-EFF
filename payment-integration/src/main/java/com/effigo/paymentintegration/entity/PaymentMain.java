package com.effigo.paymentintegration.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.UUID;

//Create table query: need to create table before executing any operations related to payments-integration
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "payment_main", schema = "upeg", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"PAYMENT_DOC_NUMBER", "IV_DOCUMENT"})})
public class PaymentMain  {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid2")
    @Column(name = "payment_id")
    private UUID paymentId;
    @Column(name = "PO_NUMBER")
    private String poId;
    @Column(name = "VENDOR_CODE")
    private String vendorCode;
    @Column(name = "IV_DOCUMENT")
    private String invoiceDocument;
    @Column(name = "IV_DATE")
    private String invoiceDate;
    @Column(name = "IV_QUANTITY")
    public BigDecimal invoiceQuantity;
    @Column(name = "IV_BASIC_AMOUNT")
    private BigDecimal invoiceBasicAmount;
    @Column(name = "IV_TAX_AMOUNT")
    private BigDecimal invoiceTaxAmount;
    @Column(name = "IV_TOTAL_AMOUNT")
    private BigDecimal invoiceTotalAmount;
    @Column(name = "VENDOR_INVOICE_NUMBER")
    private String vendorInvoiceNumber;
    @Column(name = "PAYMENT_DOC_NUMBER")
    private String paymentDocumentNumber;
    @Column(name = "PAYMENT_DATE")
    private String paymentDate;
    @Column(name = "created_date",updatable = false)
    @CreationTimestamp
    private Timestamp createdDate;
    @Column(name = "VENDOR_INV_DATE")
    private String vendorInvoiceDate;
    @Column(name = "CURRENCY")
    private String currency;
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
    @UpdateTimestamp
    @Column(name="updated_date")
    private Timestamp updatedDate;



}


