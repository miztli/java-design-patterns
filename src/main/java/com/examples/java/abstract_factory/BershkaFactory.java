package com.examples.java.abstract_factory;

/**
 * Created by miztli on 21/02/17.
 */
public class BershkaFactory implements IClothesFactory {
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
