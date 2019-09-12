package com.examples.java.creational.clazz.factory_method;

/**
 * Lets remember factory methods will create types
 * which supertype is {@link Vehicle}
 */
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

    @Override
    protected void startEngine() {
        System.out.println("Starting engine after red button was pressed!");
    }

    @Override
    protected void accelerateMaxSpeed() {
        System.out.println("Accelerating at max speed of 340 km/h");
    }

    @Override
    protected void decreaseSpeed() {
        System.out.println("Decreasing speed with disc breaks!");
    }

    @Override
    public String toString() {
        return String.format("%s{hasTurbo:%s}", super.toString(), this.hasTurbo);
    }
}
