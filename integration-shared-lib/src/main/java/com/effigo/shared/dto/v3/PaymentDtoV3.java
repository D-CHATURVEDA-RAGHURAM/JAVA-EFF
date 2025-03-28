package com.effigo.shared.dto.v3;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@Data
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class PaymentDtoV3 {

	private String poNo;
	private String vendorCode;
	private String invoiceDocument;
	private String invoiceDate;
	private String invoiceQuantity;
	private String invoiceBasicAmount;
	private String invoiceTaxAmount;
	private String invoiceTotalAmount;
	private String vendorInvoiceNumber;
	private String paymentDocumentNumber;
	private String paymentDate;

}
