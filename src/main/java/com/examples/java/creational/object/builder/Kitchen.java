package com.examples.java.creational.object.builder;

public class Kitchen
{
    private int numberOfWalls;
    private String colour;

    public Kitchen(final int numberOfWalls, final String colour)
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

    public static Kitchen from(final int numberOfWalls, final String colour)
    {
        return new Kitchen(numberOfWalls, colour);
    }
}
