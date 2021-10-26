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
	    void givenFirstLetterSmall_CheckForValidation_ReturnFalse() {
		  	UserValidator validator = new UserValidator();
	        boolean result =  validator.validateFirstName("sravanthi");
	        Assertions.assertFalse(result);
	    }

	    @Test
	    void givenTwoLetters_CheckForValidation_ReturnFalse() {
	    	UserValidator validator = new UserValidator();
	        boolean result =  validator.validateFirstName("Sr");
	        Assertions.assertFalse(result);
	    }
}