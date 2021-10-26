package UsermanagementJunitPrograms;

import java.util.regex.Pattern;

public class UserValidator {

	private static final String FIRST_NAME_PATTERN = "^([A-Z]{1}[a-z]{2,})";
	private static final String LAST_NAME_PATTERN = "^([A-Z]{1}[a-z]{2,})";
	private static final String EMAIL_PATTERN =  "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
	private static final String MOBILE_NO_PATTERN =  "^(\\d{2})( )([7-9]{1})(\\d{9})";
	private static final String PASSWORD = "^([A-Z]{1}[a-zA-Z]{8,})";
	public boolean validateFirstName(String fname) {
		Pattern pattern = Pattern.compile(FIRST_NAME_PATTERN);
		return pattern.matcher(fname).matches();
	}
	
	public boolean validateLastName(String lname) {
		Pattern pattern = Pattern.compile(LAST_NAME_PATTERN);
		return pattern.matcher(lname).matches();
	}
	
	 public boolean validateEmail(String email){
	        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
	        return pattern.matcher(email).matches();
	    }
	 
	 public boolean validateMobile(String mobile){
	        Pattern pattern = Pattern.compile(MOBILE_NO_PATTERN);
	        return pattern.matcher(mobile).matches();
	    }
	 
	 public boolean validatePassword(String password){
	        Pattern pattern = Pattern.compile(PASSWORD);
	        return pattern.matcher(password).matches();
	    }
}
