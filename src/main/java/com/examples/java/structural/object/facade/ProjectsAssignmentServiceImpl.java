package com.examples.java.structural.object.facade;

import java.util.List;
import java.util.stream.Collectors;

import static com.examples.java.utils.Preconditions.isNotNull;

/**
 * Concrete implementation of {@link ProjectsAssignmentService}
 */
public class ProjectsAssignmentServiceImpl implements ProjectsAssignmentService
{
    @Override
    public List<UserEntity> getUnassignedToProjectUsers(final List<UserEntity> users)
    {
        isNotNull(users, "users list");
        return users
            .stream().filter(user -> user.hasAssignedProject())
            .collect(Collectors.toList());
    }
}
