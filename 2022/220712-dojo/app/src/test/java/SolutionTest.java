import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
  @Test
  void simple() {
    Solution solution = new Solution();

    assertEquals(10, solution.solution(3, 20, 4));
  }

  @Test
  void enough() {
    Solution solution = new Solution();

    assertEquals(0, solution.solution(3, 500, 1));
  }
}
