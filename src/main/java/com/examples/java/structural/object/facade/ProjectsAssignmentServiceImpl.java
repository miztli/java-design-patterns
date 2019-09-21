package com.examples.java.structural.object.facade;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Concrete implementation of {@link ProjectsAssignmentService}
 */
public class ProjectsAssignmentServiceImpl implements ProjectsAssignmentService
{
    @Override
    public List<UserEntity> getUnassignedToProjectUsers(final List<UserEntity> users)
    {
        return users
            .stream().filter(user -> user.hasAssignedProject())
            .collect(Collectors.toList());
    }
}
