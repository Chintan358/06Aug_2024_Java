package main;

import java.awt.datatransfer.Transferable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import model.Category;
import model.Product;


public class AddData {
	
	public static void main(String[] args) {
		
		
		SessionFactory sf  =new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Category.class)
				.addAnnotatedClass(Product.class)
				.buildSessionFactory();
		
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		
		
		
		Category c = new Category();
		c.setCatname("Cloths");
		
		Product p = new Product();
		p.setPname("Shirt");
		p.setCategory(c);
		
		Product p1 = new Product();
		p1.setPname("Cap");
		p1.setCategory(c);
		
		s.save(c);
		s.save(p1);
		s.save(p);
		
		tx.commit();
		
		
	}
}
