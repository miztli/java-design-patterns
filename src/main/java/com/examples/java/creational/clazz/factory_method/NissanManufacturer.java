package com.examples.java.creational.clazz.factory_method;

/**
 * Create as many manufacturers as the application needs,
 * complying with the ObjectType established by {@link VehicleManufacturer}
 */
public class NissanManufacturer implements VehicleManufacturer {
    @Override
    public Vehicle createVehicle() {
        return new NissanVersa("nissan versa rt","versa",Boolean.TRUE);
    }
}
