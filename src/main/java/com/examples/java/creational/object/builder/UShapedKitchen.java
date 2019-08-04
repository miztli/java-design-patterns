package com.examples.java.creational.object.builder;

public class UShapedKitchen extends Kitchen
{
    private boolean hasCupboard;

    public UShapedKitchen(final int numberOfWalls, final String colour,
            final boolean hasCupboard)
    {
        super(numberOfWalls, colour);
        this.hasCupboard = hasCupboard;
    }

    public static UShapedKitchen from(final int numberOfWalls, final String colour,
            final boolean hasCupboard)
    {
        return new UShapedKitchen(numberOfWalls, colour, hasCupboard);
    }
}
