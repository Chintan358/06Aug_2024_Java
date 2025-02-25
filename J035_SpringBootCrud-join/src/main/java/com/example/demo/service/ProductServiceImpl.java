package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Category;
import com.example.demo.model.Product;
import com.example.demo.repo.CategoryRepo;
import com.example.demo.repo.ProductRepo;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	CategoryRepo categoryRepo;
	
	@Autowired
	ProductRepo productRepo;
	
	@Override
	public List<Category> allCategory() {
		// TODO Auto-generated method stub
		return categoryRepo.findAll();
	}

	@Override
	public List<Product> allProducts() {
		// TODO Auto-generated method stub
		return productRepo.findAll();
	}

	@Override
	public void addorUpdateProduct(Product p) {
		// TODO Auto-generated method stub
		productRepo.save(p);
	}

	@Override
	public Product productById(int id) {
		// TODO Auto-generated method stub
		return productRepo.findById(id).orElseThrow();
	}

	@Override
	public void deleteProduct(int id) {
		// TODO Auto-generated method stub
		productRepo.deleteById(id);
	}

	@Override
	public Category categoryById(int id) {
		// TODO Auto-generated method stub
		return categoryRepo.findById(id).orElseThrow();
	}

}
