package com.example.demo.controller;

import java.io.IOException;
import java.nio.file.Paths;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.service.CategoryService;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.Part;

@Controller
public class ProductController {
		
	@Autowired
	CategoryService categoryService;
	
	@GetMapping("/product")
	public String prodct(Model model)
	{
		model.addAttribute("categories",categoryService.getAllCategory());
		return "product";
	}
	
	@PostMapping("/addProduct")
	public String addProduct(HttpServletRequest req) throws IOException, ServletException
	{
		String name = req.getParameter("name");
		Part img = req.getPart("img");
		
		System.out.println(Paths.get(img.getSubmittedFileName()).getFileName().toString());
		return "redirect:/product";
	}
}
