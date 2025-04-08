package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.JwtResponse;
import com.example.demo.dto.UserRequest;
import com.example.demo.model.User;
import com.example.demo.repo.UserRepo;
import com.example.demo.service.JWTService;

@RestController
public class HomeController {
		
	
	public AuthenticationManager authenticationManager;
	public JWTService jwtService;
	public UserDetailsService detailsService;
	public UserRepo repo;
	
	
	
	public HomeController(AuthenticationManager authenticationManager, JWTService jwtService,
			UserDetailsService detailsService, UserRepo repo) {
		super();
		this.authenticationManager = authenticationManager;
		this.jwtService = jwtService;
		this.detailsService = detailsService;
		this.repo = repo;
	}

	@GetMapping("/users")
	public String index()
	{
		return "Hello";
	}
	
	@PostMapping("/login")
	public ResponseEntity<?> userlogin(@RequestBody UserRequest request)
	{
		System.out.println("Hello");
		authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(request.getUsername(), request.getPassword()));
		String accessToken = jwtService.generateToken(request.getUsername(),true);
		String refreshToken = jwtService.generateToken(request.getUsername(),false);
		
		User user = repo.findByUsername(request.getUsername());
		
		JwtResponse jwtResponse = new JwtResponse(accessToken, refreshToken, user);
		return ResponseEntity.ok(jwtResponse);
	}
}
