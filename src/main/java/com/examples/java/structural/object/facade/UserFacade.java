package com.examples.java.structural.object.facade;

import java.util.List;

/**
 * Remember to always code against interfaces.
 *
 * This facade interface will be the public API of our facade.
 * Making use of an interface help us keeping our facade abstract,
 * without the need of concrete implementations.
 */
public interface UserFacade
{
    List<UserDto> getAvailableUsers();
}
