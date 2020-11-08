package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Classe fournissant des services
 */

public class Services {

    /**
     * méthode de comptant dynamiquement les items contenus dans une liste
     * @param list d'items
     * @return Map des occurences d'items (clé) avec compteurs (valeur)
     */

    public static Map<String,Integer> setCounterInMap(List<String> list) {

        TreeMap<String, Integer> itemsCounter = new TreeMap<>();
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