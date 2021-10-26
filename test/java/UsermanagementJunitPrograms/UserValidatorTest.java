package UsermanagementJunitPrograms;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UserValidatorTest {

	@Test
	public void givenFirstName_WhenProper_ShouldReturnTrue() {
		UserValidator validator = new UserValidator();
		boolean result = validator.validateFirstName("Priyanka");
		Assertions.assertTrue(result);

	}

	@Test
	public void givenFirstLetterSmall_CheckForValidation_ReturnFalse() {
		UserValidator validator = new UserValidator();
		boolean result = validator.validateFirstName("priya");
		Assertions.assertFalse(result);
	}

	@Test
	public void givenTwoLetters_CheckForValidation_ReturnFalse() {
		UserValidator validator = new UserValidator();
		boolean result = validator.validateFirstName("Pr");
		Assertions.assertFalse(result);
	}

	@Test
	void givenLasrName_CheckForValidationForLName_ReturnTrue() {
		UserValidator validator = new UserValidator();
		boolean result = validator.validateLastName("More");
		Assertions.assertTrue(result);
	}

	@Test
	void givenTwoSmalls_CheckForValidationForLName_RetrunFalse() {
		UserValidator validator = new UserValidator();
		boolean result = validator.validateLastName("more");
		Assertions.assertFalse(result);
	}
	
	@Test
	void givenEmail_CheckForValidationForEmail_RetrunTrue() {
		UserValidator validator = new UserValidator();
		boolean result = validator.validateEmail("abc.xyz@bl.com");
		Assertions.assertTrue(result);
	}
	
	@Test
	void givenEmail_CheckForValidationForEmail_RetrunFalse() {
		UserValidator validator = new UserValidator();
		boolean result = validator.validateEmail("abc.xyz@bl");
		Assertions.assertFalse(result);
	}
	
	@Test
	void givenEmail_CheckForValidationForMobile_RetrunTrue() {
		UserValidator validator = new UserValidator();
		boolean result = validator.validateMobile("98 9808229348");
		Assertions.assertTrue(result);
	}
	
	@Test
	void WithoutSpace_CheckForValidationForMobile_RetrunFalse() {
		UserValidator validator = new UserValidator();
		boolean result = validator.validateEmail("919874563214");
		Assertions.assertFalse(result);
	}
	
	@Test
	void givenPassword_CheckForValidationForPassword_RetrunTrue() {
		UserValidator validator = new UserValidator();
		boolean result = validator.validatePassword("sbvdfredvcn");
		Assertions.assertTrue(result);
	}
	
	@Test
	void withLessThan8Character_CheckForValidationForPassword_ReFalse() {
		UserValidator validator = new UserValidator();
		boolean result = validator.validatePassword("sbvdfr");
		Assertions.assertFalse(result);
	}
	
	
	
	
}
