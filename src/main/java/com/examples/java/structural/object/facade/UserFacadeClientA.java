package com.examples.java.structural.object.facade;

public class UserFacadeClientA implements UserFacade
{
    private UserService userService;

    private CarService carService;

    private EventsService eventsService;

    public void createDefaultUser(final String name, final int age) {
        eventsService.logEvent(String.format("Creating user with name: %s and age %d", name, age));

        UserEntity userEntity = new UserEntity();
        userEntity.setName(name);
        userEntity.setAge(age);

        userService.save(userEntity);
        eventsService.logEvent(String.format("User created %s", userEntity.getId()));
    }

    public void removeUser(final int userId) {

    }

    public void activateUser(final int userId) {

    }
}
