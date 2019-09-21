package com.examples.java.structural.object.facade;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class UserFacadeClientB extends DefaultUserFacade
{
    private AttendanceService attendanceService;

    public UserFacadeClientB(final UserService userService, final HumanResourcesService humanResourcesService,
        final AttendanceService attendanceService)
    {
        super(userService, humanResourcesService);
        this.attendanceService = attendanceService;
    }

    @Override
    public List<UserDto> getAvailableUsers()
    {
        final List<UserEntity> users = getUserService().findAllFiltered(greaterThan(40));
        final List<UserEntity> activeUsers = getHumanResourcesService().getSelectableUsers(users);
        final List<UserEntity> inOfficeUsers = getAttendanceService().getInOfficeUsers(activeUsers);

        return map(inOfficeUsers);
    }

    private Predicate<UserEntity> greaterThan(final int years)
    {
        return userEntity -> userEntity.getAge() > years;
    }

    public AttendanceService getAttendanceService()
    {
        return attendanceService;
    }

    public void setAttendanceService(final AttendanceService attendanceService)
    {
        this.attendanceService = attendanceService;
    }
}
