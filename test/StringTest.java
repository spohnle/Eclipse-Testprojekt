package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringTest {

	@Test
	public void testAddstring() {
		Methods test = new Methods();
		String result = test.addiereStrings("eins", "zwei");
		assertEquals("einszwei", result);
	}

}
