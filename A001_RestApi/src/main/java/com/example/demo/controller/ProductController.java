package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.ProductDto;
import com.example.demo.model.Product;
import com.example.demo.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {
	
		@Autowired
		ProductService productService;
	
		@PostMapping("/{catid}")
		public ProductDto addProduct(@RequestBody Product p,@PathVariable("catid") int id )
		{
			p.setCategory(null);
			System.out.println(p.getCategory());
			ProductDto dto = productService.addProduct(p);
			return dto;
		}
		
}
