package pettern;

public class P13 {
	public static void main(String[] args) {
		
//		2
//		3 4
//		4 5 6
//		5 6 7 8 
//		6 7 8 9 10
		
		int lines = 5;
		int startCount = 1;
		
		for(int j=1;j<=lines;j++)
		{
			for(int i=1;i<=startCount;i++)
			{
				System.out.print(j+i);
			}
			System.out.println();
			startCount++;
		}
		
		
		
	}
}
