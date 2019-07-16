package com.examples.java.creational.object.abstract_factory;

/**
 * Implements the operations to create concrete product objects.
 *
 * An application typically needs only one instance of a
 * ConcreteFactory per product family. So it's usually best
 * implemented as a Singleton
 *
 * Created by miztli on 21/02/17.
 */
public class ZaraFactory implements IClothesFactory {

    /**
     * Factory instance (Singleton pattern)
     */
    private static ZaraFactory instance;

    /**
     * hide default constructor to avoid instantiation
     */
    private ZaraFactory() {}

    public static ZaraFactory getInstance() {

        // for multithreading consider refactoring this singleton
        return instance != null
                ? instance
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
