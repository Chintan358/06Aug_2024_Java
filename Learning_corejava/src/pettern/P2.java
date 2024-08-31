package pettern;

public class P2 {
	public static void main(String[] args) {
		
//		*
//		**
//		***
//		****
//		*****
		
		int lines = 5;
		int startCount = 1;
		
		for(int j=1;j<=lines;j++)
		{
			for(int i=1;i<=startCount;i++)
			{
				System.out.print("*");
			}
			System.out.println();
			startCount++;
		}
		
		
		
	}
}
