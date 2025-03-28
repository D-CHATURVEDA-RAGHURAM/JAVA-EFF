package com.effigo.paymentintegration.utils;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.Claim;
import com.auth0.jwt.interfaces.DecodedJWT;

import com.effigo.paymentintegration.config.LoggedInUserDetailsDto;
import com.effigo.paymentintegration.entity.Supplier;
import com.effigo.paymentintegration.entity.User;
import com.effigo.paymentintegration.repository.SupplierUserRepository;
import com.effigo.paymentintegration.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
@Slf4j
public class JwtTokenDetails {

    @Autowired
    private UserRepository userRepository;
	@Autowired
	private SupplierUserRepository supplierUserRepository;
	@Value("${secret.key}")
	private String key;

	private Algorithm getAlgorithm() {
		return Algorithm.HMAC256(key);
	}

	public void validateToken(String token) {
		JWTVerifier verifier = JWT.require(getAlgorithm()).build();
		DecodedJWT decodedJWT = verifier.verify(token.trim());
		LoggedInUserDetailsDto loggedInUserDetailsDto = new LoggedInUserDetailsDto();
		Claim appTypeJWTClaim = decodedJWT.getClaim("appType");
		Claim userIdJWTClaim = decodedJWT.getClaim("userId");
		Optional<User> byUserId=null;
		Optional<Supplier> 	byId=null;
		if(Boolean.parseBoolean(appTypeJWTClaim.toString())) {
			byUserId = userRepository.findById(userIdJWTClaim.asString());
		}else{
			byId = supplierUserRepository.findById(userIdJWTClaim.asString());
		}
		if (null==byUserId && null==byId){
			throw new RuntimeException("Invalid user");
		}
	}
}
