package com.effigo.paymentintegration.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "payment_main_supplier_titles_view", schema = "supplier")
public class PaymentMainSupplierTitlesView {

	private static final long serialVersionUID = 3181648405955804311L;

	@Id
	@Column(name="field")
	private String field;

	@Column(name="title")
	private String title;
}
