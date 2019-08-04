package com.examples.java.creational.object.builder;

public class Garage
{
    private int numberOfWalls;
    private String colour;
    private int capacity;

    public Garage(final int numberOfWalls, final String colour, final int capacity)
    {
        this.numberOfWalls = numberOfWalls;
        this.colour = colour;
        this.capacity = capacity;
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

    public int getCapacity()
    {
        return capacity;
    }

    public void setCapacity(final int capacity)
    {
        this.capacity = capacity;
    }

    public static Garage from(final int numberOfWalls, final String colour,
            final int capacity)
    {
        return new Garage(numberOfWalls, colour, capacity);
    }
}
