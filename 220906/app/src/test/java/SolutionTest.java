import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
  private int[][] board;
  private int[] moves;

  @BeforeEach
  void initialize() {
    board = new int[][]{{0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}};
    moves = new int[]{1, 5, 3, 5, 1, 2, 1, 4};
  }

  @Test
  void pickTheDoll() {
    // 최종적으로 사이클 1을 돌았을 때 이 메소드가 리턴해야 하는 값은 4. 첫번째 줄에 가장 위에 있는 인형이 4임.
    // 이 함수를 거치고 나서는 원래 인형이 있던 자리가 0이 되어야 함
    Solution solution = new Solution();

    int column = moves[0] - 1;
    int dollNumber = solution.pickTheDoll(board, column);

    assertEquals(dollNumber, 4);
    assertEquals(board[0][column], 0);
  }

  @Test
  void validator() {
    // 받아온 dollNumber를 원래 있던 list의 마지막 요소와 판별해서 같으면 없애주면서 answer 증가
    // 같지 않으면 그냥 list에 추가.
  }
}
