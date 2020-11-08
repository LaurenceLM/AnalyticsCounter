package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

/**
 * Classe de traitement d'obtention des compteurs d'items
 */

public class AnalyticsCounter {

    /**
     * méthode de traitement des compteurs appelant les méthodes lire, compter et traiter
     * @throws Exception si problème lors de la lectures ou de l'écriture des données
     */

    public void traiter() throws Exception {
        List<String> listItems = lire();
        Map<String, Integer> sortedMap = compter(listItems);
        ecrire(sortedMap);
    }

    /**
     * méthode de lecture des données en entrée
     * @return liste des items lus
     * @throws Exception si problème lors de la lecture
     */
    public List<String> lire() throws Exception {
        IItemsReader itemsReader = new ReadItemsDataFromFile();
        List<String> listItems = itemsReader.getItems();
        itemsReader.close();
        return listItems;
    }

    /**
     * méthode de calcul du nombre d'items à partir d'une liste d'items
     * @param listItems : collection d'items de type String
     * @return Map ayant pour clé l'items et valeur le compteur
     */

    public Map<String, Integer> compter(List<String>  listItems) {
        return Services.setCounterInMap(listItems);
    }

    /**
     * méthode d'écriture des données à partir d'une Map (item, compteur) par ordre alphabétique d'item
     * @param itemsCounter Map ayant pour clé l'items et valeur le compteur
     * @throws Exception si problème lors de l'écriture
     */

    public void ecrire(Map<String, Integer> itemsCounter) throws Exception {
        IItemsWriter itemsWriter = new WriteItemsInFile();
        itemsWriter.writeItems(itemsCounter);
        itemsWriter.close();
    }

}
