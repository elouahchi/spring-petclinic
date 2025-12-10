package org.springframework.samples.petclinic;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

public class CheckOverdueVisits {

	/**
	 * Checks if a pet has any overdue visits. A visit is overdue if it was more than
	 * maxDaysAgo days ago.
	 * @param visitDates List of visit dates
	 * @param maxDaysAgo Maximum number of days allowed since last visit
	 * @return true if any visit is overdue, false otherwise
	 */
	public static boolean hasOverdueVisit(List<LocalDate> visitDates, long maxDaysAgo) {
		if (visitDates == null || visitDates.isEmpty()) {
			return false; // no visits = not overdue
		}
		LocalDate today = LocalDate.now();
		for (LocalDate visitDate : visitDates) {
			long daysBetween = ChronoUnit.DAYS.between(visitDate, today);
			if (daysBetween > maxDaysAgo) {
				return true;
			}
		}
		return false;
	}

}
