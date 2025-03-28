package com.effigo.paymentintegration.service;



import com.effigo.paymentintegration.config.UserDetail;
import com.effigo.paymentintegration.entity.User;
import com.effigo.paymentintegration.repository.MasterUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service("masterUserService")
@Primary
public class MasterUserService implements UserDetailsService {
	@Autowired
	private MasterUserRepository masterUserRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<User> byUserNameIgnoreCaseOrEmailIgnoreCase = masterUserRepository
				.findByUserNameIgnoreCaseOrEmailIgnoreCase(username, username);
		if (byUserNameIgnoreCaseOrEmailIgnoreCase.isPresent()) {
			User user = byUserNameIgnoreCaseOrEmailIgnoreCase.get();
			return prepareUserDetailsObject(user);
		}
		throw new UsernameNotFoundException("user details not found");
	}

	private UserDetails prepareUserDetailsObject(User user) {
		return new UserDetail(user);
	}

	private boolean forgotPassword() {
		return true;
	}

}
