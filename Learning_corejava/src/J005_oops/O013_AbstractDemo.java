package J005_oops;

abstract class Abs
{
	public abstract void display();
	
	public void show()
	{
		System.out.println("Show...");
	}
}

class AbsImpl extends Abs
{

	@Override
	public void display() {
		System.out.println("running display...");
	}
	
}



public class O013_AbstractDemo {
	public static void main(String[] args) {
		
		//Abs abs = new Abs();
		AbsImpl imp = new AbsImpl();
		imp.display();
		imp.show();
		
	}
}
