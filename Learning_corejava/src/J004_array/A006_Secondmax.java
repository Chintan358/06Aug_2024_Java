package J004_array;

public class A006_Secondmax {
	public static void main(String[] args) {
		
		
		int a[] = {10,20,95,6,78,56,87,63,54,22};
		
		
		int max = a[0];  //10 20 95 95 95 95 
		int smax = a[1]; //20 10 20 78 78 87
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				smax  =max;
				max = a[i];
			}
			else if(a[i]>smax && a[i]!=max)
			{
				smax = a[i];
			}
		}
		
		System.out.println("Max :"+max);
		System.out.println("smax : "+smax);
	}
}
