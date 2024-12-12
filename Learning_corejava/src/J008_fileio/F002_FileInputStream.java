package J008_fileio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class F002_FileInputStream {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter file name : ");
		String name = sc.next();
		
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("D:\\Chintan_Donotdelete\\Files\\"+name+".txt");
			int i =  fis.read();
			
			while(i != -1)
			{
				char ch = (char) i;
				System.out.print(ch);
				i = fis.read();
				
			}
			
		
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
