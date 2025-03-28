package com.effigo.paymentintegration.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "master_user", schema = "supplier")
public class Supplier implements Serializable {

	private static final long serialVersionUID = -58504697035504637L;

	@Id
	//	@GeneratedValue(generator = "system-uuid")
	//	@GenericGenerator(name = "system-uuid", strategy = "uuid")
	@Column(name = "user_id")
	private String id;

	@Column(name = "user_name")
	private String userName;

	@Column(name = "password")
	private String password;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "client_id")
	private String clientId;

	@Column(name = "role_id")
	private String roleId;

	@Column(name = "created_by")
	private String createdBy;

	@CreationTimestamp
	@JsonFormat(pattern = "dd-MM-yyyy HH:mm")
	@Column(name = "created_date")
	private Timestamp createdDate;

	@Column(name = "invalid_password_attempts")
	private Integer invalidPasswordAttempts;

	@Column(name = "vendor_id")
	private String vendorId;

	@Column(name = "status")
	private Integer status;

	@Column(name = "force_change_password")
	private Integer forceChangePassword;

	@Column(name = "first_time_access")
	private boolean firstTimeAccess;

	@Column(name = "phone")
	private String phone;

	@Column(name = "mobile")
	private String mobile;

	@Column(name = "fax")
	private String fax;

	@Column(name = "company_branch_id")
	private String companyBranchId;

	@Column(name = "timezone")
	private String timezone;

	//	@Column(name = "logged_status")
	//	private Integer loggedStatus;

	@Column(name = "address")
	private String address;

	@Column(name = "designation")
	private String designation;

	@Column(name = "isadmin")
	private boolean isAdmin;

	@Column(name = "approval_status")
	private Integer approvalStatus;

	@Column(name = "activity_status")
	private Integer activityStatus;
}
