package com.examples.java.creational.object.builder;

public class LShapedKitchen extends Kitchen
{
    private boolean hasIsland;

    public LShapedKitchen(final int numberOfWalls, final String colour,
            final boolean hasIsland)
    {
        super(numberOfWalls, colour);
        this.hasIsland = hasIsland;
    }

    public boolean hasIsland()
    {
        return hasIsland;
    }

    public void hasIsland(final boolean hasIsland)
    {
        this.hasIsland = hasIsland;
    }

    public static LShapedKitchen from (final int numberOfWalls, final String colour,
            final boolean hasIsland)
    {
        return new LShapedKitchen(numberOfWalls, colour, hasIsland);
    }
}
