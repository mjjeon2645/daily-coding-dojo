import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
  @Test
  void sampleTrueTest1() {
    Solution solution = new Solution();

    assertTrue(solution.solution(10));
  }

  @Test
  void sampleFalseTest1() {
    Solution solution = new Solution();

    assertFalse(solution.solution(11));
  }

}