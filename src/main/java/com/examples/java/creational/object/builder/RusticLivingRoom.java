package com.examples.java.creational.object.builder;

public class RusticLivingRoom extends LivingRoom
{
    private boolean hasWoodenFurniture;

    public RusticLivingRoom(final int numberOfWalls, final String colour, final boolean hasWoodenFurniture)
    {
        super(numberOfWalls, colour);
        this.hasWoodenFurniture = hasWoodenFurniture;
    }

    public boolean isHasWoodenFurniture()
    {
        return hasWoodenFurniture;
    }

    public void setHasWoodenFurniture(final boolean hasWoodenFurniture)
    {
        this.hasWoodenFurniture = hasWoodenFurniture;
    }

    public static RusticLivingRoom from(final int numberOfWalls, final String colour,
            final boolean hasWoodenFurniture)
    {
        return new RusticLivingRoom(numberOfWalls, colour, hasWoodenFurniture);
    }
}
