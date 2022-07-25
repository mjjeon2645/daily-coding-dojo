import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution2Test {
  @Test
  void sample1() {
    Solution2 solution2 = new Solution2();

    int[] numbers = new int[]{1, 2, 3, 4, 6, 7, 8 ,0};

    assertEquals(14, solution2.solution(numbers));
  }

  @Test
  void sample2() {
    Solution2 solution2 = new Solution2();

    assertEquals(6, solution2.solution(new int[]{5, 8, 4, 0, 6, 7, 9}));
  }
}
