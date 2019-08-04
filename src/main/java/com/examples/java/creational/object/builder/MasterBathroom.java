package com.examples.java.creational.object.builder;

public class MasterBathroom extends Bathroom
{
    private boolean hasBathtub;

    public MasterBathroom(final boolean hasShowerCabin, final boolean hasToilet,
            final String colour, final boolean hasBathtub)
    {
        super(hasShowerCabin, hasToilet, colour);
        this.hasBathtub = hasBathtub;
    }

    public boolean hasBathtub()
    {
        return hasBathtub;
    }

    public void hasBathtub(final boolean hasBathtub)
    {
        this.hasBathtub = hasBathtub;
    }

    public static MasterBathroom from(final boolean hasShowerCabin, final boolean hasToilet,
            final String colour, final boolean hasBathtub)
    {
        return new MasterBathroom(hasShowerCabin, hasToilet, colour, hasBathtub);
    }
}
