package structural.object.facade;

import com.examples.java.structural.object.facade.ProjectsAssignmentService;
import com.examples.java.structural.object.facade.ProjectsAssignmentServiceImpl;
import com.examples.java.structural.object.facade.UserEntity;
import org.junit.Test;

import java.util.List;

import static com.examples.java.structural.object.facade.App.initializeDefaultUserEntitiesList;
import static org.junit.Assert.assertTrue;

public class ProjectsAssignmentServiceImplTest
{

  private final ProjectsAssignmentService projectsAssignmentService = new ProjectsAssignmentServiceImpl();

  @Test(expected = IllegalArgumentException.class)
  public void whenProvidingNullList_then_ExpectException() {
    projectsAssignmentService.getUnassignedToProjectUsers(null);
  }

  @Test()
  public void givenAUsersList_thenValidate_filteredUsersList() {
    final List<UserEntity> users = projectsAssignmentService.getUnassignedToProjectUsers(initializeDefaultUserEntitiesList());

    assertTrue(users.stream().allMatch(UserEntity::hasAssignedProject));
  }
}
