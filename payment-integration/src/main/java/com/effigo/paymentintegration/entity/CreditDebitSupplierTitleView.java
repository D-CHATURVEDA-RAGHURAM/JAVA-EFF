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
@Table(name = "v_credit_debit_supplier_title", schema = "supplier")
public class CreditDebitSupplierTitleView {

	private static final long serialVersionUID = -1690658564945182104L;

	@Id
	@Column(name="field")
	private String field;

	@Column(name="title")
	private String title;
}
