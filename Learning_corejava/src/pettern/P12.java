package pettern;

public class P12 {
	public static void main(String[] args) {
		
//		1
//		1 4
//		1 4 9
//		1 4 9 16 
//		1 4 9 16 25
		
		int lines = 5;
		int startCount = 1;
		
		for(int j=1;j<=lines;j++)
		{
			for(int i=1;i<=startCount;i++)
			{
				System.out.print(i*i+" ");
			}
			System.out.println();
			startCount++;
		}
		
		
		
	}
}
