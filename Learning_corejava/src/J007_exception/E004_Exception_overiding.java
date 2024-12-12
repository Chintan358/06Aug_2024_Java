package J007_exception;

import java.io.FileNotFoundException;
import java.io.IOError;
import java.io.IOException;

class A
{
	public void display() throws IOException
	{
		
	}
}

class B extends A
{
	@Override
	public void display() throws FileNotFoundException
	{
		// TODO Auto-generated method stub
		//super.display();
	}
}

public class E004_Exception_overiding {
	public static void main(String[] args) {
		
	}
}
