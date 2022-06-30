import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
  @Test
  void creation() {
    Solution solution = new Solution();

    assertEquals(7, solution.solution(45));
  }

  @Test
  void sample() {
    Solution solution = new Solution();

    assertEquals(229, solution.solution(125));
  }

  @Test
  void sample2() {
    Solution solution = new Solution();

    assertEquals(1, solution.solution(1));
  }

}