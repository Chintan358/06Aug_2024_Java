package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.User;
import com.example.demo.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	UserService userService;
	
	@GetMapping("/")
	public String index(Model model)
	{
		model.addAttribute("user", new User());
		model.addAttribute("users", userService.viewAllUsers());
		return "index";
	}
	
	@PostMapping("/addUser")
	public String addUser(@ModelAttribute("user") User u)
	{
		userService.addorUpdateUser(u);
		return "redirect:/";
	}
	
	@GetMapping("/delete")
	public String deleteUser(@RequestParam("uid") int id)
	{
		userService.deleteUser(id);
		return "redirect:/";
	}
	
	@GetMapping("/edit")
	public String editUser(@RequestParam("uid") int id,Model model)
	{
		
		model.addAttribute("user", userService.UserById(id));
		model.addAttribute("users", userService.viewAllUsers());
		return "index";
	}
}                           
