package com.examples.java.creational.clazz.factory_method;

/**
 * This interface specifies the types of
 * objects the concrete implementations must comply with.
 *
 * In this example, as a plus, we will use generics
 * to add another level of flexibility to our concrete factories,
 * this way we will also avoid type casting when trying to access
 * specific methods of the vehicle subclass.
 *
 * This obviously will depend on the level of abstraction you need.
 */
public interface VehicleManufacturer<T extends Vehicle> {

    /**
     * You may just don't know the concrete vehicles that
     * will exist in the application. But you can specify a type
     * for them to comply with.
     *
     * @return The created vehicle
     */
    T createVehicle();
}