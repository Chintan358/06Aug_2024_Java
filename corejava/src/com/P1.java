package com;

public class P1 {
	public static void main(String[] args) {
		
//		int lines = 5;
//		for(int j=1;j<=lines;j++)
//		{
//			for(int i=1;i<=lines;i++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		int lines = 5;
//		int startCount=1;
//		int spaceCount=lines-1;
//		for(int j=1;j<=lines;j++)
//		{
//			for(int k=1;k<=spaceCount;k++)
//			{
//				System.out.print(" ");
//			}
//			
//			for(int i=1;i<=startCount;i++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//			startCount++;
//			spaceCount--;
//		}
		
		
//		int lines = 5;
//		int startCount=lines;
//		int spaceCount=0;
//		for(int j=1;j<=lines;j++)
//		{
//			for(int k=1;k<=spaceCount;k++)
//			{
//				System.out.print(" ");
//			}
//			
//			for(int i=1;i<=startCount;i++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//			startCount--;
//			spaceCount++;
//		}
		
//		int lines = 5;
//		int startCount=1;
//		int spaceCount=lines-1;
//		for(int j=1;j<=lines;j++)
//		{
//			for(int k=1;k<=spaceCount;k++)
//			{
//				System.out.print(" ");
//			}
//			
//			for(int i=1;i<=startCount;i++)
//			{
//				System.out.print("* ");
//			}
//			System.out.println();
//			startCount++;
//			spaceCount--;
//		}
		
		
//		int lines = 5;
//		int startCount=1;
//		int spaceCount=lines-1;
//		for(int j=1;j<=lines;j++)
//		{
//			for(int k=1;k<=spaceCount;k++)
//			{
//				System.out.print(" ");
//			}
//			
//			for(int i=1;i<=startCount;i++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//			startCount+=2;
//			spaceCount--;
//		}
//		
		
		int lines = 15;
		int startCount=1;
		int spaceCount=lines-1;
		int mid = (lines/2)+1;
		for(int j=1;j<=lines;j++)
		{
			for(int k=1;k<=spaceCount;k++)
			{
				System.out.print(" ");
			}
			
			for(int i=1;i<=startCount;i++)
			{
				System.out.print("* ");
			}
			System.out.println();
			if(j<mid)
			{
			startCount++;
			spaceCount--;
			}
			else
			{
				startCount--;
				spaceCount++;
			}
		}
		
		
		
	}
}
