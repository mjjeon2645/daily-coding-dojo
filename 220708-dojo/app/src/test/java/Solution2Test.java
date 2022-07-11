import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution2Test {
  @Test
  void creation() {
    Solution2 solution2 = new Solution2();

    int n = 5;
    int[] array1 = new int[]{9, 20, 28, 18, 11};
    int[] array2 = new int[]{30, 1, 21, 17, 28};

    assertArrayEquals(new String[]{"#####", "# # #", "### #", "#  ##", "#####"},
        solution2.solution(n, array1, array2));
  }
}
