package com.examples.java.creational.object.builder;

public class KidsRoom extends Room
{
    private boolean hasToyStore;

    public KidsRoom(final int numberOfWalls, final int numberOfWindows,
            final String colour, final boolean hasToyStore)
    {
        super(numberOfWalls, numberOfWindows, colour);
        this.hasToyStore = hasToyStore;
    }

    public boolean isHasToyStore()
    {
        return hasToyStore;
    }

    public void setHasToyStore(final boolean hasToyStore)
    {
        this.hasToyStore = hasToyStore;
    }

    public static KidsRoom from(final int numberOfWalls, final int numberOfWindows,
            final String colour, final boolean hasToyStore)
    {
        return new KidsRoom(numberOfWalls, numberOfWindows, colour, hasToyStore);
    }
}
