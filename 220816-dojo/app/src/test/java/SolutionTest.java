import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class SolutionTest {
  @Test
  void sample() {
    Solution solution = new Solution();

    assertEquals(6, solution.solution(123));
  }

  @Test
  void sample2() {
    Solution solution = new Solution();

    assertEquals(24, solution.solution(987));
  }
}
