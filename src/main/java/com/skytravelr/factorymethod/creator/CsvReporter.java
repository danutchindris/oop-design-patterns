package com.skytravelr.factorymethod.creator;

import com.skytravelr.factorymethod.product.CsvReport;
import com.skytravelr.factorymethod.product.Report;

public class CsvReporter extends Reporter {

    @Override
    Report create() {
        return new CsvReport();
    }
}
