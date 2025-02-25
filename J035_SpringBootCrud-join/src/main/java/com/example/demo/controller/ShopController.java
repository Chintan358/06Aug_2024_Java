package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.Product;
import com.example.demo.service.ProductService;

@Controller
public class ShopController {
	
	@Autowired
	ProductService productService;
	
	
	@GetMapping("/")
	public String index(Model model)
	{
		model.addAttribute("product", new Product());
		model.addAttribute("categories", productService.allCategory());
		model.addAttribute("products", productService.allProducts());
		return "index";
	}
	
	@PostMapping("/addproduct")
	public String addProduct(@ModelAttribute("product") Product p)
	{
//		p.setCategory(productService.categoryById(Integer.parseInt(cat)));
		productService.addorUpdateProduct(p);
		return "redirect:/";
	}
}
