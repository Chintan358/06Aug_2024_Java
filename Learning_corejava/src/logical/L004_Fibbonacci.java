package logical;

public class L004_Fibbonacci {
	public static void main(String[] args) {
		
		
		//0 1 1 2 3 5 8 13 21 34 55 89 
		
		
		int a = 0;
		int b = 1;
		System.out.print(a+" "+b);
		for(int i=1;i<=10;i++)
		{
			int c = a+b;
			System.out.print(" "+c);
			
			a = b;
			b = c;
		}
		
		
		
		
	}
}
