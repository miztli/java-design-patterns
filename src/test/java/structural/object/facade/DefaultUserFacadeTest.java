package structural.object.facade;

import com.examples.java.structural.object.facade.*;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static com.examples.java.structural.object.facade.App.initializeDefaultUserEntitiesList;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.anyList;
import static org.mockito.Mockito.*;

public class DefaultUserFacadeTest
{
  private final DefaultUserFacade facadeA = new DefaultUserFacade();

  private final UserService userService = mock(UserServiceImpl.class);

  private final HumanResourcesService humanResourcesService = spy(HumanResourcesServiceImpl.class);

  @Before
  public void setup() {
    facadeA.setUserService(userService);
    facadeA.setHumanResourcesService(humanResourcesService);
  }

  @Test
  public void shouldReturnFilteredUsers() {
    when(userService.findAll())
            .thenReturn(initializeDefaultUserEntitiesList());

    List<UserDto> users = facadeA.getAvailableUsers();

    verify(userService).findAll();
    verify(humanResourcesService).getSelectableUsers(anyList());

    assertTrue(users.size() == 6);
  }
}
