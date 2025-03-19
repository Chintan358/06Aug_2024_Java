package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.CategoryDto;
import com.example.demo.model.Category;
import com.example.demo.repo.CategoryRepo;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	CategoryRepo categoryRepo;
	
	@Override
	public List<CategoryDto> allCategories() {
		
		List<Category> cats =  categoryRepo.findAll();
		List<CategoryDto> dtos = new ArrayList<CategoryDto>();
		
		for(Category c : cats)
		{
			CategoryDto dt = new CategoryDto();
			dt.setCategoryId(c.getCategoryId());
			dt.setCategoryName(c.getCategoryName());
			dtos.add(dt);
		}
		
		return dtos;
		
	}

	@Override
	public CategoryDto addCategory(Category c) {
		// TODO Auto-generated method stub
		Category ct  = categoryRepo.save(c);
		CategoryDto dt = new CategoryDto();
		dt.setCategoryId(ct.getCategoryId());
		dt.setCategoryName(ct.getCategoryName());
		
		return dt;
	}

}
