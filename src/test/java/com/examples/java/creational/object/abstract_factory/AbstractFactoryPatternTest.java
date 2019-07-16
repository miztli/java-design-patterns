package com.examples.java.creational.object.abstract_factory;

import com.examples.java.creational.object.abstract_factory.BershkaFactory;
import com.examples.java.creational.object.abstract_factory.ClothesFactory;
import com.examples.java.creational.object.abstract_factory.IClothesFactory;
import com.examples.java.creational.object.abstract_factory.ZaraFactory;
import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by miztli on 21/02/17.
 */
public class AbstractFactoryPatternTest {

    @Test
    public void getBershkaFactory(){
        System.out.println("Testing BershkaFactory");

        IClothesFactory bershkaFactory = ClothesFactory.getClothesFactory(ClothesFactory.FactoryType.BERSHKA);

        ISweater iSweater = bershkaFactory.makeSweater();
        ITennis iTennis = bershkaFactory.makeTennis();
        ITrousers iTrousers = bershkaFactory.makeTrousers();

        Assert.assertTrue(iTennis instanceof AdidasTennis);
        Assert.assertTrue(iSweater instanceof LacosteSweater);
        Assert.assertTrue(iTrousers instanceof OggiTrousers);
    }

    @Test
    public void getZaraFactory(){
        System.out.println("Testing ZaraFactory");

        IClothesFactory zaraFactory = ClothesFactory.getClothesFactory(ClothesFactory.FactoryType.ZARA);

        ISweater iSweater = zaraFactory.makeSweater();
        ITennis iTennis = zaraFactory.makeTennis();
        ITrousers iTrousers = zaraFactory.makeTrousers();

        Assert.assertTrue(iTennis instanceof NikeTennis);
        Assert.assertTrue(iSweater instanceof PoloSweater);
        Assert.assertTrue(iTrousers instanceof LevisTrousers);
    }
}
