package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Category;
import com.example.demo.service.CategoryService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class CategoryAPI {
	
	@Autowired
	CategoryService categoryService;
	
	@GetMapping("/categories")
	public List<Category> allCategory()
	{
		return categoryService.getAllCategory();
	}
	
	@PostMapping("/categories")
	public String adCategory(@RequestBody Category category) {
		
		categoryService.addOrUpdateCategory(category);
		return "category added";
	}
	
	@GetMapping("/categories/{id}")
	public Category viewCategory(@PathVariable("id") int id)
	{
		return categoryService.categoryById(id);
	}
	
	@DeleteMapping("/categories/{id}")
	public String deleteCategory(@PathVariable("id") int id)
	{
		categoryService.deleteCategory(id);
		return "category deleted";
	}
	
	@PutMapping("/categories/{id}")
	public String updateCategory(@RequestBody Category category,@PathVariable("id") int id)
	{
		category.setCategoryId(id);
		categoryService.addOrUpdateCategory(category);
		return "category updated";
	}
	
}
