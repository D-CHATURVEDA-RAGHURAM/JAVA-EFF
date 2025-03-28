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
@Table(name = "invoice_integrations_titles_view", schema = "upeg")
public class InvoiceIntegrationTitlesView {

	private static final long serialVersionUID = 2553720945495905301L;

	@Id
	@Column(name="field")
	private String field;

	@Column(name="title")
	private String title;
}
