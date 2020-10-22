package com.hemebiotech.analytics;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe de lecture du fichier d'entrée
 */

public class ReadItemsDataFromFile implements IItemsReader {

    private BufferedReader reader = null;

    /**
     * Constructeur permettant l'ouverture du fichier
     * @param filepath
     * @throws Exception
     */
    public ReadItemsDataFromFile(String filepath) throws Exception {
        if (filepath != null) {
            try {
                this.reader = new BufferedReader(new FileReader(filepath));;
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            throw new Exception ("filepath du fichier en entrée : chaine vide");
        }
    }

    /**
     * Création d'une list à partir du fichier
     * @return
     * @throws IOException
     */
    @Override
    public List<String> getItems() throws IOException {

        String line;
        List<String> list = new ArrayList<String>();

        while ((line  = reader.readLine()) != null) {
            list.add(line);
        }
        return list;
    }

    /**
     * Fermeture du fichier
     * @throws IOException
     */
    @Override
    public void close() throws IOException {
        reader.close();
    }
}
