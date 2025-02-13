package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.model.Student;

@Transactional
@Repository
public class StudentDaoImpl implements StudentDao {

	@Autowired
	SessionFactory factory;
	
	@Override
	public void addorupdateStudent(Student st) {
		
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.saveOrUpdate(st);
		tx.commit();
		
	}

	@Override
	public List<Student> viewAllStudents() {
		
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		return session.createQuery("from Student").list();
	}

	@Override
	public Student getById(int id) {
		
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		return session.get(Student.class, id);
	}

	@Override
	public void deleteStudent(int id) {
		
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.delete(session.get(Student.class, id));
		tx.commit();	
	}
	
	
}
