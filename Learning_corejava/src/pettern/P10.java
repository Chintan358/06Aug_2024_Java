package pettern;

public class P10 {
	public static void main(String[] args) {
		
//		0
//		1 0 
//		0 1 0
//		1 0 1 0 
//		0 1 0 1 0
		
		int lines = 5;
		int startCount = 1;
		
		for(int j=1;j<=lines;j++)
		{
			for(int i=1;i<=startCount;i++)
			{
				if(j%2==i%2)
				{
					System.out.print("0");
				}
				else
				{
					System.out.print("1");
				}
			}
			System.out.println();
			startCount++;
		}
		
		
		
	}
}
