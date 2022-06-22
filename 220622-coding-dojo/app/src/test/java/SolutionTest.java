import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
  @Test
  void creation() {
    Solution solution = new Solution();

    long[] answer = solution.solution(0, 1);

    assertArrayEquals(new long[]{0}, answer);
  }

  @Test
  void testWithSample() {
    Solution solution = new Solution();

    long[] answer = solution.solution(2, 5);

    assertArrayEquals(new long[]{2, 4, 6, 8, 10}, answer);
  }
}
