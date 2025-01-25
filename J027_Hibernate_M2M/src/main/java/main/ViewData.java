package main;



import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Student;
import model.Subject;

public class ViewData {
	
	public static void main(String[] args) {
		
		
		SessionFactory sf  =new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Subject.class)
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		
		
		List<Student> students = s.createQuery("from Student").list();
		for(Student std : students)
		{
			System.out.println(std.getId()+" "+std.getStName());
			for(Subject sub : std.getSubjects())
			{
				System.out.println(sub.getId()+" "+sub.getSubName());
			}
			System.out.println("********************");
		}
		
		
		
	}
}
