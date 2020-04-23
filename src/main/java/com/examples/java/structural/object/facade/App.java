package com.examples.java.structural.object.facade;

import java.util.List;

public class App
{
    //
    public final static boolean ACTIVE = true;

    public final static boolean INACTIVE = false;

    public final static boolean IN_OFFICE = true;

    public final static boolean OUT_OF_OFFICE = false;

    public final static boolean ASSIGNED_TO_PROJECT = true;

    public final static boolean WITHOUT_PROJECT = false;

    public static void main(String[] args)
    {
        // Services
        UserService userService = new UserServiceImpl(initializeDefaultUserEntitiesList());
        AttendanceService attendanceService = new AttendanceServiceImpl();
        HumanResourcesService humanResourcesService = new HumanResourcesServiceImpl();
        ProjectsAssignmentService projectsAssignmentService = new ProjectsAssignmentServiceImpl();

        // Notice how interface will help keeping the facade abstracted from the concrete client implementations
        UserFacade clientAFacade = new UserFacadeClientA(userService, humanResourcesService, attendanceService, projectsAssignmentService);
        UserFacade clientBFacade = new UserFacadeClientB(userService, humanResourcesService, attendanceService);

        List<UserDto> usersForClientA = clientAFacade.getAvailableUsers();
        List<UserDto> usersForClientB = clientBFacade.getAvailableUsers();

        System.out.println("Users got from Client's A Facade");
        printUsers(usersForClientA);

        System.out.println("Users got from Client's B Facade");
        printUsers(usersForClientB);

        // Finally we notice how facades help us to expose a public interface which
        // can be adapted accordingly to the client requirements, without the need to
        // change our services logic.
    }

    public static List<UserEntity> initializeDefaultUserEntitiesList()
    {
        return List.of(
            new UserEntity(1, "david", "beckham", "", 45, "First road #51", "5512435432", INACTIVE, IN_OFFICE, ASSIGNED_TO_PROJECT),
            new UserEntity(2, "javier", "hernandez", "", 32, "Second road #52", "33455665", ACTIVE, OUT_OF_OFFICE, ASSIGNED_TO_PROJECT),
            new UserEntity(3, "lionel", "messi", "", 33, "Third road #53", "5544336655", ACTIVE, IN_OFFICE, ASSIGNED_TO_PROJECT),
            new UserEntity(4, "cristiano", "ronaldo", "", 30, "Fourth road #54", "44335566", ACTIVE, IN_OFFICE, ASSIGNED_TO_PROJECT),
            new UserEntity(5, "rafa", "marquez", "", 44, "Fifth road #55", "8877887665", ACTIVE, IN_OFFICE, ASSIGNED_TO_PROJECT),
            new UserEntity(6, "hector", "herrera", "", 29, "Sixth road #56", "5534455443", ACTIVE, OUT_OF_OFFICE, ASSIGNED_TO_PROJECT),
            new UserEntity(7, "david", "villa", "", 37, "Seventh road #57", "223212344", INACTIVE, IN_OFFICE, ASSIGNED_TO_PROJECT),
            new UserEntity(8, "guillermo", "ochoa", "", 32, "Eighth road #58", "3354455667", ACTIVE, IN_OFFICE, WITHOUT_PROJECT));
    }

    public static void printUsers(final List<UserDto> users)
    {
        users.stream().map(userDto -> userDto.toString()).forEach(System.out::println);
    }
}
