package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.model.Student;
import com.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	StudentService service;
	
	@GetMapping("/")
	public String index(Model model)
	{
		model.addAttribute("student",new Student());
		model.addAttribute("students", service.viewAllStudents());
		return "index";
	}
	
	@PostMapping("/addStudent")
	public String addStudent(@ModelAttribute("student") Student st)
	{
		service.addorupdateStudent(st);
		return "redirect:/";
	}
	
	@GetMapping("/delete")
	public String deleteStudent(@RequestParam("did") int id)
	{
		service.deleteStudent(id);
		return "redirect:/";
	}
	
	@GetMapping("/edit")
	public String editStudent(@RequestParam("eid") int id,Model model)
	{
		model.addAttribute("student",service.getById(id));
		model.addAttribute("students", service.viewAllStudents());
		return "index";
	}
	
	
	
}
