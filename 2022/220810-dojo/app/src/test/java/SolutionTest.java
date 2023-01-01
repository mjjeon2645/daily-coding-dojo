import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
  @Test
  void sample() {
    Solution solution = new Solution();

    assertEquals(10, solution.solution(3, 20, 4));
  }
}
