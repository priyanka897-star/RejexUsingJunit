package UsermanagementJunitPrograms;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class EmailValidation {

	
		@Test
		public void givenEmail1_WhenProper_ShouldReturnTrue() {
			EmailValidationMain emailValidationMain = new EmailValidationMain();
			boolean result = emailValidationMain.validateEmails("abc@yahoo.com");
			Assertions.assertTrue(result);

		}
		
		@Test
		public void givenEmail2_WhenProper_ShouldReturnTrue() {
			EmailValidationMain emailValidationMain = new EmailValidationMain();
			boolean result = emailValidationMain.validateEmails("abc-100@yahoo.com");
			Assertions.assertTrue(result);

		}
		
		@Test
		public void givenEmail3_WhenProper_ShouldReturnTrue() {
			EmailValidationMain emailValidationMain = new EmailValidationMain();
			boolean result = emailValidationMain.validateEmails("abc.100@yahoo.com");
			Assertions.assertTrue(result);

		}
		
		@Test
		public void givenEmail4_WhenProper_ShouldReturnTrue() {
			EmailValidationMain emailValidationMain = new EmailValidationMain();
			boolean result = emailValidationMain.validateEmails("abc111@abc.com");
			Assertions.assertTrue(result);

		}
		
		@Test
		public void givenEmail5_WhenProper_ShouldReturnTrue() {
			EmailValidationMain emailValidationMain = new EmailValidationMain();
			boolean result = emailValidationMain.validateEmails("abc-100@abc.net");
			Assertions.assertTrue(result);

		}
		
		@Test
		public void givenEmail6_WhenProper_ShouldReturnTrue() {
			EmailValidationMain emailValidationMain = new EmailValidationMain();
			boolean result = emailValidationMain.validateEmails("abc.100@abc.com.au");
			Assertions.assertTrue(result);

		}
		
		@Test
		public void givenEmail7_WhenProper_ShouldReturnFalse() {
			EmailValidationMain emailValidationMain = new EmailValidationMain();
			boolean result = emailValidationMain.validateEmails("abc@1.com");
			Assertions.assertFalse(result);

		}
		
		@Test
		public void givenEmail8_WhenProper_ShouldReturnTrue() {
			EmailValidationMain emailValidationMain = new EmailValidationMain();
			boolean result = emailValidationMain.validateEmails("abc@gmail.com.com");
			Assertions.assertTrue(result);

		}
		
		@Test
		public void givenEmail9_WhenProper_ShouldReturnFalse() {
			EmailValidationMain emailValidationMain = new EmailValidationMain();
			boolean result = emailValidationMain.validateEmails("abc+100@gmail.com");
			Assertions.assertFalse(result);

		}
		
		@Test
		public void givenEmai10_WhenProper_ShouldReturnFalse() {
			EmailValidationMain emailValidationMain = new EmailValidationMain();
			boolean result = emailValidationMain.validateEmails("abc");
			Assertions.assertFalse(result);

		}
		
		@Test
		public void givenEmail11_WhenProper_ShouldReturnFalse() {
			EmailValidationMain emailValidationMain = new EmailValidationMain();
			boolean result = emailValidationMain.validateEmails("abc@%*.com");
			Assertions.assertFalse(result);

		}
		
		@Test
		public void givenEmail12_WhenProper_ShouldReturnFalse() {
			EmailValidationMain emailValidationMain = new EmailValidationMain();
			boolean result = emailValidationMain.validateEmails("abc()*@gmail.com");
			Assertions.assertFalse(result);

		}
		
		
		@Test
		public void givenEmail13_WhenProper_ShouldReturnFalse() {
			EmailValidationMain emailValidationMain = new EmailValidationMain();
			boolean result = emailValidationMain.validateEmails("abc..2002@gmail.com");
			Assertions.assertFalse(result);

		}
}