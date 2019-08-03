package com.examples.java.creational.object.builder;

/**
 * Created by miztli on 17/02/17.
 */
public class PersonBuilder implements Builder<Person> {
    private String name;
    private String surname;
    private String alias;
    private Address address;
    private String[] telephones;
    private int age;
    private Company company;

    public PersonBuilder() {
    }

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

    public Person build() {
        return new Person(this);
    }
}
