package com.examples.java.creational.clazz.factory_method;

public abstract class Vehicle {
    private String name;
    private String model;

    public Vehicle() {
    }

    public Vehicle(String name, String model) {
        this.name = name;
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
