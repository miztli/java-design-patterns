package com.examples.java.creational.object.abstract_factory;

/**
 * Implements the operations to create concrete product objects.
 *
 * An application typically needs only one INSTANCE of a
 * ConcreteFactory per product family. So it's usually best
 * implemented as a Singleton
 *
 * Created by miztli on 21/02/17.
 */
public class ZaraFactory implements IClothesFactory {

    /**
     * Factory INSTANCE (Singleton pattern)
     */
    private static ZaraFactory INSTANCE;

    /**
     * hide default constructor to avoid instantiation
     */
    private ZaraFactory() {}

    public static ZaraFactory getInstance() {

        // for multithreading consider refactoring this singleton
        return INSTANCE != null
                ? INSTANCE
                : new ZaraFactory();
    }

    @Override
    public ITrousers makeTrousers() {
        return new LevisTrousers();
    }

    @Override
    public ISweater makeSweater() {
        return new PoloSweater();
    }

    @Override
    public ITennis makeTennis() {
        return new NikeTennis();
    }
}
