import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
  @Test
    void sample1() {
    Solution solution = new Solution();

    assertEquals(5, solution.solution(5, new int[]{2, 4}, new int[]{1, 3, 5}));
  }
}
