import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
  @Test
  void sample1() {
    Solution solution = new Solution();

    int[][] sizes =
        new int[][]{{60, 50}, {30, 70}, {60, 30}, {80, 40}};

    assertEquals(4000, solution.solution(sizes));
  }

  @Test
  void sample2() {
    Solution solution = new Solution();

    int[][] sizes =
        new int[][]{{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}};

    assertEquals(120, solution.solution(sizes));
  }

  @Test
  void array() {
    Solution solution = new Solution();

    int[][] sizes =
        new int[][]{{60, 50}, {30, 70}, {60, 30}, {80, 40}};

    assertEquals(60, sizes[0][0]);
    assertEquals(50, sizes[0][1]);
    assertEquals(70, sizes[1][1]);
    assertEquals(4, sizes.length);
  }
}
