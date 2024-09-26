package J007_exception;

class Demo
{
	public void print() throws ClassNotFoundException
	{
		Class.forName("pettern.P1");
	}
}

public class E002_ComplieTimeDemo {
	public static void main(String[] args) {
		
		
//		try {
//			Class.forName("pettern.P1");
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
	
		Demo d = new Demo();
		try {
			d.print();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
