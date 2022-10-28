import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
  @Test
  void solution() {
    Solution solution = new Solution();

    assertEquals(83, solution.solution(78));
    assertEquals(23, solution.solution(15));
  }

  @Test
  void countOne() {
    Solution solution = new Solution();

    assertEquals(4, solution.countOne(78));
    assertEquals(4, solution.countOne(83));
  }
}
