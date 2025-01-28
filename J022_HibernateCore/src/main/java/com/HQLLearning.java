package com;

import java.util.List;

import org.hibernate.query.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HQLLearning {
	public static void main(String[] args) {
		
		SessionFactory sf = 
				new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Tops.class)
				.buildSessionFactory();
				
				Session s = sf.openSession();
				Transaction tx  =null;
				tx = s.beginTransaction();
				
				
//				Query qry = s.createQuery("from Tops");
//				Query qry = s.createQuery("from Tops t where t.id=4");
				Query qry = s.createQuery("from Tops");
				
//				List<Tops> tops = qry.list();
//				for(Tops t : tops)
//				{
//					//System.out.println(t);
//					System.out.println(t.getName());
//				}
				
				
				Query q  = s.createQuery("from Tops t where t.id=:id and t.name=:name");
				q.setParameter("id", 4);
				q.setParameter("name", "Tony");
				
				Tops t =  (Tops) q.uniqueResult();
				if(t==null)
				{
					System.out.println("Invalid credentials");
				}
				else
				{
					System.out.println("Welcome : "+t.getName());
				}
				
				
				
	}
}
