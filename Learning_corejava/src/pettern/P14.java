package pettern;

public class P14 {
	public static void main(String[] args) {
		
//		A
//		B C
//		D E F
//		G H I J
//		K L M N O
		
		int lines = 5;
		int startCount = 1;
		char ch = 'A';
		for(int j=1;j<=lines;j++)
		{
			for(int i=1;i<=startCount;i++)
			{
				System.out.print(ch++);
			}
			System.out.println();
			startCount++;
		}
		
		
		
	}
}
