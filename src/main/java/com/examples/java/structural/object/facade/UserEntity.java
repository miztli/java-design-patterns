package com.examples.java.structural.object.facade;

public class UserEntity
{
    private long id;

    private String name;

    private String surname1;

    private String surname2;

    private int age;

    private String address;

    private String phone;

    private boolean active;

    private boolean inOffice;

    private boolean hasAssignedProject;

    public UserEntity(final long id, final String name, final String surname1, final String surname2, final int age, final String address,
        final String phone, final boolean active,
        final boolean inOffice, final boolean hasAssignedProject)
    {
        this.id = id;
        this.name = name;
        this.surname1 = surname1;
        this.surname2 = surname2;
        this.age = age;
        this.address = address;
        this.phone = phone;
        this.active = active;
        this.inOffice = inOffice;
        this.hasAssignedProject = hasAssignedProject;
    }

    public long getId()
    {
        return id;
    }

    public void setId(final long id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(final String name)
    {
        this.name = name;
    }

    public String getSurname1()
    {
        return surname1;
    }

    public void setSurname1(final String surname1)
    {
        this.surname1 = surname1;
    }

    public String getSurname2()
    {
        return surname2;
    }

    public void setSurname2(final String surname2)
    {
        this.surname2 = surname2;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(final int age)
    {
        this.age = age;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(final String address)
    {
        this.address = address;
    }

    public String getPhone()
    {
        return phone;
    }

    public void setPhone(final String phone)
    {
        this.phone = phone;
    }

    public boolean isActive()
    {
        return active;
    }

    public void setActive(final boolean active)
    {
        this.active = active;
    }

    public boolean isInOffice()
    {
        return inOffice;
    }

    public void setInOffice(final boolean inOffice)
    {
        this.inOffice = inOffice;
    }

    public boolean hasAssignedProject()
    {
        return hasAssignedProject;
    }

    public void hasAssignedProject(final boolean hasAssignedProject)
    {
        this.hasAssignedProject = hasAssignedProject;
    }
}
