package com.examples.java.structural.object.facade;

import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImpl implements CarService
{
    private static final String FORD_MODELS = "ford";

    private CarDAO carDAO;

    @Override
    public List<CarEntity> getUnassignedCars()
    {
        List<CarEntity> cars = getCarDAO().findAll();

        return cars
        .stream()
        .filter(carEntity -> carEntity.isAssigned())
        .collect(Collectors.toList());
    }

    public CarDAO getCarDAO()
    {
        return carDAO;
    }

    public void setCarDAO(final CarDAO carDAO)
    {
        this.carDAO = carDAO;
    }
}
