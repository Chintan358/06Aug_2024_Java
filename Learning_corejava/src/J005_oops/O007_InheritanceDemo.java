package J005_oops;

//Base-Parent-Super
class A
{
	int id = 10;
	
	public void print()
	{
		System.out.println("runing print...");
	}
}

//Drived-child-sub
class B extends A
{
	int id = 50;
	
	public void show()
	{
		int id = 100;
		
		System.out.println("Id : "+id);
		System.out.println("Id : "+this.id);
		System.out.println("Id : "+super.id);
		System.out.println("runing show...");
	}
}

public class O007_InheritanceDemo {
	public static void main(String[] args) {
		
		
		B b = new B();
		b.show();
		
		
	}
}
