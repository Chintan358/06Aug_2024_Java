package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.CategoryDto;
import com.example.demo.model.Category;
import com.example.demo.service.CategoryService;

@RestController
@RequestMapping("/categories")
public class CategoryController {

	@Autowired
	CategoryService categoryService;
	
	@GetMapping("/")
	public ResponseEntity<List<CategoryDto>> viewAllCategory()
	{
		List<CategoryDto> cat = categoryService.allCategories();
		
		ResponseEntity<List<CategoryDto>> resp = new ResponseEntity<List<CategoryDto>>(cat,HttpStatus.OK);
		return resp;
	}
	
	@PostMapping("/")
	public CategoryDto addCategory(@RequestBody Category cat)
	{
		CategoryDto cats = categoryService.addCategory(cat);
		return cats;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
