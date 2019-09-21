package com.examples.java.structural.object.facade;

import java.util.List;

public class UserFacadeClientA extends DefaultUserFacade
{
    private AttendanceService attendanceService;

    private ProjectsAssignmentService projectsAssignmentService;

    public UserFacadeClientA(final UserService userService, final HumanResourcesService humanResourcesService,
        final AttendanceService attendanceService, final ProjectsAssignmentService projectsAssignmentService)
    {
        super(userService, humanResourcesService);
        this.attendanceService = attendanceService;
        this.projectsAssignmentService = projectsAssignmentService;
    }

    @Override
    public List<UserDto> getAvailableUsers()
    {
        final List<UserEntity> users = getUserService().findAll();
        final List<UserEntity> activeUsers = getHumanResourcesService().getSelectableUsers(users);
        final List<UserEntity> inOfficeUsers = getAttendanceService().getInOfficeUsers(activeUsers);
        final List<UserEntity> unassignedToProjectUsers = getProjectsAssignmentService().getUnassignedToProjectUsers(inOfficeUsers);

        return map(unassignedToProjectUsers);
    }

    public AttendanceService getAttendanceService()
    {
        return attendanceService;
    }

    public void setAttendanceService(final AttendanceService attendanceService)
    {
        this.attendanceService = attendanceService;
    }

    public ProjectsAssignmentService getProjectsAssignmentService()
    {
        return projectsAssignmentService;
    }

    public void setProjectsAssignmentService(final ProjectsAssignmentService projectsAssignmentService)
    {
        this.projectsAssignmentService = projectsAssignmentService;
    }
}
