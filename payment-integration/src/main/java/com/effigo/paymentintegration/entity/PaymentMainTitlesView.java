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
@Table(name = "payment_main_titles_view", schema = "upeg")
public class PaymentMainTitlesView {

	private static final long serialVersionUID = -9147579879802133090L;

	@Id
	@Column(name="field")
	private String field;

	@Column(name="title")
	private String title;
}
