package com.dao;

import java.util.List;

import com.model.Student;

public interface StudentDao {
	
	public void addorupdateStudent(Student st);
	public List<Student> viewAllStudents();
	public Student getById(int id);
	public void deleteStudent(int id);
}
