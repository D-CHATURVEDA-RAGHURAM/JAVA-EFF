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
@Table(name = "v_credit_debit_title", schema = "upeg")
public class CreditDebitTitleView {

	private static final long serialVersionUID = -2071159969275228534L;

	@Id
	@Column(name="field")
	private String field;

	@Column(name="title")
	private String title;


}
