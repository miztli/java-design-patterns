package com.examples.java.creational.clazz.factory_method;

public class VolvoS60 extends Vehicle {
    private boolean hasTurbo;

    public VolvoS60(boolean hasTurbo) {
        this.hasTurbo = hasTurbo;
    }

    public VolvoS60(String name, String model, boolean hasTurbo) {
        super(name, model);
        this.hasTurbo = hasTurbo;
    }

    public boolean hasTurbo() {
        return hasTurbo;
    }

    public void hasTurbo(boolean hasTurbo) {
        this.hasTurbo = hasTurbo;
    }
}
