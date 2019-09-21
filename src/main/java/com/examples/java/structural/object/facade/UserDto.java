package com.examples.java.structural.object.facade;

/**
 * External-facing data transfer object (aka. DTO).
 * Designed to transfer data in-out and out-into the application.
 */
public class UserDto
{
    private String completeName;

    private int age;

    private String address;

    private String phone;

    private boolean active;

    private boolean inOffice;

    private boolean hasAssignedProject;

    public String getCompleteName()
    {
        return completeName;
    }

    public void setCompleteName(final String completeName)
    {
        this.completeName = completeName;
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

    @Override
    public String toString()
    {
        return String.format(
            "User: name=%s, age=%d, address:%s, phone=%s, isActive=%s, isInOffice=%s, hasAssignedProject=%s",
            getCompleteName(),
            getAge(),
            getAddress(),
            getPhone(),
            isActive(),
            isInOffice(),
            hasAssignedProject());
    }
}
