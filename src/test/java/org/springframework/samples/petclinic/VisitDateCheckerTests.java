package org.springframework.samples.petclinic;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

public class VisitDateCheckerTests {

	@Test
	public void testValidVisitToday() {
		assertTrue(VisitDateChecker.isValidVisitDate(LocalDate.now()));
	}

	@Test
	public void testValidVisitFuture() {
		assertTrue(VisitDateChecker.isValidVisitDate(LocalDate.now().plusDays(5)));
	}

	@Test
	public void testInvalidVisitPast() {
		assertFalse(VisitDateChecker.isValidVisitDate(LocalDate.now().minusDays(1)));
	}

	@Test
	public void testInvalidVisitNull() {
		assertFalse(VisitDateChecker.isValidVisitDate(null));
	}

}
