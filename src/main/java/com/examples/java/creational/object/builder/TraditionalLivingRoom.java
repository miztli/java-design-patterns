package com.examples.java.creational.object.builder;

public class TraditionalLivingRoom extends LivingRoom
{
    private boolean hasArmchair;

    public TraditionalLivingRoom(final int numberOfWalls, final String colour,
            final boolean hasArmchair)
    {
        super(numberOfWalls, colour);
        this.hasArmchair = hasArmchair;
    }

    public boolean isHasArmchair()
    {
        return hasArmchair;
    }

    public void setHasArmchair(final boolean hasArmchair)
    {
        this.hasArmchair = hasArmchair;
    }

    public static TraditionalLivingRoom from(final int numberOfWalls,
            final String colour, final boolean hasArmchair)
    {
        return new TraditionalLivingRoom(numberOfWalls, colour, hasArmchair);
    }
}
