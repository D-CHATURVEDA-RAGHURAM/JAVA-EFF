package com.effigo.paymentintegration.config;


import com.effigo.paymentintegration.service.MasterUserService;
import com.effigo.paymentintegration.service.SupplierUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.ProviderManager;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.DelegatingPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

	public static final List<String> ALLOWED = List.of("*");

	@Autowired
	private MasterUserService masterUserService;
	@Autowired
	@Qualifier("supplierUserService")
	private SupplierUserService supplierUserService;

	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

	@Bean
	public BasicAuthenticationFilter basicAuthenticationFilter() throws Exception {
		return new BasicAuthenticationFilter(authenticationManager());
	}

	@Value("${secret.username}")
	private String userName;
	@Value("${secret.password}")
	private String password;

	@Bean
	public PasswordEncoder bCryptPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Bean
	public EffigoPasswordEncoder effigoPasswordEncoder() {
		return new EffigoPasswordEncoder();
	}

	public void configure(WebSecurity web) throws Exception {
		web.ignoring().antMatchers("/**/*.wsdl");
	}

	@Bean
	public SecurityFilterChain httpFilter(HttpSecurity httpSecurity) throws Exception {
		httpSecurity.csrf().disable().authorizeRequests().antMatchers("**/login", "/forgotPassword").permitAll()
				.antMatchers("**/api/**").authenticated().and().sessionManagement()
				.sessionCreationPolicy(SessionCreationPolicy.NEVER).and()
				.authenticationManager(authenticationManager());
		return httpSecurity.build();
	}

	@Bean
	public AuthenticationProvider getSupplierDaoAuthenticationProvider() {
		DaoAuthenticationProvider daoAuthenticationProvider = new DaoAuthenticationProvider();
		daoAuthenticationProvider.setUserDetailsService(supplierUserService);
		daoAuthenticationProvider.setPasswordEncoder(delegatingPasswordEncoder());
		return daoAuthenticationProvider;
	}

	@Bean
	@Primary
	public DaoAuthenticationProvider getMasterDaoAuthenticationProvider() {
		DaoAuthenticationProvider daoAuthenticationProvider = new DaoAuthenticationProvider();
		daoAuthenticationProvider.setUserDetailsService(masterUserService);
		daoAuthenticationProvider.setPasswordEncoder(delegatingPasswordEncoder());
		return daoAuthenticationProvider;
	}

	@Bean
	public AuthenticationManager supplierAuthenticationManager() throws Exception {
		AuthenticationProvider supplierDaoAuthenticationProvider = getSupplierDaoAuthenticationProvider();
		return new ProviderManager(supplierDaoAuthenticationProvider);
	}

	@Bean
	@Primary
	public AuthenticationManager authenticationManager() throws Exception {
		return new ProviderManager(getMasterDaoAuthenticationProvider());
	}

	@Bean
	public DelegatingPasswordEncoder delegatingPasswordEncoder() {
		Map<String, PasswordEncoder> encodersMap = new HashMap<>();
		encodersMap.put("bcrypt", bCryptPasswordEncoder());
		DelegatingPasswordEncoder encoder = new DelegatingPasswordEncoder("bcrypt", encodersMap);
		encoder.setDefaultPasswordEncoderForMatches(effigoPasswordEncoder());
		return encoder;
	}

	@Bean
	public CorsFilter corsFilter() {

		CorsConfiguration corsConfiguration = new CorsConfiguration();
		corsConfiguration.setAllowedMethods(ALLOWED);
		corsConfiguration.setAllowedOrigins(ALLOWED);
		corsConfiguration.setAllowedOrigins(ALLOWED);
		corsConfiguration.applyPermitDefaultValues();
		UrlBasedCorsConfigurationSource urlBasedCorsConfigurationSource = new UrlBasedCorsConfigurationSource();
		urlBasedCorsConfigurationSource.registerCorsConfiguration("/**", corsConfiguration);
		return new CorsFilter(urlBasedCorsConfigurationSource);

	}
}
