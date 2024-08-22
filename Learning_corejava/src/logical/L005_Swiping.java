package logical;

public class L005_Swiping {
	public static void main(String[] args) {
		
		
		int a = 10;
		int b = 20;
		
		System.out.println("before swiping...");
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		
//		int temp = a;
//		a = b;
//		b = temp;
		
		a = a+b; //30
		b = a-b; //10
		a = a-b;
		
		System.out.println("after swiping...");
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		
	}
}
