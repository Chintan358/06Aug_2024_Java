package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;

@Controller
public class HomeController {
		
		
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
		public	String publicUser()
		{
			return "index";
		}
		
		@GetMapping("/seller")
		public ResponseEntity<String> sellerUser()
		{
			return ResponseEntity.ok("I am seller");
		}
		
		@PostMapping("/users")
		public String addUser(@RequestBody User user)
		{
			System.out.println(user);
			return "user added";
		}
	
	
}
