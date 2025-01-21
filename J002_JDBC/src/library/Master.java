package library;

import java.util.Scanner;

public class Master {
	public static void main(String[] args) {
		
		int choice = 0;
		do	
		{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Choice : ");
		System.out.println("0 : Exit");
		System.out.println("1 : Add Book");
		System.out.println("2 : View Book");
		System.out.println("3 : Delete Book");
		System.out.println("4 : Issue Book");
		choice = sc.nextInt();
		
		Oprations op = new Oprations();
		
		if(choice==1)
		{
			System.out.println("*******Add Book******");
			System.out.println("Enter Book name : ");
			String name = sc.next();
			System.out.println("Enter qty : ");
			int qty = sc.nextInt();
			op.addBook(name,qty);
		}
		else if(choice==2)
		{
			System.out.println("*******View Book******");
			op.viewBook();
		}
		else if(choice==3)
		{
			System.out.println("*******Delete book******");
			System.out.println("Enter Book name : ");
			String name = sc.next();
			op.deleteBook(name);
		}
		else if(choice==4)
		{
			System.out.println("*********Issue book**********");
			System.out.println("Enter Book name : ");
			String name = sc.next();
			op.issueBook(name);
			
		}
		else if(choice==0)
		{
			System.out.println("***********Exit**********");
		}
		else
		{
			System.out.println("Invalid Choice");
		}
		
		}while(choice!=0);
		
		
		
		
		
	}
}
