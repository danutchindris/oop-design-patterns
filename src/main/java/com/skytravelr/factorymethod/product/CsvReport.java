package com.skytravelr.factorymethod.product;

import com.skytravelr.factorymethod.model.Data;

import java.util.Optional;
import java.util.stream.Collectors;

public class CsvReport implements Report {

    @Override
    public String export(final Data data) {
        return Optional.ofNullable(data).map(d -> d.items)
                .map(items -> items.stream())
                .map(s ->
                        s.map(i -> i.id + "; " + i.name + "; " + i.amount)
                                .collect(Collectors.joining("\n"))
                )
                .orElse("");
    }
}
