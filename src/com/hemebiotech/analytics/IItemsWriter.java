package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.Map;

/**
 * Interface d'écriture des données en sortie
 */

public interface IItemsWriter {

    void writeItems (Map<String, Integer> itemsCounter) throws IOException;

    void close() throws IOException;

}
