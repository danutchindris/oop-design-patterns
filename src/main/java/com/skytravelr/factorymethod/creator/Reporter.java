package com.skytravelr.factorymethod.creator;

import com.skytravelr.factorymethod.model.Data;
import com.skytravelr.factorymethod.product.Report;

/**
 * This is the "creator" abstract class.
 * <p>
 * The creator class declares the factory method that must
 * return an object of a product class. The creator's subclasses
 * usually provide the implementation of this method.
 * <p>
 * Note that, despite its name, the creator's primary
 * responsibility isn't creating products. It usually
 * contains some core business logic that relies on product
 * objects returned by the factory method. Subclasses can
 * indirectly change that business logic by overriding the
 * factory method and returning a different type of product
 * from it.
 */
public abstract class Reporter {

    abstract Report create();

    public String export(final Data data) {
        final Report report = create();
        return report.export(data);
    }
}
