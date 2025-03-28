package com.effigo.shared.dto.external.v1;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class BidderDetail {

    @XmlElement(name = "Bidder")
    private Bidder bidder;

    @XmlElement(name = "LineOfBusiness")
    private String lineOfBusiness;

    @XmlElement(name = "Area")
    private String area;

    @XmlElement(name = "ResponseDateTime")
    private String responseDateTime;

    @XmlElement(name = "ExpiryDateTime")
    private String expiryDateTime;

    @XmlElement(name = "OrderDiscount")
    private String orderDiscount;

    @XmlElement(name = "Currency")
    private String currency;

    @XmlElement(name = "CurrencyRate")
    private String currencyRate;

    @XmlElement(name = "DeliveryTerms")
    private String deliveryTerms;

    @XmlElement(name = "Carrier")
    private String carrier;

    @XmlElement(name = "PaymentTerms")
    private String paymentTerms;

    @XmlElement(name = "TitlePassage")
    private String titlePassage;

    @XmlElement(name = "LatePaymentSurcharge")
    private String latePaymentSurcharge;

    @XmlElement(name = "SupplierQuotations")
    private String supplierQuotations;

    @XmlElement(name = "LandedCostClassification")
    private String landedCostClassification;

    @XmlElement(name = "TaxClassification")
    private String taxClassification;

    @XmlElement(name = "InvoiceExternalBP")
    private String invoiceExternalBP;

    @XmlElement(name = "FreightCostBasedOn")
    private String freightCostBasedOn;

    @XmlElement(name = "ReminderStatus")
    private String reminderStatus;

    @XmlElement(name = "ImportRFQ")
    private String importRFQ;

    @XmlElement(name = "Note")
    private String note;

}
