package com.example.demo.config;

import java.io.IOException;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import com.example.demo.service.JWTService;
import com.example.demo.service.UserService;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class JwtAuthenticationFilter extends OncePerRequestFilter {

	JWTService jwtService;
	UserService service;
	
	
	
	public JwtAuthenticationFilter(JWTService jwtService, UserService service) {
		super();
		this.jwtService = jwtService;
		this.service = service;
	}



	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		
		String authHeader = request.getHeader("Authorization");
		if(authHeader != null && authHeader.startsWith("Bearer ") )
		{
			String token = authHeader.substring(7);
			
			if(jwtService.validateToken(token))
			{
				String username = jwtService.getUsernamefromToken(token);
				UserDetails details =  service.loadUserByUsername(username);
			
				if(SecurityContextHolder.getContext().getAuthentication()==null)
				{
					UsernamePasswordAuthenticationToken authentication = 
							new UsernamePasswordAuthenticationToken(username, null, details.getAuthorities());
					SecurityContextHolder.getContext().setAuthentication(authentication);
					
					
				}
			
			
			
			}
			
			
		}
		
	}

}
