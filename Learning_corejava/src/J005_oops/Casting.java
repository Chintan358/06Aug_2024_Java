package J005_oops;


class Test
{
	
}

class Pc extends Test
{
	
}

public class Casting {
	public static void main(String[] args) {
		
		//Test t = new Pc(); // upcasting
		
		//Pc p = new Test(); //down casting
		
		System.out.println(new Pc() instanceof Test);
		System.out.println(new Test() instanceof Pc);
	}
}
