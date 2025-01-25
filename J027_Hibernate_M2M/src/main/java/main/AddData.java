package main;

import java.awt.datatransfer.Transferable;
import java.rmi.StubNotFoundException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



import model.Student;
import model.Subject;


public class AddData {
	
	public static void main(String[] args) {
		
		
		SessionFactory sf  =new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.addAnnotatedClass(Subject.class)
				.buildSessionFactory();
		
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		
		
//		Subject s1 = new Subject();
//		s1.setSubName("Java");
//		
//		Subject s2 = new Subject();
//		s2.setSubName("Php");
//		
//		Student st = new Student();
//		st.setStName("Ronny");
//		st.addSubject(s1);
//		st.addSubject(s2);
		
		Subject s1 = new Subject();
		s1.setSubName("Node");
		
		Subject s2 = s.load(Subject.class, 2);
		
		
		Student st = new Student();
		st.setStName("Pramod");
		st.addSubject(s1);
		st.addSubject(s2);
		
		
		s.save(s1);
		
		s.save(st);
		
		
		
		
		tx.commit();
		
		
	}
}
