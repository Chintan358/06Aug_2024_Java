package com;

import org.springframework.stereotype.Component;

@Component
public class RetailUser implements User {

	@Override
	public void userDetails() {
		
		System.out.println("Retail user information : ");

	}

}
