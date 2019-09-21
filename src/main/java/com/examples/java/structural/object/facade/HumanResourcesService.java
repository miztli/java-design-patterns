package com.examples.java.structural.object.facade;

import java.util.List;

/**
 * Provides human resources module operations.
 */
public interface HumanResourcesService
{
    /**
     * @param users A superset of users.
     * @return The list of active users from the provided superset.
     */
    List<UserEntity> getSelectableUsers(List<UserEntity> users);
}
