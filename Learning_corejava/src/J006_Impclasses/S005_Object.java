package J006_Impclasses;



class Demo
{
	public void print()
	{
		
	}
	
	@Override
	public String toString() {
		
		return "Hello";
	}
}

public class S005_Object {
	public static void main(String[] args) {
		
		
		Demo d  = new Demo();
		System.out.println(d);
		System.out.println(d.getClass());
	
		
	}
}
