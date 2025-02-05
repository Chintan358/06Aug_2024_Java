package com;

import org.springframework.stereotype.Component;

@Component
public class CorporateUser implements User {

	@Override
	public void userDetails() {
		System.out.println("corporate user calling...");
	}

}
