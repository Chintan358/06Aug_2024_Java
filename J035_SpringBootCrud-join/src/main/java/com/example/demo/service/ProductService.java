package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Category;
import com.example.demo.model.Product;

public interface ProductService {
		
	public List<Category> allCategory();
	public Category categoryById(int id);
	public List<Product> allProducts();
	public void addorUpdateProduct(Product p);
	public Product productById(int id);
	public void deleteProduct(int id);
}
