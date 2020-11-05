package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.HashMap;

/**
 * Interface d'écriture des données en sortie
 */

public interface IItemsWriter {

    void writeItems (HashMap<String, Integer> itemsCounter) throws IOException;

    void close() throws IOException;

}
