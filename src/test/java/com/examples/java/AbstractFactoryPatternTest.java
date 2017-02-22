package com.examples.java;

import com.examples.java.abstract_factory.BershkaFactory;
import com.examples.java.abstract_factory.ClothesFactory;
import com.examples.java.abstract_factory.IClothesFactory;
import com.examples.java.abstract_factory.ZaraFactory;
import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by miztli on 21/02/17.
 */
public class AbstractFactoryPatternTest {

    @Test
    public void getBershkaFactory(){
        System.out.println("Testing BershkaFactory");
        IClothesFactory cf = ClothesFactory.getClothesFactory(ClothesFactory.FactoryType.BERSHKA);
            cf.makeSweater().brand();
            cf.makeTennis().brand();
            cf.makeTrousers().brand();
        Assert.assertTrue(cf instanceof BershkaFactory);
    }

    @Test
    public void getZaraFactory(){
        System.out.println("Testing ZaraFactory");
        IClothesFactory cf = ClothesFactory.getClothesFactory(ClothesFactory.FactoryType.ZARA);
            cf.makeSweater().brand();
            cf.makeTennis().brand();
            cf.makeTrousers().brand();
        Assert.assertTrue(cf instanceof ZaraFactory);
    }
}
