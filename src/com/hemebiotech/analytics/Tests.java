package com.hemebiotech.analytics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Tests {

    public void test() throws Exception {

        //test de la classe ReadItemsDataFromFile
        //
        ReadItemsDataFromFile itemsReaderTest = new ReadItemsDataFromFile();
        List<String> list = itemsReaderTest.getItems();
        itemsReaderTest.close();
        for (String element: list) {
            System.out.println(element);
        }

        //test de la classe WriteItemsInFiles
        //
        WriteItemsInFile itemsWriterTest = new WriteItemsInFile();
        HashMap<String, Integer> itemsCounter = new HashMap<>();
        itemsCounter.put("headache", 12);
        itemsCounter.put("rush", 5);
        itemsCounter.put("pupils", 16);
        itemsWriterTest.writeItems(itemsCounter);
        itemsWriterTest.close();

        //test de la classe Services
        //
        List<String> listTest = new ArrayList<>();
        listTest.add("headache");
        listTest.add("rush");
        listTest.add("headache");
        listTest.add("pupils");
        listTest.add("rush");
        Services servicesTest = new Services();
        HashMap<String, Integer> itemsCounterTest = servicesTest.setCounterInMap(listTest);
        itemsCounterTest.forEach((k, v) -> System.out.println(k + ": " + v));

    }

}
