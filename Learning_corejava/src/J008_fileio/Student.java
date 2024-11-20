package J008_fileio;

import java.io.Serializable;

public class Student implements Serializable {
	
	int id=10;
	String name="tesdfft";
	transient String email="test@gmail.com";
	
	
	public void display()
	{
		System.out.println(id+" "+name+" "+email);
	}
}
