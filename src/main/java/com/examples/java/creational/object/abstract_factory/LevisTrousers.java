package com.examples.java.creational.object.abstract_factory;

/**
 * Defines a product object to be created by the corresponding concrete factory.
 * Implements the AbstractProduct interface.
 *
 * Created by miztli on 21/02/17.
 */
public class LevisTrousers implements ITrousers {

    @Override
    public void brand() {
        System.out.println("Brand: Levis");
    }
}
