package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.User;

public class UserDao {
	
	SessionFactory sf = null;
	public UserDao() {
			
		sf = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(User.class)
				.buildSessionFactory();
	}
	
	public int addUser(User u)
	{
		int i=0;
		Transaction  tx = null;
		try {
			Session s = sf.openSession();
			tx = s.beginTransaction();
			s.saveOrUpdate(u);
			tx.commit();
			i = 1;
		} catch (Exception e) {
			// TODO: handle exception
			tx.rollback();
		}
		
		return i;
	}

	public List<User> viewAllUsers() {
		
		Transaction tx  =null;
		Session s = sf.openSession();
		tx = s.beginTransaction();
		return s.createQuery("from User").list();
	}

	public int deleteUser(int uid) {
		
		int i=0;
		Transaction  tx = null;
		try {
			Session s = sf.openSession();
			tx = s.beginTransaction();
			s.delete(s.get(User.class, uid));
			tx.commit();
			i = 1;
		} catch (Exception e) {
			// TODO: handle exception
			tx.rollback();
		}
		
		return i;
	}

	public User userById(int id) {
		
		User u = null;
		Transaction  tx = null;
		try {
			Session s = sf.openSession();
			tx = s.beginTransaction();
			u = s.get(User.class, id);
			
		} catch (Exception e) {
			// TODO: handle exception
			tx.rollback();
		}
		
		return u;
	}
}
