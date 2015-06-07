package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class MultiplyTest {

	@Test
	public void testMultiply() {
		Methods test = new Methods();
		int result = test.multipliziere(3, 4);
		assertEquals(12, result);
	}

}
