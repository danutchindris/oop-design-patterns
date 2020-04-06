package com.skytravelr.factorymethod.product;

import com.skytravelr.factorymethod.model.Data;

/**
 * This is the "product" interface.
 * <p>
 * The product interface declares the operations that all
 * concrete products must implement.
 */
public interface Report {

    /**
     * String representation of this report.
     */
    String export(Data data);
}
