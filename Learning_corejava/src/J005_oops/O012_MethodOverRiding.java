package J005_oops;

class Parent
{
	public void show()
	{
		System.out.println("Running show mwthod of class Parent");
	}
}

class Child extends Parent
{
	@Override
	public void show() {
		System.out.println("Running show mwthod of class child");
		super.show();
	}
}

public class O012_MethodOverRiding {
	public static void main(String[] args) {
		
		Child c = new Child();
		c.show();
		
	}
}
