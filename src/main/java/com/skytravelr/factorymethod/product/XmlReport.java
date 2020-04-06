package com.skytravelr.factorymethod.product;

import com.skytravelr.factorymethod.model.Data;

import java.util.stream.Collectors;

public class XmlReport implements Report {

    @Override
    public String export(final Data data) {
        return "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
                "<data>" +
                data.items.stream()
                        .map(i -> "<item>" +
                                "<id>" + i.id + "</id>" +
                                "<name>" + i.name + "</name>" +
                                "<amount>" + i.amount + "</amount>" +
                                "</item>"
                        )
                        .collect(Collectors.joining()) +
                "</data>";
    }
}
