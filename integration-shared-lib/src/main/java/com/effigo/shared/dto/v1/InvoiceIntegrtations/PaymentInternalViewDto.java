package com.effigo.shared.dto.v1.InvoiceIntegrtations;

import java.math.BigDecimal;

public interface PaymentInternalViewDto {

	String getPoId();

	String getVendorCode();

	String getInvoiceDocument();

	String getInvoiceDate();

	BigDecimal getInvoiceQuantity();

	String getInvoiceBasicAmount();

	String getInvoiceTaxAmount();

	String getInvoiceTotalAmount();

	String getVendorInvoiceNumber();

	String getPaymentDocumentNumber();

	String getPaymentDate();

	String getCompanyName();

	String getCreatedDate();

	String getVendorInvDate();

	String getCurrency();

	String getCustomField1();

	String getCustomField2();

	String getCustomField3();

	String getCustomField4();

	String getCustomField5();

	String getCustomField6();

	String getCustomField7();

	String getCustomField8();

	String getCustomField9();

	String getCustomField10();

	String getBusinessUnit();

	String getAsnYear();

	String getCustomField11();

	String getCustomField12();

	String getCustomField13();

	String getCustomField14();

	String getCustomField15();

	String getCustomField16();

	String getCustomField17();

	String getCustomField118();

	String getCustomField19();

	String getCustomField20();

	String getCreditDebitInd();

	String getAdvanceInd();

	String getFiDocPostingDate();

	String getFiDocDocDate();

	String getClearingDocNo();

	String getPostingKey();

}


