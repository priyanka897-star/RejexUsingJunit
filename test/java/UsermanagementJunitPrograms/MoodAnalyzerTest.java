package UsermanagementJunitPrograms;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class MoodAnalyzerTest {

	@Test
	public void givenMessage_WHENSad_ShouldReturnTrue() {
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		String mood = moodAnalyser.analyseMood("  This is sad message");
		
		Assertions.assertEquals( ("SAD"),mood);
	}
	
	@Test
	public void givenMessage_WHENHappy_ShouldReturnTrue(){
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		String mood = moodAnalyser.analyseMood(" This is Happy message");
		
		Assertions.assertEquals( ("Happy"),mood);
	}
}
