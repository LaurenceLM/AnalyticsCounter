package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Compte les occurences d'items présents dans
 * le fichier symptoms.txt
 * pour les restituer dans le fichier compteurs.txt
 */
public class AnalyticsCounterApp {
	
	public static void main(String args[]) throws Exception {

		AnalyticsCounter analyticsCounter = new AnalyticsCounter();
		analyticsCounter.compter();

		/*
		//test de la classe ReadItemsDataFromFile
		//
		ReadItemsDataFromFile itemsReaderTest = new ReadItemsDataFromFile("symptoms.txt");
		List<String> list = itemsReaderTest.getItems();
		itemsReaderTest.close();
		for (String element: list) {
			System.out.println(element);
		}

		//test de la classe WriteItemsInFiles
		//
		WriteItemsInFile itemsWriterTest = new WriteItemsInFile("testcompteurs.txt");
		HashMap<String, Integer> itemsCounter = new HashMap<String, Integer>();
		itemsCounter.put("headache", 12);
		itemsCounter.put("rush", 5);
		itemsCounter.put("pupils", 16);
		itemsWriterTest.writeItems(itemsCounter);
		itemsWriterTest.close();

		//test de la classe ListService
		//
		List<String> listTest = new ArrayList<String>();
		listTest.add("headache");
		listTest.add("rush");
		listTest.add("headache");
		listTest.add("pupils");
		listTest.add("rush");
		ListService listServiceTest = new ListService();
		HashMap<String, Integer> itemsCounterTest = listServiceTest.setCounterInMap(listTest);
		itemsCounterTest.forEach((k, v) -> System.out.println(k + ": " + v));
		*/

	}
}
