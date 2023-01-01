import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Solution2Test {
  @Test
  void sample1() {
    Solution2 solution2 = new Solution2();

    assertArrayEquals(new int[]{5, 10},
        solution2.solution(new int[]{5, 9, 7, 10}, 5));
  }

  @Test
  void sample2() {
    Solution2 solution2 = new Solution2();

    assertArrayEquals(new int[]{1, 2, 3, 36},
        solution2.solution(new int[]{2, 36, 1, 3}, 1));
  }

  @Test
  void sample3() {
    Solution2 solution2 = new Solution2();

    assertArrayEquals(new int[]{-1},
        solution2.solution(new int[]{3, 2, 6}, 10));
  }

}
