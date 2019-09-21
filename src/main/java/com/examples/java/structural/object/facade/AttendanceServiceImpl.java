package com.examples.java.structural.object.facade;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Concrete implementation of the {@link AttendanceService}
 */
public class AttendanceServiceImpl implements AttendanceService
{
    @Override
    public List<UserEntity> getInOfficeUsers(final List<UserEntity> users)
    {
        return users
            .stream()
            .filter(user -> user.isInOffice())
            .collect(Collectors.toList());
    }
}
