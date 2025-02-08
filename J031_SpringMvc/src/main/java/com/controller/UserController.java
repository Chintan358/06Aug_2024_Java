package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.model.User;
import com.service.UserService;

@Controller
public class UserController {

	@Autowired
	UserService service;
	
	@RequestMapping("/")
	public String index(Model model)
	{
		User u = new User();
		model.addAttribute("user", u);
		model.addAttribute("users", service.viewUsers());
		return "index";
	}
	
	@RequestMapping("/home")
	public String home()
	{
		return "home";
	}
	
//	@RequestMapping(method = RequestMethod.POST,value = "/adduser")
	@PostMapping("/adduser")
	public String adduser(@ModelAttribute("user") User u)
	{
		service.addorUpdateUser(u);
		return "redirect:/";
	}
	
	@GetMapping("/delete")
	public String deleteUser(@RequestParam("did") int id)
	{
		service.deleteUser(id);
		return "redirect:/";
	}
	
	@GetMapping("/edit")
	public String updateUser(@RequestParam("eid") int id,Model model)
	{
		User u = service.userById(id);
		model.addAttribute("user", u);
		model.addAttribute("users", service.viewUsers());
		return "index";
	}
	
}
