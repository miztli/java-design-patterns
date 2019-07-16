package com.examples.java.creational.object.abstract_factory;

/**
 * Declares an interface for operations that create abstract product objects.
 *
 * Created by miztli on 21/02/17.
 */
public interface IClothesFactory {

    ITrousers makeTrousers();
    ISweater makeSweater();
    ITennis makeTennis();
}
