import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
  private Solution solution;
  private int[][] board;
  private int[] moves;

  @BeforeEach
  void initialize() {
    solution = new Solution();
    board =
        new int[][]{
            {0, 0, 0, 0, 0},
            {0, 0, 1, 0, 3},
            {0, 2, 5, 0, 1},
            {4, 2, 4, 4, 2},
            {3, 5, 1, 3, 1}
        };
    moves = new int[]{1, 5, 3, 5, 1, 2, 1, 4};
  }

  @Test
  void pickTheDoll() {
    Solution solution = new Solution();
    int column = moves[0] - 1;
    int doll = solution.pickTheDoll(board, column);

    assertEquals(doll, 4);
  }

  @Test
  void inputTheBasket() {
    // 스택을 해당 메서드의 인자로 가져가려고 했으나
    // Raw use of parameterized class 'Stack' 메시지 뜸.. 뭐지. 찾아볼 것
  }

  @Test
  void sampleTest() {
    int answer = solution.solution(board, moves);

    assertEquals(answer, 4);
  }
}
