import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
  @Test
  void sample() {
    Solution solution = new Solution();

    assertArrayEquals(new int[]{5, 6, 3},
        solution.solution(new int[]{1, 5, 2, 6, 3, 7 ,4},
            new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}}));
  }

  @Test
  void calculateSize() {
    Solution solution = new Solution();

    int[][] array = new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}, {5, 0, 2}};

    assertEquals(array.length, 4);
    assertEquals(array[1].length, 3);
    assertEquals(array[2][2], 3);
    assertEquals(array[0][1], 5);
    assertEquals(array[2][1], 7);
    assertEquals(array[3][1], 0);
  }
}
