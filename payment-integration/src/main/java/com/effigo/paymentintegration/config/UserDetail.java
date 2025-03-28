package com.effigo.paymentintegration.config;


import com.effigo.paymentintegration.entity.Supplier;
import com.effigo.paymentintegration.entity.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

public class UserDetail implements UserDetails {
	private static final long serialVersionUID = 4601165230109677594L;

	private User user;
	private Supplier supplier;

	public UserDetail(User user) {
		this.user = user;
	}

	public UserDetail(Supplier supplier) {
		this.supplier = supplier;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		String roleId = user != null ? user.getRoleId() : supplier.getRoleId();
		String roleIds[] = new String[] { roleId };
		return Arrays.stream(roleIds).map(SimpleGrantedAuthority::new).collect(Collectors.toList());
	}

	@Override
	public String getPassword() {
		return getPasswordByLoggedInUser();
	}

	private String getPasswordByLoggedInUser() {
		if (user == null) {
			return supplier.getPassword();
		}
		return this.user.getPassword();
	}

	@Override
	public String getUsername() {
		return getUserName2();
	}

	@Override
	public boolean isAccountNonExpired() {
		if (user == null) {
			return supplier.getStatus() != null;
		}
		return this.user.getStatus() != null;
	}

	@Override
	public boolean isAccountNonLocked() {
		if (user == null) {
			return supplier.getStatus() != null;
		}

		return this.user.getStatus() != null;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		if (user == null) {
			return supplier.getStatus() != null;
		}
		return this.user.getStatus() != null;
	}

	@Override
	public boolean isEnabled() {
		if (user == null) {
			return supplier.getStatus() != null;
		}
		return this.user.getStatus() != null;
	}

	public String getVendorId() {
		if (this.supplier == null)
			return null;
		return this.supplier.getVendorId();
	}

	public String getRoleId() {
		if (this.supplier == null) {
			return this.user.getRoleId();
		}
		return this.supplier.getRoleId();
	}

	public String getClientId() {
		if (this.supplier == null)
			return null;
		return this.supplier.getClientId();
	}

	public String getEmail() {
		if (this.user != null) {
			return this.user.getEmail();
		}
		return this.supplier.getUserName();
	}

	public String getUserId() {
		if (this.user != null) {
			return this.user.getId();
		}
		return this.supplier.getId();
	}

	private String getUserName2() {
		if (user == null)
			return supplier.getUserName();
		return this.user.getUserName();
	}
}
