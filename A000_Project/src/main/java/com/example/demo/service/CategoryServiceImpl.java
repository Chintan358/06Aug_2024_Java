package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Category;
import com.example.demo.repo.CategoryRepo;

@Service
public class CategoryServiceImpl  implements CategoryService{

	@Autowired
	CategoryRepo categoryRepo;
	
	
	@Override
	public void addOrUpdateCategory(Category category) {
		categoryRepo.save(category);
		
	}

	@Override
	public List<Category> getAllCategory() {
		
		return categoryRepo.findAll();
	}

	@Override
	public Category categoryById(int id) {
		// TODO Auto-generated method stub
		return categoryRepo.findById(id).orElseThrow();
	}

	@Override
	public void deleteCategory(int id) {
		// TODO Auto-generated method stub
		categoryRepo.deleteById(id);
	}

}
