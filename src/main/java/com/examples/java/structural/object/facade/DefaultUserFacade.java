package com.examples.java.structural.object.facade;

import java.util.List;
import java.util.stream.Collectors;

public class DefaultUserFacade implements UserFacade
{
    private UserService userService;

    private HumanResourcesService humanResourcesService;

    public DefaultUserFacade(final UserService userService, final HumanResourcesService humanResourcesService)
    {
        this.userService = userService;
        this.humanResourcesService = humanResourcesService;
    }

    @Override
    public List<UserDto> getAvailableUsers()
    {
        final List<UserEntity> users = getUserService().findAll();
        final List<UserEntity> activeUsers = getHumanResourcesService().getSelectableUsers(users);

        return map(activeUsers);
    }

    public List<UserDto> map(final List<UserEntity> userEntities)
    {
        return userEntities
            .stream()
            .map(UserMapper::from)
            .collect(Collectors.toList());
    }

    public UserService getUserService()
    {
        return userService;
    }

    public void setUserService(final UserService userService)
    {
        this.userService = userService;
    }

    public HumanResourcesService getHumanResourcesService()
    {
        return humanResourcesService;
    }

    public void setHumanResourcesService(final HumanResourcesService humanResourcesService)
    {
        this.humanResourcesService = humanResourcesService;
    }
}
