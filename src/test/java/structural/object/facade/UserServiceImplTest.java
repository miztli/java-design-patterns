package structural.object.facade;

import com.examples.java.structural.object.facade.UserEntity;
import com.examples.java.structural.object.facade.UserServiceImpl;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import static com.examples.java.structural.object.facade.App.INACTIVE;
import static com.examples.java.structural.object.facade.App.IN_OFFICE;
import static com.examples.java.structural.object.facade.App.ASSIGNED_TO_PROJECT;
import static com.examples.java.structural.object.facade.App.initializeDefaultUserEntitiesList;
import static org.junit.Assert.assertTrue;

public class UserServiceImplTest
{
  final List<UserEntity> users = new ArrayList<>(initializeDefaultUserEntitiesList());

  final UserServiceImpl userService = new UserServiceImpl(users);

  @Test
  public void shouldSaveUser() {
    final UserEntity user = new UserEntity(1, "chicharito", "hernandez", "", 32, "First road #52", "54859756", INACTIVE, IN_OFFICE, ASSIGNED_TO_PROJECT);
    final int previousSize = users.size();

    userService.save(user);
    final int afterInsertSize = users.size();

    assertTrue(afterInsertSize == previousSize + 1);
    assertTrue(users.contains(user));
  }

  @Test
  public void shouldSaveAllUsers() {

    final UserEntity user1 = new UserEntity(1, "edgar", "macias", "", 22, "Second road #52", "54859756", INACTIVE, IN_OFFICE, ASSIGNED_TO_PROJECT);
    final UserEntity user2 = new UserEntity(1, "joel", "huiqui", "", 45, "Second road #53", "54855659", INACTIVE, IN_OFFICE, ASSIGNED_TO_PROJECT);
    final UserEntity user3 = new UserEntity(1, "paco", "palencia", "", 52, "Second road #54", "65988554", INACTIVE, IN_OFFICE, ASSIGNED_TO_PROJECT);

    final int previousSize = users.size();

    userService.saveAll(List.of(user1, user2, user3));
    final int afterInsertSize = users.size();

    assertTrue(afterInsertSize == previousSize + 3);
    assertTrue(users.contains(user1));
    assertTrue(users.contains(user2));
    assertTrue(users.contains(user3));

  }

  @Test
  public void shouldFindAllUsers() {
    final List<UserEntity> users = userService.findAll();

    assertTrue(users.size() > 0);
  }

  @Test
  public void shouldFindAllFilteredUsers() {
    final Predicate<UserEntity> filter = userEntity -> userEntity.getAge() < 40;
    final List<UserEntity> filteredUsers = userService.findAllFiltered(filter);

    assertTrue(filteredUsers.stream().anyMatch(filter));
  }
}
