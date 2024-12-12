package J001_basic;

import J005_oops.O009_AccessModifier;

public class Datatypes  {
	public static void main(String[] args) {
		
		
		byte b = -128;
		
		short s = 32767;
		
		int i = 12003727;
		
		long l = 6464656565l;
		
		
		float f = 236.235654654f;
		double d = 5656.565656546;
		
		//System.out.println(f);
		//System.out.println(d);
		
		char c = 'A';
		
		boolean bool = true;
		
		//String str = "Pramod";
		
		//datatype casting
		
		//widning - implicite
		int a = 10;   //4
		long a1 = a;  //8
		
		
		//nerrowing - explicite
		long k = 121212565; //8
		int j = (int) k;        //4
		
		
		int x = 'W';
		System.out.println(x);
		
		char ch = 55;
		System.out.println(ch);
		

		
	}
}
