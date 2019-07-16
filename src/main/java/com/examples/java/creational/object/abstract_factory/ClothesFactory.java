package com.examples.java.creational.object.abstract_factory;

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
