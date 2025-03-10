package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.service.CategoryService;

@Controller
public class HomeController {
	
	@Autowired
	CategoryService categoryService;
	
	@GetMapping("/")
	public String index()
	{
		return "index";
	}
	
	@GetMapping("/shop")
	public String shop(Model model)
	{
		model.addAttribute("categories", categoryService.getAllCategory());
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
