package J001_basic;

import java.util.Scanner;

public class ScaanerDemo {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a : ");
		int a = sc.nextInt();
		System.out.println("enter b : ");
		int b = sc.nextInt();
		System.out.println("enter name : ");
		String name = sc.next();
		
		System.out.println("enter full name");
		sc.nextLine();
		String s = sc.nextLine();
		
		
		System.out.println(a+" "+b+" "+name+" "+s);
		
		
		
		
	}
}
