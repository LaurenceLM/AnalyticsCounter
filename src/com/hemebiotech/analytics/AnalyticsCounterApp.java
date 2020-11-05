package com.hemebiotech.analytics;

/**
 * Classe de lancement du traitement :
 * compter les occurences d'items présents en entrée à restituer en sortie
 */
public class AnalyticsCounterApp {

	public static void main(String args[]) {

		AnalyticsCounter analyticsCounter = new AnalyticsCounter();
		try {
			analyticsCounter.traiter();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
