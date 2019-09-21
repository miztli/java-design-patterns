package com.examples.java.structural.object.facade;

import java.util.List;

/**
 * Service to control user attendance.
 */
public interface AttendanceService
{
    /**
     * Return a list of users that are present
     * at this time in the office because they've been through
     * the attendance control.
     *
     * @param users A superset of users.
     * @return The subset of users filtered from the given superset.
     */
    List<UserEntity> getInOfficeUsers(List<UserEntity> users);
}
