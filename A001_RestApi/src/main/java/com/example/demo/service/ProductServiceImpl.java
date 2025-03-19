package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.ProductDto;
import com.example.demo.model.Product;
import com.example.demo.repo.ProductRepo;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductRepo productRepo;

	@Override
	public ProductDto addProduct(Product p) {
		
		Product prod = productRepo.save(p);
		ProductDto pdto = new ProductDto();
		return pdto;
		
	}
}
