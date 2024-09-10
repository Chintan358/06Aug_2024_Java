package J005_oops;

class P
{
	P()
	{
		System.out.println("P constror calling..");
	}
}

class Q extends P
{
	Q()
	{
		super();
		System.out.println("Q constror calling..");
	}
	
	Q(int i)
	{
		this();
		System.out.println("i : "+i);
	}
}


class R extends Q
{
	R()
	{
		
		super(10);
		System.out.println("R constror calling..");
	}
}




public class O008_ConstructorChainig {
	public static void main(String[] args) {
		
		R r = new R();
		
	}
}
