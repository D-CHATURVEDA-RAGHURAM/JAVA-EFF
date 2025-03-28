package com.effigo.paymentintegration.service;

import com.effigo.paymentintegration.config.UserDetail;
import com.effigo.paymentintegration.entity.Supplier;
import com.effigo.paymentintegration.entity.User;
import com.effigo.paymentintegration.repository.SupplierUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SupplierUserService implements UserDetailsService {
	@Autowired
	private SupplierUserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<Supplier> byUserNameIgnoreCase = userRepository.findByUserNameIgnoreCase(username);
		if (byUserNameIgnoreCase.isPresent()) {
			Supplier supplier = byUserNameIgnoreCase.get();
			return prepareUserDetailsObject(supplier);
		}
		throw new UsernameNotFoundException("user details not found");
	}

	private UserDetails prepareUserDetailsObject(User user) {
		return new UserDetail(user);
	}

	private UserDetails prepareUserDetailsObject(Supplier user) {
		return new UserDetail(user);
	}
}
