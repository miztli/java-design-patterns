package com.examples.java.creational.object.builder;

import java.util.List;

import com.examples.java.utils.Preconditions;

public class House
{
    private String address;
    private int numberOfFloors;
    private int capacity;
    private Kitchen kitchen;
    private List<Room> rooms;
    private List<Bathroom> bathrooms;
    private Garage garage;
    private LivingRoom livingroom;

    // Ensure instance can only be created from builder
    // to provide validation
    private House() {}

    public House(final HouseBuilder houseBuilder)
    {
        this.address = houseBuilder.address;
        this.numberOfFloors = houseBuilder.numberOfFloors;
        this.capacity = houseBuilder.capacity;
        this.kitchen = houseBuilder.kitchen;
        this.rooms = houseBuilder.rooms;
        this.bathrooms = houseBuilder.bathrooms;
        this.garage = houseBuilder.garage;
        this.livingroom = houseBuilder.livingroom;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(final String address)
    {
        this.address = address;
    }

    public int getNumberOfFloors()
    {
        return numberOfFloors;
    }

    public void setNumberOfFloors(final int numberOfFloors)
    {
        this.numberOfFloors = numberOfFloors;
    }

    public int getCapacity()
    {
        return capacity;
    }

    public void setCapacity(final int capacity)
    {
        this.capacity = capacity;
    }

    public Kitchen getKitchen()
    {
        return kitchen;
    }

    public void setKitchen(final Kitchen kitchen)
    {
        this.kitchen = kitchen;
    }

    public List<Room> getRooms()
    {
        return rooms;
    }

    public void setRooms(final List<Room> rooms)
    {
        this.rooms = rooms;
    }

    public List<Bathroom> getBathrooms()
    {
        return bathrooms;
    }

    public void setBathrooms(final List<Bathroom> bathrooms)
    {
        this.bathrooms = bathrooms;
    }

    public Garage getGarage()
    {
        return garage;
    }

    public void setGarage(final Garage garage)
    {
        this.garage = garage;
    }

    public LivingRoom getLivingroom()
    {
        return livingroom;
    }

    public void setLivingroom(final LivingRoom livingroom)
    {
        this.livingroom = livingroom;
    }

    public static class HouseBuilder implements Builder<House>
    {
        private String address;
        private int numberOfFloors;
        private int capacity;
        private Kitchen kitchen;
        private List<Room> rooms;
        private List<Bathroom> bathrooms;
        private Garage garage;
        private LivingRoom livingroom;

        @Override
        public House build()
        {
            // Add some validations before creating the object
            Preconditions.isBlank(address, "address");
            Preconditions.isBiggerThanCero(numberOfFloors, "numberOfFloors");
            Preconditions.isBiggerThanCero(capacity, "capacity");

            return new House(this);
        }

        public HouseBuilder setAddress(final String address)
        {
            this.address = address;
            return this;
        }

        public HouseBuilder setNumberOfFloors(final int numberOfFloors)
        {
            this.numberOfFloors = numberOfFloors;
            return this;
        }

        public HouseBuilder setCapacity(final int capacity)
        {
            this.capacity = capacity;
            return this;
        }

        public HouseBuilder setKitchen(final Kitchen kitchen)
        {
            this.kitchen = kitchen;
            return this;
        }

        public HouseBuilder setRooms(final List<Room> rooms)
        {
            this.rooms = rooms;
            return this;
        }

        public HouseBuilder setBathrooms(final List<Bathroom> bathrooms)
        {
            this.bathrooms = bathrooms;
            return this;
        }

        public HouseBuilder setGarage(final Garage garage)
        {
            this.garage = garage;
            return this;
        }

        public HouseBuilder setLivingroom(final LivingRoom livingroom)
        {
            this.livingroom = livingroom;
            return this;
        }
    }
}
