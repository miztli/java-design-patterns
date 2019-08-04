package com.examples.java.creational.object.builder;

public class Bathroom
{
    private boolean hasShowerCabin;
    private boolean hasToilet;
    private String colour;

    public Bathroom(final boolean hasShowerCabin, final boolean hasToilet, final String colour)
    {
        this.hasShowerCabin = hasShowerCabin;
        this.hasToilet = hasToilet;
        this.colour = colour;
    }

    public boolean hasShowerCabin()
    {
        return hasShowerCabin;
    }

    public void hasShowerCabin(final boolean hasShowerCabin)
    {
        this.hasShowerCabin = hasShowerCabin;
    }

    public boolean hasToilet()
    {
        return hasToilet;
    }

    public void hasToilet(final boolean hasToilet)
    {
        this.hasToilet = hasToilet;
    }

    public String getColour()
    {
        return colour;
    }

    public void setColour(final String colour)
    {
        this.colour = colour;
    }

    public static Bathroom from(final boolean hasShowerCabin,
            final boolean hasToilet, final String colour) {

        return new Bathroom(hasShowerCabin, hasToilet, colour);
    }
}
