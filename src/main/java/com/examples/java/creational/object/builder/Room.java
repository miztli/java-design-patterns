package com.examples.java.creational.object.builder;

public class Room
{
    private int numberOfWalls;
    private int numberOfWindows;
    private String colour;

    public Room(final int numberOfWalls, final int numberOfWindows, final String colour)
    {
        this.numberOfWalls = numberOfWalls;
        this.numberOfWindows = numberOfWindows;
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

    public int getNumberOfWindows()
    {
        return numberOfWindows;
    }

    public void setNumberOfWindows(final int numberOfWindows)
    {
        this.numberOfWindows = numberOfWindows;
    }

    public String getColour()
    {
        return colour;
    }

    public void setColour(final String colour)
    {
        this.colour = colour;
    }

    public static Room from(final int numberOfWalls,
            final int numberOfWindows, final String colour) {

        return new Room(numberOfWalls, numberOfWindows, colour);
    }
}
