package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
public class Securityconfig {
	
	JwtAuthenticationFilter authenticationFilter;
	CustomeAuthenticationEntryPoint authenticationEntryPoint;
	
	
	public Securityconfig(JwtAuthenticationFilter authenticationFilter,CustomeAuthenticationEntryPoint authenticationEntryPoint) {
		super();
		this.authenticationFilter = authenticationFilter;
		this.authenticationEntryPoint = authenticationEntryPoint;
	}

	@Bean
	public PasswordEncoder encoder()
	{
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	public AuthenticationManager authenticationManager(AuthenticationConfiguration configuration) throws Exception
	{
		return configuration.getAuthenticationManager();
	}
	
	
	
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception
	{
		http.csrf().disable()
		.authorizeHttpRequests()
		.requestMatchers("/admin")
		.hasRole("ADMIN")
		.requestMatchers("/normal")
		.hasRole("NORMAL")
		.requestMatchers("/adduser")
		.permitAll()
		.requestMatchers("/login")
		.permitAll()
		.anyRequest()
		.authenticated()
		.and()
		.exceptionHandling(exception->exception.authenticationEntryPoint(authenticationEntryPoint))
		.sessionManagement(session->session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
		.addFilterBefore(authenticationFilter, UsernamePasswordAuthenticationFilter.class);	
		return http.build();
	}

}
