package testing;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

class countATest {

	@Test
	void test() {
		JUnitTesting test = new JUnitTesting();
		int output = test.countA("wallawalla");
		assertEquals(4, output);
	}

}
