package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Category;

public interface CategoryService {
	
		public void addOrUpdateCategory(Category category);
		public List<Category> getAllCategory();
		public Category categoryById(int id);
		public void deleteCategory(int id);
}
