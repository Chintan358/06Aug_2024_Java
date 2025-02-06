package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.model.User;

@Controller
public class UserController {

	@RequestMapping("/")
	public String index(Model model)
	{
		User u = new User();
		model.addAttribute("user", u);
		return "index";
	}
	
	@RequestMapping("/home")
	public String home()
	{
		return "home";
	}
	
//	@RequestMapping(method = RequestMethod.POST,value = "/adduser")
	@PostMapping("/adduser")
	public void adduser(@ModelAttribute("user") User u)
	{
		System.out.println(u.getName()+" "+u.getEmail());
	}
	
}
