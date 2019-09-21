package com.examples.java.structural.object.facade;

import java.util.List;

public interface AttendanceService
{
    List<UserEntity> getInOfficeUsers(List<UserEntity> users);
}
