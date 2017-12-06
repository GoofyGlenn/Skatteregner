import static org.junit.Assert.*;

import org.junit.Test;

import entities.PersonInfo;

public class beregnerTest {

	@Test
	public void test() {
		// setup + execute
		boolean gift = false;
		boolean kirke = false;
		boolean alder = false;
		PersonInfo info = new PersonInfo(gift,kirke, alder);
		// assert
		assertEquals(false, false);
		
	}

}
