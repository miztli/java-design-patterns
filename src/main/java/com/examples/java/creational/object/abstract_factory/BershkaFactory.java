package com.examples.java.creational.object.abstract_factory;

/**
 * Implements the operations to create concrete product objects.
 *
 * An application typically needs only one INSTANCE of a
 * ConcreteFactory per product family. So it's usually best
 * implemented as a Singleton.
 *
 * Created by miztli on 21/02/17.
 */
public class BershkaFactory implements IClothesFactory {

    /**
     * Factory INSTANCE (Singleton pattern)
     */
    private static BershkaFactory INSTANCE;

    /**
     * hide default constructor to avoid instantiation
     */
    private BershkaFactory() {}

    public static BershkaFactory getInstance() {

        // for multithreading consider refactoring this singleton
        return INSTANCE != null
                ? INSTANCE
                : new BershkaFactory();
    }

    @Override
    public ITrousers makeTrousers() {
        return new OggiTrousers();
    }

    @Override
    public ISweater makeSweater() {
        return new LacosteSweater();
    }

    @Override
    public ITennis makeTennis() {
        return new AdidasTennis();
    }
}
