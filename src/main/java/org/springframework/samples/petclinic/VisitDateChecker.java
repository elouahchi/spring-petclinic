package org.springframework.samples.petclinic;

import java.time.LocalDate;

public class VisitDateChecker {

	/**
	 * Checks that a visit date is not in the past.
	 * @param visitDate The date of the visit
	 * @return true if visitDate is today or in the future, false if in the past
	 */
	public static boolean isValidVisitDate(LocalDate visitDate) {
		if (visitDate == null) {
			return false; // null dates are invalid
		}
		return !visitDate.isBefore(LocalDate.now());
	}

}
