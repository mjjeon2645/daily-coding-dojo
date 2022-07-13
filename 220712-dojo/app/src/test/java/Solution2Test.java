import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution2Test {
  @Test
  void simple() {
    Solution2 solution2 = new Solution2();

    assertEquals(10, solution2.solution(3, 20, 4));
  }

  @Test
  void enough() {
    Solution2 solution2 = new Solution2();

    assertEquals(0, solution2.solution(3, 500, 1));
  }
}