package com.examples.java.creational.object.abstract_factory;

/**
 * Implements the operations to create concrete product objects.
 *
 * An application typically needs only one instance of a
 * ConcreteFactory per product family. So it's usually best
 * implemented as a Singleton.
 *
 * Created by miztli on 21/02/17.
 */
public class ClothesFactory {

    private ClothesFactory() {
        super();
    }

    public static IClothesFactory getClothesFactory(final FactoryType type){
        switch (type){
            case BERSHKA:
                    return BershkaFactory.getInstance();
            case ZARA:
                    return ZaraFactory.getInstance();
            default:
                    return BershkaFactory.getInstance();

        }
    }

    public enum FactoryType{
        BERSHKA,
        ZARA
    }
}
