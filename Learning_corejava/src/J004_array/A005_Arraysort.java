package J004_array;

import java.util.Arrays;

public class A005_Arraysort {
	
	public static void main(String[] args) {
		
		
		int a[] = {10,2,36,56,4,5,12,13};
		
		//10
		//
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				int temp =0;
				if(a[i]>a[j])
				{
					temp  =a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			System.out.println(a[i]);
		}
		
		
	}
}
