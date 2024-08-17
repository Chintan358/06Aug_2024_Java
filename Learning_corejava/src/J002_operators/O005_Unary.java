package J002_operators;

public class O005_Unary {
	public static void main(String[] args) {
		
		
		int a = 13;
		int b = ++a - a-- + ++a + a-- + a--;
			   
				
		System.out.println("a : "+a);  
		System.out.println("b : "+b); 
		
		
	}
}
