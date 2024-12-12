package J007_exception;

class AgeInvalidException extends Exception
{
	
}

class AgeChecker
{
	
	public void isValid(int age) throws AgeInvalidException
	{
		if(age>=18)
		{
			System.out.println("age is Valid");
		}
		else
		{
			//System.out.println("Invalid age");
			throw new AgeInvalidException();
		}
	}
}


public class E003_CustomeException {
	public static void main(String[] args) {
		
		
		AgeChecker age = new AgeChecker();
//		try {
//			age.isValid(17);
//		} catch (AgeInvalidException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		System.out.println("Program started..");
		
		try {
			age.isValid(17);
		} catch (AgeInvalidException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Program ended");
		
	}
}
