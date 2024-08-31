package pettern;

public class P6 {
	public static void main(String[] args) {
		
//		    *
//		   * *
//		  * * *
//		 * * * *
//		* * * * *
		
		int lines = 5;
		int startCount = 1;
		int spacecount = lines-1;
		for(int j=1;j<=lines;j++)
		{
			for(int k=1;k<=spacecount;k++)
			{
				System.out.print(" ");
			}
			
			for(int i=1;i<=startCount;i++)
			{
				System.out.print("* ");
			}
			System.out.println();
			startCount++;
			spacecount--;
		}
		
		
		
	}
}
