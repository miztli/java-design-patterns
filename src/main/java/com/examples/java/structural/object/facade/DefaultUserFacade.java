package com.examples.java.structural.object.facade;

import java.util.List;
import java.util.stream.Collectors;

/**
 * In many cases it useful to provide a Default implementation OOTB.
 * This way, wee can expose a default behaviour regardless of
 * the consuming client, keeping still the flexibility to
 * implement a more concrete implementation by extending this
 * class.
 */
public class DefaultUserFacade implements UserFacade
{
    private UserService userService;

    private HumanResourcesService humanResourcesService;

    public DefaultUserFacade(final UserService userService, final HumanResourcesService humanResourcesService)
    {
        this.userService = userService;
        this.humanResourcesService = humanResourcesService;
    }

    /**
     * @return The list of active users.
     */
    @Override
    public List<UserDto> getAvailableUsers()
    {
        final List<UserEntity> users = getUserService().findAll();
        final List<UserEntity> activeUsers = getHumanResourcesService().getSelectableUsers(users);

        return map(activeUsers);
    }

    /**
     * @param userEntities The provided list of entities.
     * @return The {@link UserDto} list got from the provided entities.
     */
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
