package structural.object.facade;

import com.examples.java.structural.object.facade.AttendanceService;
import com.examples.java.structural.object.facade.AttendanceServiceImpl;
import com.examples.java.structural.object.facade.UserEntity;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static com.examples.java.structural.object.facade.App.initializeDefaultUserEntitiesList;
import static org.junit.Assert.assertTrue;

public class AttendanceServiceImplTest
{

  private final AttendanceService attendanceService = new AttendanceServiceImpl();

  @Test(expected = IllegalArgumentException.class)
  public void whenProvidingNullList_then_ExpectException() {
    attendanceService.getInOfficeUsers(null);
  }

  @Test()
  public void givenAUsersList_thenValidate_filteredUsersList() {
    final List<UserEntity> users = attendanceService.getInOfficeUsers(initializeDefaultUserEntitiesList());

    assertTrue(users.stream().allMatch(UserEntity::isInOffice));
  }
}
