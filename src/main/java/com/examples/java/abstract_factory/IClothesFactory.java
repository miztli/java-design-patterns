package com.examples.java.abstract_factory;

/**
 * Created by miztli on 21/02/17.
 */
public interface IClothesFactory {
    ITrousers makeTrousers();
    ISweater makeSweater();
    ITennis makeTennis();
}
