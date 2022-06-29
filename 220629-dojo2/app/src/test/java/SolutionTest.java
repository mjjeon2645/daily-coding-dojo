import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
  @Test
  void creation() {
    Solution solution = new Solution();

    assertEquals(28, solution.solution(12));
  }

  @Test
  void sampleTest() {
    Solution solution = new Solution();

    assertEquals(6, solution.solution(5));
  }
}
