package J005_oops;

class Pen
{
	//data member
	int price = 10;
	static String color = "Red";
	String company = "Cello";
	
	//function member
	void toWrite()
	{
		System.out.println(price+" "+color+" "+company);
	}
	
	public static void display()
	{
		System.out.println("display calling...");
	}
}


public class O001_ClassDemo {
	public static void main(String args[]) {
	
		Pen.color = "Black";
		
		Pen p1 = new Pen();
		p1.price=50;
		p1.toWrite();
		
		Pen p2 = new Pen();
		p2.toWrite();
		
		Pen p3 = new Pen();
		p3.toWrite();
		
	
		Pen.display();
		
		
	
	}
}
