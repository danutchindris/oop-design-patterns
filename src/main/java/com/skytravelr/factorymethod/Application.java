package com.skytravelr.factorymethod;

import com.skytravelr.factorymethod.creator.CsvReporter;
import com.skytravelr.factorymethod.creator.DefaultReporter;
import com.skytravelr.factorymethod.creator.Reporter;
import com.skytravelr.factorymethod.creator.XmlReporter;
import com.skytravelr.factorymethod.model.Data;
import com.skytravelr.factorymethod.model.Item;

import java.util.Arrays;

public class Application {

    public static void main(String[] args) {
        if (args != null && args.length == 1) {
            final Data data = getData();
            final Reporter reporter;
            switch (args[0]) {
                case "csv": {
                    reporter = new CsvReporter();
                    break;
                }
                case "xml": {
                    reporter = new XmlReporter();
                    break;
                }
                default: {
                    reporter = new DefaultReporter();
                    System.out.println("Unknown report type");
                }
            }
            System.out.println(reporter.export(data));
        } else {
            System.out.println("Please provide the report type as a program argument (csv / xml)");
        }
    }

    private static Data getData() {
        return new Data(Arrays.asList(
                new Item(1, "Colgate Total", 10.0),
                new Item(2, "Sensodyne Rapid Relief", 15.0),
                new Item(3, "Jacob's Kronung", 7.0)
        ));
    }
}
