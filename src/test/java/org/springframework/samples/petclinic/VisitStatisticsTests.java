package org.springframework.samples.petclinic;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

public class VisitStatisticsTests {

	@Test
	public void testAverageVisitsNormal() {
		assertEquals(3.0, VisitStatistics.averageVisitsPerPet(Arrays.asList(2, 3, 4)));
	}

	@Test
	public void testAverageVisitsEmptyList() {
		assertEquals(0.0, VisitStatistics.averageVisitsPerPet(Collections.emptyList()));
	}

	@Test
	public void testAverageVisitsNullList() {
		assertEquals(0.0, VisitStatistics.averageVisitsPerPet(null));
	}

	@Test
	public void testAverageVisitsSinglePet() {
		assertEquals(5.0, VisitStatistics.averageVisitsPerPet(Arrays.asList(5)));
	}

}
