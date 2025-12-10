package org.springframework.samples.petclinic;

import java.util.List;

public class VisitStatistics {

	/**
	 * Calculates the average number of visits per pet.
	 * @param visitsPerPet a list where each element is the number of visits for a pet
	 * @return average visits per pet, or 0 if the list is empty
	 */
	public static double averageVisitsPerPet(List<Integer> visitsPerPet) {
		if (visitsPerPet == null || visitsPerPet.isEmpty()) {
			return 0;
		}
		int totalVisits = 0;
		for (int visits : visitsPerPet) {
			totalVisits += visits;
		}
		return (double) totalVisits / visitsPerPet.size();
	}

}
