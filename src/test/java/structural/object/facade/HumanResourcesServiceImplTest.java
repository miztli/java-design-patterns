package structural.object.facade;

import com.examples.java.structural.object.facade.HumanResourcesService;
import com.examples.java.structural.object.facade.HumanResourcesServiceImpl;
import com.examples.java.structural.object.facade.UserEntity;
import org.junit.Test;

import java.util.List;

import static com.examples.java.structural.object.facade.App.initializeDefaultUserEntitiesList;
import static org.junit.Assert.assertTrue;

public class HumanResourcesServiceImplTest
{

  private final HumanResourcesService humanResourcesService = new HumanResourcesServiceImpl();

  @Test(expected = IllegalArgumentException.class)
  public void whenProvidingNullList_then_ExpectException() {
    humanResourcesService.getSelectableUsers(null);
  }

  @Test()
  public void givenAUsersList_thenValidate_filteredUsersList() {
    final List<UserEntity> users = humanResourcesService.getSelectableUsers(initializeDefaultUserEntitiesList());

    assertTrue(users.stream().allMatch(UserEntity::isActive));
  }
}
