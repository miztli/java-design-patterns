package utils;

import com.examples.java.utils.Preconditions;
import org.junit.Test;

import java.util.Collections;

public class PreconditionsTest {

  @Test(expected = IllegalArgumentException.class)
  public void whenGivenNumberIsLessOrEqualsThan0_then_ExpectException() {
    Preconditions.isBiggerThanCero(0, "number");
  }

  @Test(expected = IllegalArgumentException.class)
  public void whenGivenStringIsNull_then_ExpectException() {
    Preconditions.isBlank(null, "string");
  }

  @Test(expected = IllegalArgumentException.class)
  public void whenGivenStringEmpty_then_ExpectException() {
    Preconditions.isBlank("", "string");
  }

  @Test(expected = IllegalArgumentException.class)
  public void whenGivenParamIsNull_then_ExpectException() {
    Preconditions.isNotNull(null, "object");
  }

  @Test(expected = IllegalArgumentException.class)
  public void whenGivenListIsNull_then_ExpectException() {
    Preconditions.isNotEmpty(null, "list");
  }

  @Test(expected = IllegalArgumentException.class)
  public void whenGivenListIsEmpty_then_ExpectException() {
    Preconditions.isNotEmpty(Collections.emptyList(), "list");
  }
}
