package com.examples.java.creational.clazz.factory_method;

/**
 * Lets remember factory methods will create types
 * which supertype is {@link Vehicle}
 */
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

    @Override
    protected void startEngine() {
        System.out.println("Starting engine with keys!");
    }

    @Override
    protected void accelerateMaxSpeed() {
        System.out.println("Accelerating at max speed of 230 km/h");
    }

    @Override
    protected void decreaseSpeed() {
        System.out.println("Decreasing speed with drum breaks!");
    }

    @Override
    public String toString() {
        return String.format("%s{hasGps:%s}", super.toString(), this.hasGps);
    }
}
