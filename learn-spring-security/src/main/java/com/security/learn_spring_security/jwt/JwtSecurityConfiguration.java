package com.security.learn_spring_security.jwt;

import static org.springframework.security.config.Customizer.withDefaults;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.interfaces.RSAPublicKey;
import java.util.UUID;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.oauth2.server.resource.OAuth2ResourceServerConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.jwt.JwtDecoder;
import org.springframework.security.oauth2.jwt.JwtEncoder;
import org.springframework.security.oauth2.jwt.NimbusJwtDecoder;
import org.springframework.security.oauth2.jwt.NimbusJwtEncoder;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.jwk.JWKSet;
import com.nimbusds.jose.jwk.RSAKey;
import com.nimbusds.jose.jwk.source.JWKSource;
import com.nimbusds.jose.proc.SecurityContext;

//@Configuration
public class JwtSecurityConfiguration {

	@SuppressWarnings("removal")
	@Bean
	SecurityFilterChain SecurityFilterChain(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests((requests) -> requests.anyRequest().authenticated());
//		http.formLogin(withDefaults());
		http.sessionManagement(
				session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS)
				);
		http.httpBasic(withDefaults());
//		http.headers().frameOptions().sameOrigin(); -h2 database
		http.csrf().disable();
		http.oauth2ResourceServer(OAuth2ResourceServerConfigurer::jwt);
		return http.build();
	}
	
	@Bean
    public UserDetailsService userDetailsService(DataSource dataSource) {
        JdbcUserDetailsManager jdbcUserDetailsManager = new JdbcUserDetailsManager(dataSource);

        // Check if users exist before inserting
        if (!jdbcUserDetailsManager.userExists("chaturved")) {
            jdbcUserDetailsManager.createUser(User.withUsername("chaturved")
                    .password(passwordEncoder().encode("chatur@1234"))
                    .roles("USER")
                    .build());
        }

        if (!jdbcUserDetailsManager.userExists("admin")) {
            jdbcUserDetailsManager.createUser(User.withUsername("admin")
                    .password(passwordEncoder().encode("chatur@1234"))
                    .roles("ADMIN")
                    .build());
        }

        return jdbcUserDetailsManager;
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
    
    @Bean
    public KeyPair keyPair() {
    	try {
	    	var keyPairGenerator = KeyPairGenerator.getInstance("RSA");
	    	keyPairGenerator.initialize(2048);
	    	return keyPairGenerator.generateKeyPair();
    	}
    	catch (Exception e)
    	{
    		throw new RuntimeException(e);
    	}
    }
    
    @Bean
    public RSAKey rsaKey(KeyPair keyPair) {
    	return new RSAKey.Builder((RSAPublicKey) keyPair.getPublic())
    			.privateKey(keyPair.getPrivate())
    			.keyID(UUID.randomUUID().toString())
    			.build();
    }
    
    @Bean
    public JWKSource<SecurityContext> jwkSource(RSAKey rsaKey)
    {
    	var jwkSet = new JWKSet(rsaKey);
    	return (jwkSelector, context) -> jwkSelector.select(jwkSet);
    }
    
    @Bean
    public JwtDecoder jwtDecoder(RSAKey rsaKey) throws JOSEException {
    	
    	return NimbusJwtDecoder
    			.withPublicKey(rsaKey.toRSAPublicKey())
    			.build();
    }
    
    @Bean
    public JwtEncoder jwtEncoder(JWKSource<SecurityContext> jwkSource) {
    	return new NimbusJwtEncoder(jwkSource);
    }
}
