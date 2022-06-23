import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumTest {
  @Test
  void simpleTest() {
    Sum sum = new Sum();

    assertEquals(1, sum.solution(1));
  }

  @Test
  void exampleNumber() {
    Sum sum = new Sum();

    assertEquals(6, sum.solution(123));
  }

  @Test
  void exampleNumber2() {
    Sum sum = new Sum();

    assertEquals(24, sum.solution(987));
  }

}