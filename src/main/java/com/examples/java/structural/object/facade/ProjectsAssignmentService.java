package com.examples.java.structural.object.facade;

import java.util.List;

/**
 * Provides projects module operations.
 */
public interface ProjectsAssignmentService
{
    List<UserEntity> getUnassignedToProjectUsers(List<UserEntity> users);
}
