import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
  @Test
  void maxAndMin() {
    Solution solution = new Solution();

    assertEquals(solution.max("1 2 3 4"), 4);
    assertEquals(solution.max("-1 -2 -3 -4"), -1);
    assertEquals(solution.min("1 2 3 4"), 1);
    assertEquals(solution.min("-1 -2 -3 -4"), -4);
  }

  @Test
  void split() {
    Solution solution = new Solution();

    String numbers = "1 2 3 4";
    assertArrayEquals(solution.split(numbers), new String[]{"1", "2", "3", "4"});
  }

  @Test
  void answer() {
    Solution solution = new Solution();

    assertEquals(solution.solution("1 2 3 4"), "1 4");
    assertEquals(solution.solution("-1 -2 -3 -4"), "-4 -1");
    assertEquals(solution.solution("-1 -1"), "-1 -1");
  }
}
