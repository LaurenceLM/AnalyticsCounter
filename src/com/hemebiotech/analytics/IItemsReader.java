package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.List;

/**
 * Interface de lecture
 */
public interface IItemsReader {

    public List<String> getItems () throws IOException;

    public void close() throws IOException;

}
