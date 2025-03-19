package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.CategoryDto;
import com.example.demo.model.Category;

public interface CategoryService {
	
		public List<CategoryDto> allCategories();
		public CategoryDto addCategory(Category c);
}
