package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@GetMapping("/public")
	public ResponseEntity<String> publicuser()
	{
		return ResponseEntity.ok("done");
	}
}
