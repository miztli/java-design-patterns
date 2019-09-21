package com.examples.java.structural.object.facade;

import java.util.List;

/**
 * Provides human resources module operations.
 */
public interface HumanResourcesService
{
    List<UserEntity> getSelectableUsers(List<UserEntity> users);
}
