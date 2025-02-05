package com;

import org.springframework.stereotype.Component;

@Component
public class LoanAccount implements Account {

	@Override
	public void deposite() {
		System.out.println("Loan account calling...");

	}

}
