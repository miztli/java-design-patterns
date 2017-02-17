package com.examples.java.builder;

/**
 * Created by miztli on 17/02/17.
 */
public class Address {
    private String street;
    private String state;
    private int number;

    public Address(String street, String state, int number) {
        this.street = street;
        this.state = state;
        this.number = number;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
