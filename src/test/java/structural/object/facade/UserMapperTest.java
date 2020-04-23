package structural.object.facade;

import com.examples.java.structural.object.facade.UserDto;
import com.examples.java.structural.object.facade.UserEntity;
import com.examples.java.structural.object.facade.UserMapper;
import org.junit.Test;

import static com.examples.java.structural.object.facade.App.*;
import static org.junit.Assert.assertEquals;

public class UserMapperTest
{

  @Test(expected = IllegalArgumentException.class)
  public void shouldThrowExceptionIfUserISNull() {
    UserMapper.from(null);
  }

  @Test
  public void shouldContainAllEntityfields() {

    final long id = 3;
    final String name = "lionel";
    final String surname1 = "messi";
    final String surname2 = "";
    final String address = "Third road #53";
    final String phone = "5565233214";
    final int age = 33;

    final UserEntity entity = new UserEntity(id, name, surname1, surname2, age, address, phone, ACTIVE, IN_OFFICE, ASSIGNED_TO_PROJECT);
    final UserDto dto = UserMapper.from(entity);

    assertEquals(dto.getCompleteName(), String.format("%s %s %s", name, surname1, surname2));
    assertEquals(dto.getAge(), age);
    assertEquals(dto.getAddress(), address);
    assertEquals(dto.getPhone(), phone);
    assertEquals(dto.isActive(), ACTIVE);
    assertEquals(dto.isInOffice(), IN_OFFICE);
    assertEquals(dto.hasAssignedProject(), ASSIGNED_TO_PROJECT);

  }
}
