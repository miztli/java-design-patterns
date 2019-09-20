package com.examples.java.structural.object.facade;

public class UserDAOImpl implements UserDAO
{
    @Override
    public void save(final UserEntity user)
    {
        System.out.println(String.format("Persisting user with name: %s...", user.getName()));
    }

    @Override
    public void update(final UserEntity user)
    {
        System.out.println(String.format("Updating user with name: %s...", user.getName()));
    }

    @Override
    public void remove(final long userId)
    {
        System.out.println(String.format("Removing user with id: %s...", userId));
    }
}
