package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("saving")
public class SavingAccount implements Account {

	@Autowired
	@Qualifier("corporateUser")
	User user;
	
	@Override
	public void deposite() {
		
		System.out.println("Saving account calling....");
		user.userDetails();
	}

}
