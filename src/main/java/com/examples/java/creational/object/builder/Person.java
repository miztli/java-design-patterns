package com.examples.java.creational.object.builder;

import com.google.common.base.Preconditions;

/**
 * Created by miztli on 17/02/17.
 */
public class Person {

    private String name;
    private String surname;
    private String alias;
    private Address address;
    private String[] telephones;
    private int age;
    private Company company;

    private Person(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String[] getTelephones() {
        return telephones;
    }

    public void setTelephones(String[] telephones) {
        this.telephones = telephones;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Person(PersonBuilder personBuilder) {
        Preconditions.checkNotNull(personBuilder.getName(), "Name cannot be null");
        Preconditions.checkNotNull(personBuilder.getSurname(), "Surname cannot be null");
        Preconditions.checkArgument(personBuilder.getTelephones().length >= 1, "Person must have at least one telephone number");
        this.name = personBuilder.getName();
        this.surname = personBuilder.getSurname();
        this.alias = personBuilder.getAlias();
        this.address = personBuilder.getAddress();
        this.telephones = personBuilder.getTelephones();
        this.age = personBuilder.getAge();
        this.company = personBuilder.getCompany();
    }
}
