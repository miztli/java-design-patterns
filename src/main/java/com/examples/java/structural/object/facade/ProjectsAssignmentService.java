package com.examples.java.structural.object.facade;

import java.util.List;

/**
 * Provides projects module operations.
 */
public interface ProjectsAssignmentService
{
    /**
     * @param users A superset of users.
     * @return The list of users that currently are assigned to a project
     * from the provided superset.
     */
    List<UserEntity> getUnassignedToProjectUsers(List<UserEntity> users);
}
