package com.examples.java.creational.clazz.factory_method;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class FactoryMethodTest {

    /**
     * Test that if we are using a VehicleManufacturer, then we can change
     * the concrete implementation as required by our needs.
     */
    @Test
    public void whenUsingNissanManufacturer_then_verifyVehicleIsNissan() {
        VehicleManufacturer vehicleManufacturer = new NissanManufacturer();
        Vehicle vehicle = vehicleManufacturer.createVehicle();

        assertTrue(vehicle instanceof NissanVersa);
        assertTrue(((NissanVersa) vehicle).hasGps());
    }

    /**
     * Test that if we are using a VehicleManufacturer, then we can change
     * the concrete implementation as required by our needs.
     */
    @Test
    public void whenUsingVolvoManufacturer_then_verifyVehicleIsVolvo() {
        VehicleManufacturer vehicleManufacturer = new VolvoManufacturer();
        Vehicle vehicle = vehicleManufacturer.createVehicle();

        assertTrue(vehicle instanceof VolvoS60);
        assertTrue(((VolvoS60) vehicle).hasTurbo());
    }
}
