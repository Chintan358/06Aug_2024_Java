package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminController {
	
	@RequestMapping("/admin")
	public String admin()
	{
		return "adminlogin";
	}
	
	@RequestMapping("/admindashboard")
	public String dashboard()
	{
		return "admindashboard";
	}
	
	
	@GetMapping("/user")
	public String user()
	{
		return "user";
	}
	
	
	
	
	@GetMapping("/product")
	public String prodct()
	{
		return "product";
	}
	
	@GetMapping("/order")
	public String order()
	{
		return "order";
	}
	
	
	
	
	
}
