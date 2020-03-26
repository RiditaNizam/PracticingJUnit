package testPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class squareTest {

	@Test
	public void test() {
		JUnitTesting test = new JUnitTesting();
		int output = test.square(4);
		assertEquals(16, output); //(expected value, output in line above)
	}

}
