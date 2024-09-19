package J005_oops;

abstract class Account {
	double amount = 0;

	public abstract void deposite(double amt);

	public abstract void withdrow(double amt);

	public void getBalance() {
		System.out.println("Your current balance is : " + amount);
	}
}

class SavingAccount extends Account {

	@Override
	public void deposite(double amt) {
		amount = amount + amt;

	}

	@Override
	public void withdrow(double amt) {

		if (amount < amt) {
			System.out.println("Insufficinet amount...");
		} else {
			amount = amount - amt;
		}

	}

}

class LoanAccount extends Account {

	@Override
	public void deposite(double amt) {

		if (amount < amt) {
			System.out.println("You dont have any lonas...");
		} else {
			amount = amount - amt;
		}
	}

	@Override
	public void withdrow(double amt) {

		amount = amount + amt;

	}

}

public class O014_Banking {
	public static void main(String[] args) {

//		SavingAccount s = new SavingAccount();
//		s.getBalance();
//		s.deposite(5000);
//		s.getBalance();
//		s.withdrow(4000);
//		s.getBalance();
		
		
		Account ln = new LoanAccount();
		ln.getBalance();
		//ln.deposite(6000);
		ln.withdrow(6000);
		ln.getBalance();
		ln.deposite(3000);
		ln.getBalance();
		
		
		
	}
}
