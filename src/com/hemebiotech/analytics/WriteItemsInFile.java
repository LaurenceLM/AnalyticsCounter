package com.hemebiotech.analytics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

/**
 * Classe d'écriture du fichier de sortie
 */
public class WriteItemsInFile implements IItemsWriter {

    private BufferedWriter writer = null;

    /**
     * Constructuer permettant l'ouverture du fichier
     * @param filepath
     * @throws Exception
     */

    public WriteItemsInFile(String filepath) throws Exception {
        if (filepath != null) {
            try {
                this.writer = new BufferedWriter(new FileWriter(filepath));;
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            throw new Exception ("filepath du fichier en sortie : chaine vide");
        }
    }

    /**
     * Ecriture du fichier à partir d'une hashmap
     * @param itemsCounter
     */
    @Override
    public void writeItems(HashMap<String, Integer> itemsCounter) {

        itemsCounter.forEach((k, v) -> {
            try {
                writer.write(k + ": " + v + "\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }

    /**
     * Fermeture du fichier
     * @throws IOException
     */
    @Override
    public void close() throws IOException {
        writer.close();
    }

}
