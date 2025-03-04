package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping("/")
	public String index()
	{
		return "index";
	}
	
	@GetMapping("/shop")
	public String shop()
	{
		return "shop";
	}
	
	@GetMapping("/productDetails")
	public String productdetails()
	{
		return "product-details";
	}
	
	@GetMapping("/cart")
	public String cart()
	{
		return "cart";
	}
	
	
	@GetMapping("/checkout")
	public String checkout()
	{
		return "checkout";
	}
	
	@GetMapping("/login")
	public String login()
	{
		return "login";
	}
	
	@GetMapping("/registration")
	public String reg()
	{
		return "registration";
	}
	
	
	
	
	
	
	
}
