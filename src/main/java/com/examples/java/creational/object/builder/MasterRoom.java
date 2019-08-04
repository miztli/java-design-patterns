package com.examples.java.creational.object.builder;

public class MasterRoom extends Room
{
    private boolean hasSafetyBox;

    public MasterRoom(final int numberOfWalls, final int numberOfWindows,
            final String color, final boolean hasSafetyBox)
    {
        super(numberOfWalls, numberOfWindows, color);
        this.hasSafetyBox = hasSafetyBox;
    }

    public boolean hasSafetyBox()
    {
        return hasSafetyBox;
    }

    public void hasSafetyBox(final boolean hasSafetyBox)
    {
        this.hasSafetyBox = hasSafetyBox;
    }

    public static MasterRoom from(final int numberOfWalls,
            final int numberOfWindows, final String color, final boolean hasSafetyBox) {
        return new MasterRoom(numberOfWalls, numberOfWindows, color, hasSafetyBox);
    }
}
