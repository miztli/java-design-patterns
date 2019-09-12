package com.examples.java.creational.clazz.factory_method;

/**
 * Create as many manufacturers as the application needs,
 * complying with the ObjectType established by {@link VehicleManufacturer}
 */
public class VolvoManufacturer implements VehicleManufacturer<VolvoS60> {

    @Override
    public VolvoS60 createVehicle() {
        return new VolvoS60("volvo S60 turbo","S60", Boolean.TRUE);
    }
}
