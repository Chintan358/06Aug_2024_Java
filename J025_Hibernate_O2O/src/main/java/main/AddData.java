package main;

import java.awt.datatransfer.Transferable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Answer;
import model.Questions;

public class AddData {
	
	public static void main(String[] args) {
		
		
		SessionFactory sf  =new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Questions.class)
				.addAnnotatedClass(Answer.class)
				.buildSessionFactory();
		
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		
		Questions q = new Questions();
		q.setQuestionTitle("What is java");
		
		Answer a = new Answer();
		a.setAnwser("Java is oops lang.");
		
		q.setAns(a);
		
		s.save(q);
		
		
		tx.commit();
		
		
	}
}
