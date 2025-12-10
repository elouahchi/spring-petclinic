package org.springframework.samples.petclinic;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

public class CheckOverdueVisitsTests {

	@Test
	public void testHasOverdueVisitWithOverdue() {
		assertTrue(CheckOverdueVisits.hasOverdueVisit(Arrays.asList(LocalDate.now().minusDays(31)), 30));
	}

	@Test
	public void testHasOverdueVisitWithinLimit() {
		assertFalse(CheckOverdueVisits.hasOverdueVisit(Arrays.asList(LocalDate.now().minusDays(10)), 30));
	}

	@Test
	public void testHasOverdueVisitEmptyList() {
		assertFalse(CheckOverdueVisits.hasOverdueVisit(Collections.emptyList(), 30));
	}

	@Test
	public void testHasOverdueVisitNullList() {
		assertFalse(CheckOverdueVisits.hasOverdueVisit(null, 30));
	}

	@Test
	public void testHasOverdueVisitMultipleDates() {
		assertTrue(CheckOverdueVisits
			.hasOverdueVisit(Arrays.asList(LocalDate.now().minusDays(5), LocalDate.now().minusDays(40)), 30));
	}

}
