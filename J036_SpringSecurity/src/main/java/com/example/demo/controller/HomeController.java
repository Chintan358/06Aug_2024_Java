package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
		
		@PreAuthorize("hasRole('ADMIN')")
		@GetMapping("/admin")
		public ResponseEntity<String> adminUser()
		{
			return ResponseEntity.ok("I am admin user");
		}
		
		@GetMapping("/admin/home")
		public ResponseEntity<String> adminHome()
		{
			return ResponseEntity.ok("I am admin Home access");
		}
	
		@GetMapping("/public")
		public ResponseEntity<String> publicUser()
		{
			return ResponseEntity.ok("I am public user");
		}
		
		@GetMapping("/seller")
		public ResponseEntity<String> sellerUser()
		{
			return ResponseEntity.ok("I am seller");
		}
	
	
}
