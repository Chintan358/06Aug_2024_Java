package J006_Impclasses;

public class S002_StringMethods {
	public static void main(String[] args) {
		
		String str = "Sun Rises in East";
		
		System.out.println(str.length());
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str.charAt(8));
		System.out.println(str.indexOf('u'));
		System.out.println(str.lastIndexOf('s'));
		System.out.println(str.substring(5,9));
		System.out.println(str.replace('s', 'K'));
		System.out.println(str.trim());
		System.out.println("**********************");
		
		String arr[] = str.split(" ");
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("*****************************");
		
		char ch[] = str.toCharArray();
		
		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);
		}
		
		
		System.out.println("*************************");
		
		byte b[] = str.getBytes();
		
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
	}
}
