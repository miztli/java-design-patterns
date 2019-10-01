package com.examples.java.structural.object.facade;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static com.examples.java.utils.Preconditions.isNotNull;

/**
 * Concrete implementation of {@link UserService}
 */
public class UserServiceImpl implements UserService

{
    private List<UserEntity> users;

    public UserServiceImpl(final List<UserEntity> users)
    {
        this.users = users;
    }

    @Override
    public void save(final UserEntity user)
    {
        getUsers().add(user);
    }

    @Override
    public void saveAll(final List<UserEntity> users)
    {
        getUsers().addAll(users);
    }

    @Override
    public List<UserEntity> findAll()
    {
        return getUsers();
    }

    @Override
    public List<UserEntity> findAllFiltered(final Predicate<UserEntity> filter)
    {
        return getUsers()
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
