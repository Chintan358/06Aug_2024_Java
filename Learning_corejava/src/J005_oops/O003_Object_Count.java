package J005_oops;

class Demo
{
	static int count = 0;
	Demo()
	{
		count++;	
	}
}

public class O003_Object_Count {

	public static void main(String[] args) {
		
		Demo d1 = new Demo();
		Demo d2 = new Demo();
		Demo d3 = new Demo();
		
		
		System.out.println(Demo.count);
	}
}
