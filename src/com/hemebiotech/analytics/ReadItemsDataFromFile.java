package com.hemebiotech.analytics;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe de lecture du fichier d'entrée
 */

public class ReadItemsDataFromFile implements IItemsReader {

    static final String filePathEntree = "symptoms.txt";

    private BufferedReader reader;

    /**
     * Constructeur permettant l'ouverture du fichier
     * @throws Exception si problème lors de l'ouverture du fichier ou si le chemin vide
     */
    public ReadItemsDataFromFile() throws Exception {
        if (filePathEntree != null) {
            this.reader = new BufferedReader(new FileReader(filePathEntree));
        } else {
            throw new Exception ("filepath du fichier en entrée : chaine vide");
        }
    }

    /**
     * Création d'une list à partir du fichier
     * @return liste d'items lus
     * @throws IOException si problème lors de la lecture du fichier
     */
    @Override
    public List<String> getItems() throws IOException {

        String line;
        List<String> list = new ArrayList<>();

        while ((line  = reader.readLine()) != null) {
            list.add(line);
        }

        return list;
    }

    /**
     * Fermeture du fichier lu
     * @throws IOException si problème lors de la fermeture du fichier d'entrée
     */
    @Override
    public void close() throws IOException {
        reader.close();
    }
}
