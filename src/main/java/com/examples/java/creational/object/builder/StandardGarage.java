package com.examples.java.creational.object.builder;

public class StandardGarage extends Garage
{
    private boolean hasToolsKit;

    public StandardGarage(final int numberOfWalls, final String colour,
            final int capacity, final boolean hasToolsKit)
    {
        super(numberOfWalls, colour, capacity);
        this.hasToolsKit = hasToolsKit;
    }

    public boolean hasToolsKit()
    {
        return hasToolsKit;
    }

    public void hasToolsKit(final boolean hasToolsKit)
    {
        this.hasToolsKit = hasToolsKit;
    }

    public static StandardGarage from(final int numberOfWalls, final String colour,
            final int capacity, final boolean hasToolsKit) {
        return new StandardGarage(numberOfWalls, colour, capacity, hasToolsKit);
    }
}
