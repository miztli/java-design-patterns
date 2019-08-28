package com.examples.java.creational.clazz.factory_method;

public class NissanVersa extends Vehicle {

    private boolean hasGps;

    public NissanVersa(boolean hasGps) {
        this.hasGps = hasGps;
    }

    public NissanVersa(String name, String model, boolean hasGps) {
        super(name, model);
        this.hasGps = hasGps;
    }

    public boolean hasGps() {
        return hasGps;
    }

    public void hasGps(boolean hasGps) {
        this.hasGps = hasGps;
    }
}
