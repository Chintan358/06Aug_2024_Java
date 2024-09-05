package J004_array;

public class A007_MDArray {

		
		public static void main(String[] args) {
			
			
			
			int[][] a = new int[3][5];
			
			a[0][0] = 25;
			a[0][1] = 30;
			a[0][2] = 23;
			a[0][3] = 25;
			a[0][4] = 27;
			
			a[1][0] = 25;
			a[1][1] = 30;
			a[1][2] = 23;
			a[1][3] = 25;
			a[1][4] = 27;
			
			
			a[2][0] = 25;
			a[2][1] = 30;
			a[2][2] = 23;
			a[2][3] = 25;
			a[2][4] = 27;
			
			
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<5;j++)
				{
					System.out.print(a[i][j]+" ");
				}
				System.out.println();
			}
			
			
			
			
		}
		
		
		
		
}
