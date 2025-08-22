/**
 * SecurityConfig.java
 * 21-Aug-2025
 */
package com.abimulia.inv.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;
import org.springframework.security.web.csrf.CsrfTokenRequestAttributeHandler;

import lombok.extern.slf4j.Slf4j;

/**
 * @author abimu
 *
 * @version 1.0 (21-Aug-2025)
 * @since 21-Aug-2025 2:15:00 PM
 * 
 * 
 *        Copyright(c) 2025 Abi Mulia
 */

@Configuration
@EnableMethodSecurity
@Slf4j
public class SecurityConfig {

	@Bean
	SecurityFilterChain configure(HttpSecurity http) throws Exception {
		log.debug("configure(HttpSecurity http) called with: {}", http);
		// Konfigurasi keamanan untuk aplikasi
		CsrfTokenRequestAttributeHandler requestHandler = new CsrfTokenRequestAttributeHandler();
        requestHandler.setCsrfRequestAttributeName(null);
		http
			
			.csrf(csrf -> csrf.csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse())
                    .csrfTokenRequestHandler(requestHandler))
			.authorizeHttpRequests(auth -> auth
					.requestMatchers("/actuator/health", "/v3/api-docs/**", "/swagger-ui/**").permitAll()
					.requestMatchers("/api/v1/users/**").hasRole("ADMIN")
					.requestMatchers("/api/v1/loans/**").authenticated() // detail dibatasi di method level
					.anyRequest().authenticated())
			.oauth2Login(Customizer.withDefaults())
            .oauth2ResourceServer(oauth2 -> oauth2.jwt(Customizer.withDefaults()))
            .oauth2Client(Customizer.withDefaults());
		log.debug("http: {}", http );

		return http.build();
	}

}
