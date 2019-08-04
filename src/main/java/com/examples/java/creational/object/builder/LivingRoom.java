package com.examples.java.creational.object.builder;

public class LivingRoom
{
    private int numberOfWalls;
    private String colour;

    public LivingRoom(final int numberOfWalls, final String colour)
    {
        this.numberOfWalls = numberOfWalls;
        this.colour = colour;
    }

    public int getNumberOfWalls()
    {
        return numberOfWalls;
    }

    public void setNumberOfWalls(final int numberOfWalls)
    {
        this.numberOfWalls = numberOfWalls;
    }

    public String getColour()
    {
        return colour;
    }

    public void setColour(final String colour)
    {
        this.colour = colour;
    }

    public static LivingRoom from(final int numberOfWalls, final String colour)
    {
        return new LivingRoom(numberOfWalls, colour);
    }
}
