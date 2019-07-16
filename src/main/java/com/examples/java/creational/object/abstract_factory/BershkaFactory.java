package com.examples.java.creational.object.abstract_factory;

/**
 * An application typically needs only one instance of a
 * ConcreteFactory per product family. So it's usually best
 * implemented as a Singleton
 *
 * Created by miztli on 21/02/17.
 */
public class BershkaFactory implements IClothesFactory {

    /**
     * Factory instance (Singleton pattern)
     */
    private static BershkaFactory instance;

    /**
     * hide default constructor to avoid instantiation
     */
    private BershkaFactory() {}

    public static BershkaFactory getInstance() {

        // for multithreading consider refactoring this singleton
        return instance != null
                ? instance
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
