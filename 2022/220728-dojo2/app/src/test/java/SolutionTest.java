import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
  @Test
  void sample1() {
    Solution solution = new Solution();

    assertEquals(5, solution.solution(5, new int[]{2, 4}, new int[]{1, 3, 5}));
  }

  @Test
  void sample2() {
    Solution solution = new Solution();

    assertEquals(4, solution.solution(5, new int[]{2, 4}, new int[]{3}));
  }

  @Test
  void sample3() {
    Solution solution = new Solution();

    assertEquals(2, solution.solution(3, new int[]{3}, new int[]{1}));
  }
}
