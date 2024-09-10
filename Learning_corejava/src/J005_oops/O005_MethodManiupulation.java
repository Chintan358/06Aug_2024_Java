package J005_oops;


class Calc
{
	public void msg()
	{
		System.out.println("Display message.");
	}
	
	public int square(int num)
	{
		//System.out.println("Square of "+num+" is  "+(num*num));
		int sq = num*num;
		return sq;
	}
	
	public void add(int a, int b)
	{
		System.out.println("Addition is : "+(a+b));
	}
	
	public String myName()
	{
		return "Pramod";
	}
	
	public void addArray(int a[])
	{
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum+=a[i];
		}
		System.out.println("sum  : "+sum);
	}
	
	public int[] revArray(int a[])
	{
		int b[] = new int[a.length];
		int count = 0;
		for(int i=a.length-1;i>=0;i--)
		{
			b[count] = a[i];
			count++;
		}
		
		return b;
	}
	
	public void vararg(int...a)
	{
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
	
}

public class O005_MethodManiupulation {
	public static void main(String[] args) {
		
		Calc c = new Calc();
		c.msg();
		int a = c.square(5);
		int b = c.square(15);
		System.out.println(c.square(25));
		c.add(a,b);
		
		String name = c.myName();
		
		int k[] = {10,20,30,40,50,60};
		int l[] = {52,63,52,63,99,12};
		c.addArray(k);
		c.addArray(l);
		
		int x[] =  c.revArray(l);
		
		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}
		
		System.out.println("**************");
		
		c.vararg(10,20,30,40,50);
		
	}
}
