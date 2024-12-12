package J004_array;

public class A001_ArrayDemo {
	public static void main(String[] args) {
		
		//declaration
		int a[] = new int[5];
		
		//intialization
		a[0] = 10;
		a[1] = 20;
		
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		System.out.println("***********************");
		
		
		int b[] = {10,20,30,40,50,60};
		
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
		
		System.out.println("***********************");
		
		String str[] = {"java","php","android"};
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
		
		System.out.println("*****************************");
		
		
		char ch[] = {'a','b','c','d'};
		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);
		}
		
		
		
		
		
	}
}
