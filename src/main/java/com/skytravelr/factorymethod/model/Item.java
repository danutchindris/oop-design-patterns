package com.skytravelr.factorymethod.model;

public class Item {

    public final Integer id;
    public final String name;
    public final Double amount;

    public Item(Integer id, String name, Double amount) {
        this.id = id;
        this.name = name;
        this.amount = amount;
    }
}
