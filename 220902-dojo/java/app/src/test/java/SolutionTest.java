import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
  @Test
  void sampleTest() {
    Solution solution = new Solution();

    int[][] board = new int[][]{{0,0,0,0,0}, {0,0,1,0,3}, {0,2,5,0,1}, {4,2,4,4,2}, {3,5,1,3,1}};
    int[] moves = new int[]{1, 5, 3, 5, 1, 2, 1, 4};

    assertEquals(4, solution.solution(board, moves));
  }

  @Test
  void moveOnce() {
    Solution solution = new Solution();

    int[][] board = new int[][]{{0,0,0,0,0}, {0,0,1,0,3}, {0,2,5,0,1}, {4,2,4,4,2}, {3,5,1,3,1}};
    int[] moves = new int[]{1, 5, 3, 5, 1, 2, 1, 4};

    int a = solution.move(board, moves);

    assertEquals(0, solution.move(board, moves));
  }
}
