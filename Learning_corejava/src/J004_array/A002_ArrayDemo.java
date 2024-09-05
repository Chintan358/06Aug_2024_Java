package J004_array;

import java.util.Scanner;

public class A002_ArrayDemo {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size for an array : ");
		int size = sc.nextInt();
		
		int a[] = new int[size];
		
		for (int i = 0; i < a.length; i++) {
			
			System.out.println("Enter value for index : "+i);
			a[i] = sc.nextInt();
		}
		
		
		
		System.out.println("*********************");
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		
	}
}
