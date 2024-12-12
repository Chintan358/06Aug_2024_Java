package J008_fileio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class F006_deserialize {
	public static void main(String[] args) {
	
		try {
			FileInputStream fis = new FileInputStream("D:\\Chintan_Donotdelete\\Files\\data.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Student st =  (Student) ois.readObject();
			
			st.display();
		
		
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
