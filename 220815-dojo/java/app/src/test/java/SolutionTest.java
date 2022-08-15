import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
  @Test
  void simpleNumber() {
    Solution solution = new Solution();

    assertArrayEquals(new int[]{1}, solution.solution(1));
  }

  @Test
  void simpleNumber2() {
    Solution solution = new Solution();

    assertArrayEquals(new int[]{2, 1}, solution.solution(12));
  }

  @Test
  void sample() {
    Solution solution = new Solution();

    assertArrayEquals(new int[]{5, 4, 3, 2, 1}, solution.solution(12345));
  }
}
