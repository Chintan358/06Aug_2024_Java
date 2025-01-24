package main;



import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Answer;
import model.Questions;

public class ViewData {
	
	public static void main(String[] args) {
		
		
		SessionFactory sf  =new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Questions.class)
				.addAnnotatedClass(Answer.class)
				.buildSessionFactory();
		
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		
		
//		Questions q = s.load(Questions.class, 2);
//		System.out.println(q.getQuestionTitle());
//		System.out.println(q.getAns().getAnwser());
		
		
//		Answer a = s.load(Answer.class, 1);
//		System.out.println(a.getQue().getQuestionTitle());
//		System.out.println(a.getAnwser());
		
		
		List<Questions> que = s.createQuery("from Questions").list();
		for(Questions q : que)
		{
			System.out.println(q.getQuestionTitle());
			System.out.println(q.getAns().getAnwser());
			System.out.println("*************");
		}
		
		
		
	}
}
