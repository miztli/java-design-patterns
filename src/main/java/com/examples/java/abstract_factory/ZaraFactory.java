package com.examples.java.abstract_factory;

/**
 * Created by miztli on 21/02/17.
 */
public class ZaraFactory implements IClothesFactory {
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
