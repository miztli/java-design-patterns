package com.examples.java.creational.object.builder;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BuilderPatternTest
{
    private Bathroom bathroom;

    private Bathroom guestsBathroom;

    private Bathroom masterBathroom;

    private Garage garage;

    private Garage suvGarage;

    private Garage standardGarage;

    private LivingRoom livingRoom;

    private LivingRoom rusticLivingRoom;

    private LivingRoom traditionalLivingRoom;

    private Kitchen kitchen;

    private Kitchen lShapedKitchen;

    private Kitchen uShapedkitchen;

    private Room room;

    private Room masterRoom;

    private Room kidsRoom;

    private String address;

    private int numberOfFloors;

    private int capacity;

    @Before
    public void init()
    {
        address = "Wallstreet road #24";
        numberOfFloors = 2;
        capacity = 10;
        bathroom = Bathroom.from(false, true, "Brown");
        guestsBathroom = GuestsBathroom.from(true, true, "white", true);
        masterBathroom = MasterBathroom.from(false, true, "Grey", false);
        garage = Garage.from(4, "Brown", 3);
        standardGarage = StandardGarage.from(4, "Brown", 3, true);
        suvGarage = SUVGarage.from(4, "Brown", 3, 4);
        kitchen = Kitchen.from(4, "Red");
        lShapedKitchen = LShapedKitchen.from(4, "Red", true);
        uShapedkitchen = UShapedKitchen.from(4, "Red", true);
        livingRoom = LivingRoom.from(4, "White");
        rusticLivingRoom = RusticLivingRoom.from(4, "White", true);
        traditionalLivingRoom = TraditionalLivingRoom.from(4, "White", true);
        room = Room.from(4, 2, "White");
        masterRoom = MasterRoom.from(4, 2, "White", true);
        kidsRoom = KidsRoom.from(4, 2, "Blue / Pink", true);
    }

    @Test
    public void whenBasicParamsSet_createHouseSuccessfully()
    {
        House house =
                new House.HouseBuilder()
                        .setAddress(address)
                        .setNumberOfFloors(numberOfFloors)
                        .setCapacity(capacity)
                        .build();

        Assert.assertEquals(address, house.getAddress());
        Assert.assertEquals(capacity, house.getCapacity());
        Assert.assertEquals(numberOfFloors, house.getNumberOfFloors());
        Assert.assertNull(house.getGarage());
        Assert.assertNull(house.getKitchen());
        Assert.assertNull(house.getLivingroom());
        Assert.assertNull(house.getRooms());
        Assert.assertNull(house.getBathrooms());
    }

    @Test
    public void whenAllParamsSet_createHouseSuccessfully()
    {
        House house =
                new House.HouseBuilder()
                        .setAddress(address)
                        .setNumberOfFloors(numberOfFloors)
                        .setCapacity(capacity)
                        .setBathrooms(Arrays.asList(bathroom, guestsBathroom, masterBathroom))
                        .setGarage(suvGarage)
                        .setKitchen(uShapedkitchen)
                        .setLivingroom(rusticLivingRoom)
                        .setRooms(Arrays.asList(kidsRoom, masterRoom))
                        .build();

        Assert.assertEquals(address, house.getAddress());
        Assert.assertEquals(capacity, house.getCapacity());
        Assert.assertEquals(numberOfFloors, house.getNumberOfFloors());
        Assert.assertTrue(house.getGarage() instanceof SUVGarage);
        Assert.assertTrue(house.getKitchen() instanceof UShapedKitchen);
        Assert.assertTrue(house.getLivingroom() instanceof RusticLivingRoom);
        Assert.assertTrue(house.getRooms().size() == 2);
        Assert.assertTrue(house.getBathrooms().size() == 3);
    }

    @Test(expected = RuntimeException.class)
    public void whenAddressNotSet_ExpectRuntimeException()
    {
        new House.HouseBuilder()
                .setNumberOfFloors(numberOfFloors)
                .setCapacity(capacity)
                .setBathrooms(Arrays.asList(bathroom, guestsBathroom, masterBathroom))
                .setGarage(suvGarage)
                .setKitchen(uShapedkitchen)
                .setLivingroom(rusticLivingRoom)
                .setRooms(Arrays.asList(kidsRoom, masterRoom))
                .build();
    }

    @Test(expected = RuntimeException.class)
    public void whenNumberOfFloorsNotSet_ExpectRuntimeException()
    {
        new House.HouseBuilder()
                .setAddress(address)
                .setCapacity(capacity)
                .setBathrooms(Arrays.asList(bathroom, guestsBathroom, masterBathroom))
                .setGarage(suvGarage)
                .setKitchen(uShapedkitchen)
                .setLivingroom(rusticLivingRoom)
                .setRooms(Arrays.asList(kidsRoom, masterRoom))
                .build();
    }

    @Test(expected = RuntimeException.class)
    public void whenCapacityNotSet_ExpectRuntimeException()
    {
        new House.HouseBuilder()
                .setAddress(address)
                .setNumberOfFloors(numberOfFloors)
                .setBathrooms(Arrays.asList(bathroom, guestsBathroom, masterBathroom))
                .setGarage(suvGarage)
                .setKitchen(uShapedkitchen)
                .setLivingroom(rusticLivingRoom)
                .setRooms(Arrays.asList(kidsRoom, masterRoom))
                .build();
    }
}
