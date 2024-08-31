package pettern;

public class P11 {
	public static void main(String[] args) {
		
//		1
//		1 0 
//		1 0 1
//		1 0 1 0 
//		1 0 1 0 1
		
		int lines = 5;
		int startCount = 1;
		
		for(int j=1;j<=lines;j++)
		{
			for(int i=1;i<=startCount;i++)
			{
				System.out.print(i%2);
			}
			System.out.println();
			startCount++;
		}
		
		
		
	}
}
