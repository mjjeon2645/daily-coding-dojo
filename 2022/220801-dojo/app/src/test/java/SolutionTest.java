import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
  @Test
  void sample1() {
    Solution solution = new Solution();

    assertArrayEquals(new int[]{1}, solution.solution(new int[]{1, 2, 3, 4, 5}));
  }

  @Test
  void sample2() {
    Solution solution = new Solution();

    assertArrayEquals(new int[]{1, 2, 3}, solution.solution(new int[]{1, 3, 2, 4, 2}));
  }
}
