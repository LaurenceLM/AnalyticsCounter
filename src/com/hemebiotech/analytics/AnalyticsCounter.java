package com.hemebiotech.analytics;

import java.util.HashMap;
import java.util.List;

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
        HashMap<String, Integer> itemsCounter = compter(listItems);
        ecrire(itemsCounter);
    }

    /**
     * méthode de lecture des données en entrée
     * @return liste des items lus
     * @throws Exception si problème lors de la lecture
     */
    private List<String> lire() throws Exception {
        ReadItemsDataFromFile itemsReader = new ReadItemsDataFromFile();
        List<String> listItems = itemsReader.getItems();
        itemsReader.close();
        return listItems;
    }

    /**
     * méthode de calcul du nombre d'items à partir d'une liste d'items
     * @param listItems : collection d'items de type String
     * @return Map ayant pour clé l'items et valeur le compteur
     */

    private HashMap<String, Integer> compter(List<String>  listItems) {
        Services services = new Services();
        return services.setCounterInMap(listItems);
    }

    /**
     * méthode d'écriture des données à partir d'une Map (item, compteur)
     * @param itemsCounter Map ayant pour clé l'items et valeur le compteur
     * @throws Exception si problème lors de l'écriture
     */

    private void ecrire(HashMap<String, Integer> itemsCounter) throws Exception {
        WriteItemsInFile itemsWriter = new WriteItemsInFile();
        itemsWriter.writeItems(itemsCounter);
        itemsWriter.close();
    }

}
