package com;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ViewData {
	public static void main(String[] args) {
		
		SessionFactory sf = 
				new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Tops.class)
				.buildSessionFactory();
				
				Session s = sf.openSession();
				Transaction tx  =null;
				tx = s.beginTransaction();
				
//				Tops t =  s.get(Tops.class, 4);
//				System.out.println(t);
//				System.out.println(t.getId()+" "+t.getName()+" "+t.getEmail());
//		
				List<Tops> tops=  s.createQuery("from Tops").list();
				for(Tops t : tops)
				{
					System.out.println(t.getId()+" "+t.getName()+" "+t.getEmail());
				
				}
				
				
				
	}
}
