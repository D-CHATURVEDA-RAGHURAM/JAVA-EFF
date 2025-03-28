package com.effigo.paymentintegration.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;

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
@Table(name = "payment_status_log", schema = "upeg")
public class PaymentStatusLog  {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid2")
    @Column(name = "payment_status_log_id")
    private UUID paymentStatusLogId;
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
    @Column(name = "PAYMENT_DOC_NUMBER", unique = true)
    private String paymentDocumentNumber;
    @Column(name = "PAYMENT_DATE")
    private String paymentDate;
    @Column(name = "created_date")
    @CreationTimestamp
    private Timestamp createdDate;
}


