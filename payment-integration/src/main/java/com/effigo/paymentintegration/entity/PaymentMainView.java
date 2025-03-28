package com.effigo.paymentintegration.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Immutable;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.UUID;

//View query: need to create view before executing any operations related to payments-integration

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@IdClass(PaymentPrimaryKey.class)
@Table(name = "payment_main_view", schema = "upeg")
public class PaymentMainView  {
    private static final long serialVersionUID = 1L;
    @Column(name = "po_number")
    private String poId;
    @Column(name = "VENDOR_CODE")
    private String vendorCode;
    @Id
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
    @Id
    @Column(name = "PAYMENT_DOC_NUMBER")
    private String paymentDocumentNumber;
    @Column(name = "PAYMENT_DATE")
    private String paymentDate;
    @Column(name = "created_date")
    private Timestamp createdDate;
    @Column(name = "company_id")
    private String companyId;
    @Column(name = "company_name")
    private String companyName;
    @Column(name = "business_unit")
    private String businessUnit;
    @Column(name = "vendor_inv_date")
    private String vendorInvDate;
    @Column(name = "currency")
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

}
@Data
@AllArgsConstructor
@NoArgsConstructor
class PaymentPrimaryKey implements Serializable {

    private String paymentDocumentNumber;

    private String invoiceDocument;
}
