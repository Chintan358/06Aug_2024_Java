package J006_Impclasses;

import java.util.Random;

public class S006_Wrapper {
	public static void main(String[] args) {
		
		
		int i = 10;
		
		//boxing
		Integer i1 = new Integer(i);
		//auto boxing
		Integer i2 = i;
		
		
		
		Integer k = 15;
		//unboxing
		int k1 = k.intValue();
		//auto unboxing
		int k2 = k;
		
		
		int j = 123456;
		
		Integer j1 = j;
		int length =  j1.toString().length();
		
		System.out.println(length);
		
		
	}
}
