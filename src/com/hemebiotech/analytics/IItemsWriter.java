package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.HashMap;

/**
 * Interface d'écriture
 */

public interface IItemsWriter {

    public void writeItems (HashMap<String, Integer> itemsCounter);

    public void close() throws IOException;

}
