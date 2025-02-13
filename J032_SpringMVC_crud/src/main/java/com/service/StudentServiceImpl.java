package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.StudentDao;
import com.model.Student;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentDao studentDao;
	
	@Override
	public void addorupdateStudent(Student st) {
		// TODO Auto-generated method stub
		studentDao.addorupdateStudent(st);
	}

	@Override
	public List<Student> viewAllStudents() {
		// TODO Auto-generated method stub
		return studentDao.viewAllStudents();
	}

	@Override
	public Student getById(int id) {
		// TODO Auto-generated method stub
		return studentDao.getById(id);
	}

	@Override
	public void deleteStudent(int id) {
		// TODO Auto-generated method stub
		studentDao.deleteStudent(id);
	}

}
