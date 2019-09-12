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

    protected abstract void startEngine();

    protected abstract void accelerateMaxSpeed();

    protected abstract void decreaseSpeed();

    @Override
    public String toString() {
        return String.format("vehicle details: {name:%s}{model:%s}", this.name, this.model);
    }
}
