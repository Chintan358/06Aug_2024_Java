package main;

import java.awt.datatransfer.Transferable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Answer;
import model.Questions;

public class DeleteData {
	
	public static void main(String[] args) {
		
		
		SessionFactory sf  =new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Questions.class)
				.addAnnotatedClass(Answer.class)
				.buildSessionFactory();
		
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		
		s.delete(s.load(Questions.class, 1));
		
		
		tx.commit();
		
		
	}
}
