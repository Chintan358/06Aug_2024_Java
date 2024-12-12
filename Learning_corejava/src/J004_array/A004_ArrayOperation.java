package J004_array;

public class A004_ArrayOperation {
	public static void main(String[] args) {
		
//		int a[] = {10,20,30,40,50};
//		int b[] = new int[a.length];
//		
//		for (int i = 0; i < a.length; i++) {
//			b[i] = a[i];
//		}
//		
//		for (int i = 0; i < b.length; i++) {
//			System.out.println(b[i]);
//		}
		
		
		int a[] = {10,20,30};
		int b[] = {1,2,3};
		int c[] = new int[a.length+b.length];
		
		
		for (int i = 0; i < a.length; i++) {
			c[i] = a[i];
		}
		
		for (int i = 0; i < b.length; i++) {
			c[a.length+i] = b[i];
		}
		
		
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
		
	}
}
