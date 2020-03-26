package testPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class countATest {

	@Test
	public void test() {
		JUnitTesting test = new JUnitTesting();
		int output = test.countA("Ridita");
		assertEquals(1, output);
	}

}
