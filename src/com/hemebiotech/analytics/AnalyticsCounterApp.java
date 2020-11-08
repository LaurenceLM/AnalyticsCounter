package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

/**
 * Classe de lancement du traitement :
 * compter les occurences d'items présents en entrée à restituer en sortie
 */
public class AnalyticsCounterApp {

	/**
	 * méthode main de traitement des compteurs appelant les méthodes lire, compter et ecrire
	 */

	public static void main(String args[]) {

		AnalyticsCounter analyticsCounter = new AnalyticsCounter();
		try {
			List<String> listItems = analyticsCounter.lire();
			Map<String, Integer> sortedMap = analyticsCounter.compter(listItems);
			analyticsCounter.ecrire(sortedMap);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
