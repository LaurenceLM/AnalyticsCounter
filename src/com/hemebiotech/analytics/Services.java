package com.hemebiotech.analytics;

import java.util.HashMap;
import java.util.List;

/**
 * Classe fournissant des services
 */

public class Services {

    /**
     * méthode de comptant dynamiquement les items contenus dans une liste
     * @param list d'items
     * @return Map des occurences d'items (clé) avec compteurs (valeur)
     */

    public HashMap<String,Integer> setCounterInMap(List<String> list) {

        HashMap<String, Integer> itemsCounter = new HashMap<>();
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