package J004_array;

import java.util.Iterator;

public class A003_ArrayOpration {
	public static void main(String[] args) {
		
		
		int a[] = {10,20,95,6,78,95,56,87,63,54,22};
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		
		System.out.println("sum : "+sum);
		System.out.println("avg : "+(sum/a.length));
		
		int max = a[0]; //78
		int min = a[0];
		int smax = a[1];
		for (int i = 0; i < a.length; i++) {
			
			if(a[i]>max)
			{
				smax = max;
				max = a[i];
			}
			
			if(a[i]<min)
			{
				min = a[i];
			}
		}
		
		System.out.println("Max : "+max);
		System.out.println("Min : "+min);
		System.out.println("SMax : "+smax);
	}
}
