package com;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		
		
		AnnotationConfigApplicationContext cx = 
				new AnnotationConfigApplicationContext(AppConfig.class);
		
		Account s = cx.getBean("saving",Account.class);
		s.deposite();
		
//		Account s1 = cx.getBean("loanAccount",Account.class);
//		s1.deposite();
		
	}
}
