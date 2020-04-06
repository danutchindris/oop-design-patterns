package com.skytravelr.factorymethod.creator;

import com.skytravelr.factorymethod.product.Report;

public class DefaultReporter extends Reporter {

    @Override
    Report create() {
        return data -> "";
    }
}
