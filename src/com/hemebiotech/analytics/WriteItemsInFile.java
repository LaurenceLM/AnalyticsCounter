package com.hemebiotech.analytics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Classe d'écriture du fichier de sortie
 */
public class WriteItemsInFile implements IItemsWriter {

    static final String filePathSortie = "compteurs.txt";
    private BufferedWriter writer;

    /**
     * Constructeur permettant l'ouverture du fichier
     * @throws Exception si problème lors de l'ouverture du fichier ou si le chemin vide
     */

    public WriteItemsInFile() throws Exception {
        if (filePathSortie != null) {
            this.writer = new BufferedWriter(new FileWriter(filePathSortie));
        } else {
            throw new Exception ("filepath du fichier en sortie : chaine vide");
        }
    }

    /**
     * Ecriture du fichier à partir d'une map <item, compteur>
     * @param itemsCounter map ayant une clé de type String : l'item et une valeur de type Integer : le compteur
     * @throws IOException si problème lors de l'écriture du fichier
     */

    @Override
    public void writeItems(HashMap<String, Integer> itemsCounter) throws IOException {

        for (Map.Entry<String, Integer> entry : itemsCounter.entrySet()) {
            String k = entry.getKey();
            Integer v = entry.getValue();
            writer.write(k + ": " + v + "\n");
        }
    }

    /**
     * Fermeture du fichier
     * @throws IOException si problème lors de la fermeture du fichier
     */
    @Override
    public void close() throws IOException {
        writer.close();
    }

}
