package structural.object.facade;

import com.examples.java.structural.object.facade.*;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static com.examples.java.structural.object.facade.App.initializeDefaultUserEntitiesList;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

public class UserFacadeClientATest
{

  private final UserFacadeClientA facadeA = new UserFacadeClientA();

  private final UserService userService = mock(UserServiceImpl.class);

  private final HumanResourcesService humanResourcesService = spy(HumanResourcesServiceImpl.class);

  private final AttendanceService attendanceService = spy(AttendanceServiceImpl.class);

  private final ProjectsAssignmentService projectsAssignmentService = spy(ProjectsAssignmentServiceImpl.class);

  @Before
  public void setup() {
    facadeA.setUserService(userService);
    facadeA.setHumanResourcesService(humanResourcesService);
    facadeA.setAttendanceService(attendanceService);
    facadeA.setProjectsAssignmentService(projectsAssignmentService);
  }

  @Test
  public void shouldReturnFilteredUsers() {
    when(userService.findAll())
            .thenReturn(initializeDefaultUserEntitiesList());

    List<UserDto> users = facadeA.getAvailableUsers();

    verify(userService).findAll();
    verify(projectsAssignmentService).getUnassignedToProjectUsers(anyList());
    verify(attendanceService).getInOfficeUsers(anyList());
    verify(humanResourcesService).getSelectableUsers(anyList());

    assertTrue(users.size() == 3);
  }
}
