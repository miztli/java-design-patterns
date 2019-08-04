package com.examples.java.creational.object.builder;

public class GuestsBathroom extends Bathroom
{
    private boolean hasSpecialDecoration;

    public GuestsBathroom(final boolean hasShowerCabin, final boolean hasToilet,
            final String colour, final boolean hasSpecialDecoration)
    {
        super(hasShowerCabin, hasToilet, colour);
        this.hasSpecialDecoration = hasSpecialDecoration;
    }

    public boolean isHasSpecialDecoration()
    {
        return hasSpecialDecoration;
    }

    public void setHasSpecialDecoration(final boolean hasSpecialDecoration)
    {
        this.hasSpecialDecoration = hasSpecialDecoration;
    }

    public static GuestsBathroom from(final boolean hasShowerCabin, final boolean hasToilet,
            final String colour, final boolean hasSpecialDecoration)
    {
        return new GuestsBathroom(hasShowerCabin, hasToilet,
                colour, hasSpecialDecoration);
    }
}
