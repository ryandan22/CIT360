package testing;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

class squareTest {

	@Test
	void test() {
		JUnitTesting test = new JUnitTesting();
		int output = test.square(6);
		assertEquals(36, output);
	}

}
