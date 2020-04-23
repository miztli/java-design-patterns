package structural.object.facade;

import com.examples.java.structural.object.facade.*;
import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.function.Predicate;

import static com.examples.java.structural.object.facade.App.initializeDefaultUserEntitiesList;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyList;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;

public class UserFacadeClientBTest
{
  private final UserFacadeClientB facadeB = new UserFacadeClientB();

  private final UserServiceImpl userService = spy(UserServiceImpl.class);

  private final HumanResourcesService humanResourcesService = spy(HumanResourcesServiceImpl.class);

  private final AttendanceService attendanceService = spy(AttendanceServiceImpl.class);

  @Before
  public void setup() {
    userService.setUsers(initializeDefaultUserEntitiesList());

    facadeB.setUserService(userService);
    facadeB.setHumanResourcesService(humanResourcesService);
    facadeB.setAttendanceService(attendanceService);
  }

  @Test
  public void shouldReturnFilteredUsers() {
    List<UserDto> users = facadeB.getAvailableUsers();

    verify(userService).findAllFiltered(any(Predicate.class));
    verify(attendanceService).getInOfficeUsers(anyList());
    verify(humanResourcesService).getSelectableUsers(anyList());

    assertTrue(users.size() == 1);
  }
}
