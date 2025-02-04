package com.security.learn_spring_security.basic;

import static org.springframework.security.config.Customizer.withDefaults;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableMethodSecurity(jsr250Enabled = true, securedEnabled = true)
public class BasicAuthSecurityConfiguration {

	@SuppressWarnings("removal")
	@Bean
	SecurityFilterChain SecurityFilterChain(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests(requests -> {
		requests
		.requestMatchers("/users").hasRole("USER")
		.anyRequest().authenticated();
		});
//		http.formLogin(withDefaults());
		http.sessionManagement(
				session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS)
				);
		http.httpBasic(withDefaults());
//		http.headers().frameOptions().sameOrigin(); -h2 database
		http.csrf().disable();
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
	
}
