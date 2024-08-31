package pettern;

public class P8 {
	public static void main(String[] args) {
		
//		    *
//		   ***
//		  *****
//		   ***
//		    *
		
		int lines = 15;
		int startCount = 1;
		int spacecount = lines-1;
		int mid = (lines/2)+1;
				
		for(int j=1;j<=lines;j++)
		{
			for(int k=1;k<=spacecount;k++)
			{
				System.out.print(" ");
			}
			
			for(int i=1;i<=startCount;i++)
			{
				System.out.print("*");
			}
			System.out.println();
			if(j<mid)
			{
				startCount+=2;
				spacecount--;
			}
			else
			{
				startCount-=2;
				spacecount++;
			}
		}
		
		
		
	}
}
