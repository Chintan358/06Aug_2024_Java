package main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Courses;
import model.Instructor;
import model.Student;
import model.YoutubeChannel;

public class ViewData {
	public static void main(String[] args) {
		
		try {
			
		
		SessionFactory sf = 
				new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(YoutubeChannel.class)
				.addAnnotatedClass(Student.class)
				.addAnnotatedClass(Courses.class)
				.buildSessionFactory();
		
		Session s = sf.openSession();
		Transaction tx = null;
		
		tx = s.beginTransaction();
		
		Instructor ins = s.load(Instructor.class, 1);
		System.out.println(ins.getInsName());
		System.out.println(ins.getCourses());
	
		
		
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
	}
}
