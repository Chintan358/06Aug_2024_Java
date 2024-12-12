package J010_thread;

import java.util.Scanner;

class Account
{
	double amount;

	public Account(double amount) {
		super();
		this.amount = amount;
	}
	
	public boolean check(double amt)
	{
		boolean b  =false;
		
		if(amt>amount)
		{
			b = false;
		}
		else
		{
			 b = true;
		}
		
		return b;
	}
	
	public void withdrow(double amt)
	{
		amount = amount-amt;
		System.out.println("Current balance..."+amount);
	}
}


class Customer extends Thread
{
	String name;
	Account account;
	public Customer(String name,Account account) {
		this.name = name;
		this.account =account;
	}
	
	@Override
	public void run() {
		
		synchronized (account) {
			
		
							Scanner sc = new Scanner(System.in);
							System.out.println("Enter amount to withdrow : "+name);
							double amount = sc.nextDouble();
							
							if(account.check(amount))
							{
								account.withdrow(amount);
								System.out.println("amount debited...."+name);
								
							}
							else
							{
								System.out.println("Insuffcient amount !!!!");
							}
							
		}
		
	}
}

public class T004_Syncronization {
	
	public static void main(String[] args) {
		
		
		Account a1 = new Account(10000);
		
		Customer c1 = new Customer("sujal",a1);
		Customer c2 = new Customer("pramod",a1);
		
		c1.start();
		c2.start();
		
	}
	
}
