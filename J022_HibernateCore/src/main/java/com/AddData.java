package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AddData {
	public static void main(String[] args) {
		
		Tops t  =new Tops();
		t.setId(5);
		t.setName("Sujal");
		t.setEmail("sujal@gmial.com");
		t.setPhone("4152859685");
		
		
		Configuration cfg = new Configuration();
		cfg = cfg.configure("hibernate.cfg.xml");
		cfg = cfg.addAnnotatedClass(Tops.class);
		
		SessionFactory sf =cfg.buildSessionFactory();
		
		Session s  =sf.openSession();
		
		Transaction tx  =null;
		tx = s.beginTransaction();
		
		s.saveOrUpdate(t);
		
		tx.commit();
		
		
		
		
		
	}
}
