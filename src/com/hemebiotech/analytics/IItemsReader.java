package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.List;

/**
 * Interface de lecture des données en entrée
 */
public interface IItemsReader {

    List<String> getItems () throws IOException;

    void close() throws IOException;

}
