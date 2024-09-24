package J005_oops;

/*final*/ class Abc
{
	/* final */ public void run()
	{
		
	}
}

class Xyz extends Abc
{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
	}
}

public class O016_Final {
	public static void main(String[] args) {
		
		
		final int a = 10;
		//a = 20;
		System.out.println(a);
		
	}
}
