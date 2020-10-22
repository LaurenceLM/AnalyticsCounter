package com.hemebiotech.analytics;

import java.util.HashMap;
import java.util.List;

public class AnalyticsCounter {

    public void compter() throws Exception {

        ReadItemsDataFromFile itemsReader = new ReadItemsDataFromFile("symptoms.txt");
        List<String> listItems = itemsReader.getItems();
        itemsReader.close();

        ListService listService = new ListService();
        HashMap<String, Integer> itemsCounter = listService.setCounterInMap(listItems);

        WriteItemsInFile itemsWriter = new WriteItemsInFile("compteurs.txt");
        itemsWriter.writeItems(itemsCounter);
        itemsWriter.close();

    }

}
