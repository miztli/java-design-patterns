package com.examples.java.structural.object.facade;

import java.util.Arrays;
import java.util.List;

/**
 * DAO LAYER.
 * Concrete implementation of {@link CarDAO}
 */
public class CarDAOImpl implements CarDAO
{
    public final String MODEL_FORD_FIESTA = "ford fiesta";
    public final String MODEL_FORD_FOCUS = "ford focus";
    public final String MODEL_NISSAN_TSURU = "nissan tsuru";
    public final String MODEL_NISSAN_ALTIMA = "nissan altima";
    public final String MODEL_CHEVROLET_SPARK = "chevrolet spark";

    private List<CarEntity> carEntities;

    public CarDAOImpl()
    {
        // initialize car's store. This is mainly for example purposes,
        // use a DB instead in a production environment
        carEntities = Arrays.asList(
            CarEntity.createDefault(MODEL_FORD_FIESTA),
            CarEntity.createDefault(MODEL_FORD_FOCUS),
            CarEntity.createDefault(MODEL_NISSAN_TSURU),
            CarEntity.createDefault(MODEL_NISSAN_ALTIMA),
            CarEntity.createDefault(MODEL_CHEVROLET_SPARK)
        );
    }

    /**
     * @return A fake {@link List} of {@link CarEntity}
     * filtered by assigned property.
     */
    @Override
    public List<CarEntity> findAll()
    {
        return carEntities;
    }
}
