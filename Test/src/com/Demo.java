package com;

interface IsDiscount
{
	
}

class Employee 
{
	
}

class Disountele
{
	boolean b = false;
	public boolean ischeck(Object e)
	{
		if(e instanceof IsDiscount)
		{
			b  =true;
		}
		
		return b;
	}
}

public class Demo {
		public static void main(String[] args) {
			
			
			Disountele ele = new Disountele();
			System.out.println(ele.ischeck(new Employee()));
			
		}
}
