package com.examples.java.structural.object.facade;

import java.util.List;
import java.util.function.Predicate;

/**
 * Provides all {@link UserEntity} operations.
 */
public interface UserService
{
    /**
     * Save a user into the db.
     * @param user The provided user.
     */
    void save(UserEntity user);

    /**
     * Save a listo of users into the db.
     * @param users The provided user list.
     */
    void saveAll(List<UserEntity> users);

    /**
     * @return The complete list of users in the db.
     */
    List<UserEntity> findAll();

    /**
     *
     * @param filter The provided predicate for filtering users.
     * @return The list of matching users.
     */
    List<UserEntity> findAllFiltered(final Predicate<UserEntity> filter);
}
