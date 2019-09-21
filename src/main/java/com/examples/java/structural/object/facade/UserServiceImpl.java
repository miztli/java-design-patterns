package com.examples.java.structural.object.facade;

import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class UserServiceImpl implements UserService

{
    private List<UserEntity> users = Collections.emptyList();

    public UserServiceImpl(final List<UserEntity> users)
    {
        this.users = users;
    }

    @Override
    public void save(final UserEntity user)
    {
        users.add(user);
    }

    @Override
    public void saveAll(final List<UserEntity> users)
    {
        users.addAll(users);
    }

    @Override
    public List<UserEntity> findAll()
    {
        return users;
    }

    @Override
    public List<UserEntity> findAllFiltered(final Predicate<UserEntity> filter)
    {
        return users
            .stream()
            .filter(filter)
            .collect(Collectors.toList());
    }

    public List<UserEntity> getUsers()
    {
        return users;
    }

    public void setUsers(final List<UserEntity> users)
    {
        this.users = users;
    }
}
