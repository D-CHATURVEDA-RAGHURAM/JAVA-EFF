package com.effigo.paymentintegration.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "user_organization_rel_info", schema = "masters")
public class UserOrganizationRelInfoEntity {
	@Id
	@Column(name = "usr_org_id")
	private String usr_org_id;

	@Column(name = "hierarchy_id")
	private String hierarchyId;

	@Column(name = "dept_id")
	private String deptId;

	@Column(name = "user_id")
	private String userId;

	@Column(name = "default_value")
	private boolean defaultValue;

	@Column(name = "status")
	private Integer status;

	@Column(name = "manager")
	private String manager;

}
