import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution2Test {
  @Test
  void checkAvailable1() {
  Solution2 solution2 = new Solution2();

  int[] board = new int[]{4, -1, -1, -1};
  int n = 4;

  assertEquals(solution2.checkAvailable(board, n, 1), 2);
  }

  @Test
  void checkAvailable2() {
    Solution2 solution2 = new Solution2();

    int[] board = new int[]{1};
    int n = 1;

    assertEquals(solution2.checkAvailable(board, n, 1), 1);
  }
}