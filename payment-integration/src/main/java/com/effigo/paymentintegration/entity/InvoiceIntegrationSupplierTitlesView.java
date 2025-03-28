package com.effigo.paymentintegration.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "invoice_integration_supplier_titles_view", schema = "supplier")
public class InvoiceIntegrationSupplierTitlesView {

	private static final long serialVersionUID = 1591011306385301459L;

	@Id
	@Column(name="field")
	private String field;

	@Column(name="title")
	private String title;
}
