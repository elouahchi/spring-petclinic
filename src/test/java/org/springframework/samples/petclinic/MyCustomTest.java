package org.springframework.samples.petclinic;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MyCustomTest {

	@Test
	public void sampleTest() {
		// Example test
		int expected = 5;
		int actual = 2 + 3;
		assertEquals(expected, actual);
	}

	// Add more tests here

}
