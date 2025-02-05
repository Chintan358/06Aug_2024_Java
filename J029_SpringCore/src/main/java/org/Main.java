package org;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		
		
		ApplicationContext cx  = 
				new ClassPathXmlApplicationContext("applicationContext1.xml");
		
		User u =cx.getBean("user",User.class);
		u.display();
		
		
		
		
	}
}
