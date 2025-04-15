package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.JwtResponse;
import com.example.demo.dto.RefreshTokenRequest;
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
	
	
	
	@Autowired
	public PasswordEncoder encoder;
	
	
	public HomeController(AuthenticationManager authenticationManager, JWTService jwtService,
			UserDetailsService detailsService, UserRepo repo) {
		super();
		this.authenticationManager = authenticationManager;
		this.jwtService = jwtService;
		this.detailsService = detailsService;
		this.repo = repo;
	}
	
	

	@GetMapping("/users")
	public ResponseEntity<?> index()
	{
		return ResponseEntity.ok("Done");
	}
	
	@PostMapping("/login")
	public ResponseEntity<?> userlogin(@RequestBody UserRequest request)
	{		
		
		authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(request.getUsername(), request.getPassword()));
		String accessToken = jwtService.generateToken(request.getUsername(),true);
		String refreshToken = jwtService.generateToken(request.getUsername(),false);
		
		User user = repo.findByUsername(request.getUsername());
		
		JwtResponse jwtResponse = new JwtResponse(accessToken, refreshToken, user);
		return ResponseEntity.ok(jwtResponse);
	}
	
	@PostMapping("/refresh-token")
	public ResponseEntity<?> refreshToken(@RequestBody RefreshTokenRequest request)
	{
		if(jwtService.validateToken(request.refreshToken()))
		{
			String UsernameFromRefreshToken = jwtService.getUsernamefromToken(request.refreshToken());
			String accessToken = jwtService.generateToken(UsernameFromRefreshToken, true);
			String refreshToken = jwtService.generateToken(UsernameFromRefreshToken, false);
			User user = repo.findByUsername(UsernameFromRefreshToken);
			
			JwtResponse jwtResponse = new JwtResponse(accessToken, refreshToken, user);
			return ResponseEntity.ok(jwtResponse);		
		}
		return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid Token");
	}
	
	@PostMapping("/adduser")
	public String adduser(@RequestBody User user)
	{
		
		user.setPassword(encoder.encode(user.getPassword()));
		repo.save(user);
		return "success";
	}
	
	
	
	@GetMapping("/public")
	public ResponseEntity<String> publicUser()
	{
		return ResponseEntity.ok("public user calling");
	}
	
	@GetMapping("/normal")
	public ResponseEntity<String> normal()
	{
		return ResponseEntity.ok("normal user calling");
	}
	
	
	
	
}
