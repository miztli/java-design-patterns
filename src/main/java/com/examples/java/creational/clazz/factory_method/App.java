package com.examples.java.creational.clazz.factory_method;

/**
 * Example of an application that might require
 * a vehicle manufacturer, but doesn't know yet the
 * type of it. Or they may just want to switch manufacturers
 * as business needs it.
 */
public class App {
    public static void main(String[] args) {
        VehicleManufacturer vehicleManufacturer;
        Vehicle vehicle;

        // We may use dependency injection if we'd like to change the concrete manufacturer
        vehicleManufacturer = new VolvoManufacturer();
        vehicle = vehicleManufacturer.createVehicle();

        System.out.println(vehicle.toString());
        vehicle.startEngine();
        vehicle.accelerateMaxSpeed();
        vehicle.decreaseSpeed();

        // Now lets say business requirements changed, and now we need a different manufacturer
        System.out.println("---Implementation changed at runtime---");
        vehicleManufacturer = new NissanManufacturer();
        vehicle = vehicleManufacturer.createVehicle();

        System.out.println(vehicle.toString());
        vehicle.startEngine();
        vehicle.accelerateMaxSpeed();
        vehicle.decreaseSpeed();
    }
}
