package com;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		
		
		ClassPathXmlApplicationContext contxt  =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Student st = (Student) contxt.getBean("std");
		st.display();
		
		
		
	}
}
