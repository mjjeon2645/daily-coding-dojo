import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
  @Test
  void sampleTest1() {
    Solution solution = new Solution();

    assertEquals(9, solution.solution(new int[]{4, 7, 12}, new boolean[]{true, false, true}));
  }

  @Test
  void sampleTest2() {
    Solution solution = new Solution();

    assertEquals(0, solution.solution(new int[]{1, 2, 3}, new boolean[]{false, false, true}));
  }
}
