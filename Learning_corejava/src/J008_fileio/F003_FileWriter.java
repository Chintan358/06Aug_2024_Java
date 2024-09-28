package J008_fileio;

import java.io.FileWriter;
import java.io.IOException;

public class F003_FileWriter {
	public static void main(String[] args) {
		
		
		FileWriter fw = null;
		
		try {
			fw = new FileWriter("D:\\Chintan_Donotdelete\\Files\\home.txt");
			String str = "This is my foirst writer program";
			fw.write(str);
			fw.flush();
			System.out.println("Done!!!");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
