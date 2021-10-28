package UsermanagementJunitPrograms;

import java.util.regex.Pattern;

public class EmailValidationMain {
	final String EMAIL = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
	
	public boolean validateEmails(String email1) {
		Pattern pattern = Pattern.compile(EMAIL);
		return pattern.matcher(email1).matches();
	}
	
}
