package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.Category;
import com.example.demo.service.CategoryService;

@Controller
public class CategoryController {

	@Autowired
	CategoryService categoryService;
	
	@GetMapping("/category")
	public String category(Model model)
	{
		model.addAttribute("category", new Category());
		model.addAttribute("categories", categoryService.getAllCategory());
		return "category";
	}
	
	@PostMapping("/addCategory")
	public String addCategory(@ModelAttribute("category") Category cat)
	{
		categoryService.addOrUpdateCategory(cat);
		return "redirect:/category";
	}
	
	@GetMapping("/deleteCategory")
	public String deleteCategory(@RequestParam("cid") int id)
	{
		categoryService.deleteCategory(id);
		return "redirect:/category";
	}
	
	@GetMapping("/editCategory")
	public String findCategory(@RequestParam("cid") int id,Model model)
	{
		model.addAttribute("category", categoryService.categoryById(id));
		model.addAttribute("categories", categoryService.getAllCategory());
		return "category";
	}
	
	
}
