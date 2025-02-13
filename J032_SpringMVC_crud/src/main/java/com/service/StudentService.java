package com.service;

import java.util.List;

import com.model.Student;

public interface StudentService {
		
	public void addorupdateStudent(Student st);
	public List<Student> viewAllStudents();
	public Student getById(int id);
	public void deleteStudent(int id);
}	
