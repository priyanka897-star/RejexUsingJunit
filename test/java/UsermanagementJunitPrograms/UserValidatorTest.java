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
	    void givenTwoLetters_CheckForValidationForLName_ReturnFalse() {
		    UserValidator validator = new UserValidator();
	        boolean result = validator.validateLastName("More");
	        Assertions.assertFalse(result);
	    }

	    @Test
	    void givenTwoSmalls_CheckForValidationForLName_RerunFalse() {
	    	UserValidator validator = new UserValidator();
	        boolean result =validator.validateLastName("more");
	        Assertions.assertFalse(result);
	    }
}
