import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
  @Test
  void sample1() {
    Solution solution = new Solution();

    assertEquals(14, solution.solution(new int[]{1, 2, 3, 4, 6, 7, 8 ,0}));
  }

  @Test
  void sample2() {
    Solution solution = new Solution();

    assertEquals(6, solution.solution(new int[]{5, 8, 4, 0, 6, 7, 9}));
  }
}
