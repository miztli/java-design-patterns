package com.examples.java.creational.clazz.factory_method;

public interface VehicleManufacturer {

    /**
     * You may just don't know the concrete vehicles that
     * will exist in the application. But you can specify a type
     * for them to comply with.
     *
     * @return The created vehicle
     */
    Vehicle createVehicle();
}