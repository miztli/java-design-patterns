package com.examples.java.structural.object.facade;

import java.util.List;
import java.util.stream.Collectors;

import static com.examples.java.utils.Preconditions.isNotNull;

/**
 * Concrete implementation of the {@link AttendanceService}
 */
public class AttendanceServiceImpl implements AttendanceService
{

    @Override
    public List<UserEntity> getInOfficeUsers(final List<UserEntity> users)
    {
        isNotNull(users, "users list");
        return users
            .stream()
            .filter(user -> user.isInOffice())
            .collect(Collectors.toList());
    }
}
