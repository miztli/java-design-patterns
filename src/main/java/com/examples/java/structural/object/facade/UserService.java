package com.examples.java.structural.object.facade;

public interface UserService
{
    void save(UserEntity user);
    void update(UserEntity user);
    void remove(long userId);
}
