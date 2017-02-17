package com.examples.java.builder;

/**
 * Created by miztli on 17/02/17.
 */
public class Company {

    private String name;
    private String sector;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public Company(String name, String sector) {
        this.name = name;
        this.sector = sector;
    }
}
