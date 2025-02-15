package test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestExampleTest {

  @Test
  public void testExampleMethod() {
    int expected = 5;
    int actual = 2 + 3;
    assertEquals(expected, actual, "The sum should be 5");
  }
}
