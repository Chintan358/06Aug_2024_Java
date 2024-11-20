package J008_fileio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class F005_Serealization {
	public static void main(String[] args) {
		
		
		Student st  = new Student();
		
		try {
			FileOutputStream fos = new FileOutputStream("D:\\Chintan_Donotdelete\\Files\\data.ser");
			ObjectOutputStream os = new ObjectOutputStream(fos);
			os.writeObject(st);
			
			System.out.println("done...");
		
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
