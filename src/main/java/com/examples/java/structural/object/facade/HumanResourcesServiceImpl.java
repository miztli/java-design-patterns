package com.examples.java.structural.object.facade;

import java.util.List;
import java.util.stream.Collectors;

import static com.examples.java.utils.Preconditions.isNotNull;

/**
 * Concrete implementation of {@link HumanResourcesService}
 */
public class HumanResourcesServiceImpl implements HumanResourcesService
{
    @Override
    public List<UserEntity> getSelectableUsers(final List<UserEntity> users)
    {
        isNotNull(users, "users list");
        return users
            .stream()
            .filter(userEntity -> userEntity.isActive())
            .collect(Collectors.toList());
    }
}
