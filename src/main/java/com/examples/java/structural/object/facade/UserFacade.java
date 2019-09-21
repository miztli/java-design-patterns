package com.examples.java.structural.object.facade;

import java.util.List;

/**
 * Remember to always code against interfaces.
 * Define methods to expose user operations.
 */
public interface UserFacade
{
    List<UserDto> getAvailableUsers();
}
