package com.examples.java.structural.object.facade;

import java.util.Optional;

/**
 * This class will handle the conversion from the
 * {@link UserEntity} to the {@link UserDto} and vice versa.
 * This can be seen as another design pattern, however we will
 * try to keep it simple for this example, which is focused
 * mainly in teh Facade design pattern.
 */
public class UserMapper
{
    public static UserDto from(final UserEntity userEntity)
    {
        final UserDto userDto = new UserDto();
        userDto.setCompleteName(
            String.format("%s%s%s",
                Optional.ofNullable(userEntity.getName()).orElse(""),
                Optional.ofNullable(userEntity.getSurname1()).orElse(""),
                Optional.ofNullable(userEntity.getSurname2()).orElse("")));
        userDto.setAge(Optional.ofNullable(userEntity.getAge()).orElse(0));
        userDto.setAddress(Optional.ofNullable(userEntity.getAddress()).orElse(""));
        userDto.setPhone(Optional.ofNullable(userEntity.getPhone()).orElse(""));
        userDto.setActive(userEntity.isActive());
        userDto.setInOffice(userEntity.isInOffice());
        userDto.hasAssignedProject(userEntity.hasAssignedProject());

        return userDto;
    }
}
