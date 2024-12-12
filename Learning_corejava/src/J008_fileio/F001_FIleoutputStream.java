package J008_fileio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;


public class F001_FIleoutputStream {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name : ");
		String name = sc.next();
		System.out.println("enter emial : ");
		String email = sc.next();
		
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("D:\\Chintan_Donotdelete\\Files\\"+name+".txt");
			//String str = "Hello java , Hello Tops";
			
			byte b[] = email.getBytes();
			fos.write(b);
			System.out.println("Data written !!!");
			
			
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		sc.close();
		
		
	}
}
