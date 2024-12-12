package pettern;

public class P3 {
	public static void main(String[] args) {
		
//		*****
//		****
//		***
//		**
//		*
		
		int lines = 15;
		int starCount = lines;
		for(int j=1;j<=lines;j++)
		{
			for(int i=1;i<=starCount;i++)
			{
				System.out.print("*");
			}
			System.out.println();
			starCount--;
		}
		
		
		
	}
}
