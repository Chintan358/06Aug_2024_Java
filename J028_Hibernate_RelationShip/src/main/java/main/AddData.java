package main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Courses;
import model.Instructor;
import model.Student;
import model.YoutubeChannel;

public class AddData {
	public static void main(String[] args) {
		
		try {
			
		
		SessionFactory sf = 
				new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(YoutubeChannel.class)
				.addAnnotatedClass(Student.class)
				.addAnnotatedClass(Courses.class)
				.buildSessionFactory();
		
		Session s = sf.openSession();
		Transaction tx = null;
		
		tx = s.beginTransaction();
		
		Instructor i = new Instructor();
		i.setInsName("Rony");
		
		Instructor i1 = new Instructor();
		i1.setInsName("Akshay");
		
		YoutubeChannel yt = new YoutubeChannel();
		yt.setChName("Java with Rony");
		yt.setInstructor(i);
		
		YoutubeChannel yt1 = new YoutubeChannel();
		yt1.setChName("Python with Akky");
		yt1.setInstructor(i1);
		
		
		Courses c = new Courses();
		c.setSubName("Java");
		c.setInstructor(i);
		
		Courses c1 = new Courses();
		c1.setSubName("Python");
		c1.setInstructor(i1);
			
		Student st = new Student();
		st.setStName("Manish");
		st.addCourse(c);
		
		Student st1 = new Student();
		st1.setStName("Pramod");
		st1.addCourse(c1);
		
		s.save(i);
		s.save(i1);
		s.save(yt);
		s.save(yt1);
		s.save(c);
		s.save(c1);
		s.save(st);
		s.save(st1);
		
		
		tx.commit();
		
		
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
	}
}
