package com.examples.java.abstract_factory;

import java.util.Enumeration;

/**
 * Created by miztli on 21/02/17.
 */
public class ClothesFactory {

    private ClothesFactory() {
        super();
    }

    public static IClothesFactory getClothesFactory(final FactoryType type){
        switch (type){
            case BERSHKA:
                    return new BershkaFactory();
            case ZARA:
                    return new ZaraFactory();
            default:
                    return new BershkaFactory();

        }
    }

    public enum FactoryType{
        BERSHKA,
        ZARA
    }
}
