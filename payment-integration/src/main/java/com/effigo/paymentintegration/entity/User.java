package com.effigo.paymentintegration.entity;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Data
@Entity
@Table(name = "master_user", schema = "masters")
public class User implements Serializable {

	private static final long serialVersionUID = 8683355470941482473L;

	@Id
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid")
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

	@Column(name = "name")
	private String name;

	@Column(name = "ishod")
	private boolean ishod;

	@Column(name = "designation_id")
	private String designationId;

	@Column(name = "timezone")
	private String timezone;

	@Column(name = "logged_status")
	private Integer loggedStatus;

	@Column(name = "last_login_history_id")
	private String lastLoginHistoryId;

	@Column(name = "comment")
	private String comment;

	@Column(name = "manager")
	private String manager;

	@Column(name = "temp_log_out_time")
	private Timestamp tempLogOutTime;

	@Column(name = "location")
	private String location;

	@Column(name = "address")
	private String address;

	@Column(name = "sub_client_id")
	private String subClientId;

	@Column(name = "email")
	private String email;

	@Column(name = "preferred_view")
	private boolean preferredView;

	@Column(name = "group_id")
	private String groupId;

	@Column(name = "activity_status")
	private Integer activityStatus;
}
