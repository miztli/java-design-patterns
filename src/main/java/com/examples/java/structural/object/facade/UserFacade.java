package com.examples.java.structural.object.facade;

public interface UserFacade
{
    void createDefaultUser(String name, int age);

    void removeUser(int userId);

    void activateUser(int userId);
}
