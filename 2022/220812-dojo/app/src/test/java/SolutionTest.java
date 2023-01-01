import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
  @Test
  void sample1() {
    Solution solution = new Solution();

    assertArrayEquals(new String[]{"#####","# # #", "### #", "# ##", "#####"},
        solution.solution(5, new int[]{9, 20, 28, 18, 11},
            new int[]{30, 1, 21, 17, 28}));
  }

  @Test
  void sample2() {
    Solution solution = new Solution();

    assertArrayEquals(new String[]{"######", "### #", "## ##", " #### ", " #####", "### # "},
        solution.solution(6, new int[]{46, 33, 33, 22, 31, 50},
            new int[]{27, 56, 19, 14, 14, 10}));
  }
}
