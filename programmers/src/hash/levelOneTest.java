package hash;

import static org.junit.Assert.*;

import org.junit.Test;

public class levelOneTest {

	@Test
	public void solutionTest() {
		String[] participant = null;
		String[] completion = null;
		
		LevelOne myArray = new LevelOne();
		participant = new String[]{"leo", "kiki", "eden"};
		completion = new String[]{"eden", "kiki"};
		assertTrue(myArray.solution(participant, completion).equals("leo"));
		
		participant = new String[]{"marina", "josipa", "nikola", "vinko", "filipa"};
	    completion = new String[]{"josipa", "filipa", "marina", "nikola"};
	    assertTrue(myArray.solution(participant, completion).equals("vinko"));
		
		participant = new String[]{"mislav", "stanko", "mislav", "ana"};
	    completion = new String[]{"stanko", "ana", "mislav"};
	    assertTrue(myArray.solution(participant, completion).equals("mislav"));
	} 
	

}
