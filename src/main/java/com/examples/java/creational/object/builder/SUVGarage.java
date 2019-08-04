package com.examples.java.creational.object.builder;

public class SUVGarage extends Garage
{
    private int specialHeight;

    public SUVGarage(final int numberOfWalls, final String colour,
            final int capacity, final int specialHeight)
    {
        super(numberOfWalls, colour, capacity);
        this.specialHeight = specialHeight;
    }

    public int getSpecialHeight()
    {
        return specialHeight;
    }

    public void setSpecialHeight(final int specialHeight)
    {
        this.specialHeight = specialHeight;
    }

    public static SUVGarage from(final int numberOfWalls, final String colour,
            final int capacity, final int specialHeight)
    {
        return new SUVGarage(numberOfWalls, colour, capacity, specialHeight);
    }
}
