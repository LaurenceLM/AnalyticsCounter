package com.hemebiotech.analytics;

import java.util.HashMap;
import java.util.List;

/**
 * Classe fournissant des services fournis sur une List de Strings
 */
public class ListService {

    /**
     *
     * @param list d'items
     * @return Map des occurences d'items avec compteurs
     */
    public HashMap<String,Integer> setCounterInMap(List<String> list) {

        HashMap<String, Integer> itemsCounter = new HashMap<String, Integer>();
        Integer compteur;

        for (String element: list) {
            if (itemsCounter.containsKey(element)) {
                compteur = itemsCounter.get(element);
                compteur++;
            } else {
                compteur = 1;
            }
            itemsCounter.put(element, compteur);
        }

        return itemsCounter;
    }

}
