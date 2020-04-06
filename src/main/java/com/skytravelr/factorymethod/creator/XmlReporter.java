package com.skytravelr.factorymethod.creator;

import com.skytravelr.factorymethod.product.Report;
import com.skytravelr.factorymethod.product.XmlReport;

public class XmlReporter extends Reporter {

    @Override
    Report create() {
        return new XmlReport();
    }
}
