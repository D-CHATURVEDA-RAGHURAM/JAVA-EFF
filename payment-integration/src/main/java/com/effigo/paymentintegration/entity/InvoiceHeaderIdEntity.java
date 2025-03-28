package com.effigo.paymentintegration.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InvoiceHeaderIdEntity implements Serializable {
	private String fiscalYear;
	private String fiDocument;
	private String postingDate;
}
