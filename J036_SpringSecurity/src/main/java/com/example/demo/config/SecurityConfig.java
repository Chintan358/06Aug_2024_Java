package com.example.demo.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableMethodSecurity
public class SecurityConfig {
   
	@Bean
	public PasswordEncoder encoder()
	{
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	public UserDetailsManager detailsManager()
	{
		UserDetails adminUser = 
				User.withUsername("admin")
				.password(encoder().encode("admin"))
				.roles("ADMIN")
				.build();
		
		UserDetails sellerUser = 
				User.withUsername("seller")
				.password(encoder().encode("seller"))
				.roles("SELLER")
				.build();
		
		InMemoryUserDetailsManager detailsManager = new InMemoryUserDetailsManager(adminUser,sellerUser);
		return detailsManager;
	}
	
	
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception
	{
		
		httpSecurity.csrf().disable()
			.authorizeHttpRequests()
			.requestMatchers("/public")
			.permitAll()
				/*
				 * .requestMatchers("/admin/**") .hasRole("ADMIN") .requestMatchers("/seller")
				 * .hasRole("SELLER")
				 */
			.anyRequest()
			.authenticated()
			.and()
			.formLogin();
		
		return httpSecurity.build();
	}
	
		
	
}
