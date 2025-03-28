package com.effigo.paymentintegration.entity;

import lombok.*;
import org.springframework.data.annotation.Immutable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "integration_preference", schema = "masters")
@Immutable
public class MastersIntegrationPreferenceView {

	@Column(name = "client_id")
	private String clientId;

	@Column(name = "isl2required")
	private boolean isl2Required;

	@Column(name = "isl3required")
	private boolean isl3Required;

	@Column(name = "goods")
	private String goods;

	@Column(name = "service")
	private String service;

	@Column(name = "masteractive")
	private String masteractive;

	@Column(name = "masterinactive")
	private String masterinactive;

	@Column(name = "sourcing_type")
	private String sourcingtype;

	@Column(name = "req_approved_status")
	private String requestApprovedStatus;

	@Column(name = "companycode")
	private String companycode;

	@Column(name = "costcenterper")
	private String costcenterper;

	@Column(name = "qtyamendstatus")
	private String qtyamendstatus;

	@Column(name = "priceperunit")
	private String priceperunit;

	@Column(name = "directrequisition")
	private String directrequisition;

	@Column(name = "prcancelstatus")
	private String prcancelstatus;

	@Column(name = "prcreate")
	private String prcreate;

	@Column(name = "pramendstatus")
	private String pramendstatus;

	@Column(name = "pocreate")
	private String pocreate;

	@Column(name = "pocancelstatus")
	private String pocancelstatus;

	@Column(name = "poamendstatus")
	private String poamendstatus;

	@Column(name = "createdby")
	private String createdby;

	@Column(name = "iscompanyidexists")
	private String iscompanyidexists;

	@Id
	@Column(name = "tenantId")
	private String tenantId;

	@Column(name = "reports_indicator")
	private String reportsIndicator;
}
