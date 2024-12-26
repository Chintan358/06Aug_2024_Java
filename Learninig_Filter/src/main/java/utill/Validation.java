package utill;

import java.util.regex.Pattern;

public class Validation {
	
		public static boolean emailValidation(String email)
		{
			String regEx = "^[a-zA-Z0-9_]+@[a-zA-Z]+\\.[a-z]{2,4}$";
			return Pattern.compile(regEx)
				      .matcher(email)
				      .matches();
		}
		
		
}
