package com.examples.java.structural.object.facade;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Concrete implementation of {@link HumanResourcesService}
 */
public class HumanResourcesServiceImpl implements HumanResourcesService
{
    @Override
    public List<UserEntity> getSelectableUsers(final List<UserEntity> users)
    {
        return users
            .stream()
            .filter(userEntity -> userEntity.isActive())
            .collect(Collectors.toList());
    }
}
