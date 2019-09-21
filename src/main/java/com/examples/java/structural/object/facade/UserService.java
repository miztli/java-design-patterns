package com.examples.java.structural.object.facade;

import java.util.List;
import java.util.function.Predicate;

/**
 * Provides all {@link UserEntity} operations.
 */
public interface UserService
{
    void save(UserEntity user);

    void saveAll(List<UserEntity> users);

    List<UserEntity> findAll();

    List<UserEntity> findAllFiltered(final Predicate<UserEntity> filter);
}
