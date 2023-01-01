import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
  @Test
  void sample1() {
    Solution solution = new Solution();

    int[][] array1 = new int[][]{{1, 2}, {2, 3}};
    int[][] array2 = new int[][]{{3, 4}, {5, 6}};

    assertEquals(4, array1[0][0] + array2[0][0]);
    assertEquals(6, array1[0][1] + array2[0][1]);
    assertEquals(7, array1[1][0] + array2[1][0]);
    assertEquals(9, array1[1][1] + array2[1][1]);

//    assertArrayEquals(new int[][]{{4, 6}, {7, 9}}, solution.solution(array1, array2));
  }
}
