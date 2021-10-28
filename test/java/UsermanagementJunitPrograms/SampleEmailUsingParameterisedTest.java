package UsermanagementJunitPrograms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class SampleEmailUsingParameterisedTest {
	private String emailTest;
	private boolean expectedResult;
	

	public SampleEmailUsingParameterisedTest(String email,boolean expectedResult) {

		this.emailTest = email;
		this.expectedResult = expectedResult;
	}

	@Parameterized.Parameters
	public static Collection data() {
		return Arrays.asList(new Object[][] { { "abc-100@yahoo.com", true }, { "abc@yahoo.com", true },
				{ "abc.100@yahoo.com", true }, { "abc111@abc.com", true }, { "abc@gmail.com.com", true },
				{ "abc-100@abc.net", true }, { "abc.100@abc.com.au", true }, { "abc@gmail.com.com", true },
				{ "abc@.com.my.", false }, { "abc123@gmail.a", false }, { "abc123@.com", false },
				{ "abc@%*.com", false }, { "abc()*@gmail.com �", false }, { "abc..2002@gmail.com", false },
				{ "abc@abc@gmail.com", false }, { "abc123@gmail.a", false }, { "abc@abc@gmail.com", false },
				{ "abc()*@gmail.com", false }, { "abc@gmail.com.1a", false }, { "abc", false },
				{ ".abc@abc.com", false } });
	}

	@Test
	public void givenPassWord_CheckForValidation_ReturnTrueOrFalse() {
		EmailValidateJunit emailvalidateJunit = new EmailValidateJunit();
		boolean result = emailvalidateJunit.validateEmails(this.emailTest);
		Assertions.assertEquals(this.expectedResult, result);

	}
}
