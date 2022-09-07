import org.junit.jupiter.api.Test;

import java.util.Stack;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
  @Test
  void stackTest() {
    Solution solution = new Solution();

    int[][] board =
        new int[][]{
            {0, 0, 0, 0, 0},
            {0, 0, 1, 0, 3},
            {0, 2, 5, 0, 1},
            {4, 2, 4, 4, 2},
            {3, 5, 1, 3, 1}
        };

    int[] moves = new int[]{1, 5, 3, 5, 1, 2, 1, 4};

    Stack<Integer> stack = new Stack<>();

    // isEmpty랑 empty가 뭐가 달라..?
    assertTrue(stack.isEmpty());
    assertTrue(stack.empty());

    stack.push(moves[0]);
    stack.push(moves[1]);
    stack.push(moves[2]);

    assertFalse(stack.isEmpty());

    stack.pop();

    assertEquals(stack.size(), 2);

    // 아................. stack을 이용하면 인덱스 계산할 필요없이 그냥 겹치는 인형일때 pop만 해주면 되겠네
    // 그럼 스택의 마지막 원소가 뭔지는 무슨 메서드로 확인할 수 있는거지? last 뭐시기 이런거 있나?
    assertEquals(stack.lastElement(), 5);

    // ㅇ ㅏ........ ㅇㅋ.
  }

  @Test
  void sample() {
    Solution solution = new Solution();
    int[][] board =
        new int[][]{
            {0, 0, 0, 0, 0},
            {0, 0, 1, 0, 3},
            {0, 2, 5, 0, 1},
            {4, 2, 4, 4, 2},
            {3, 5, 1, 3, 1}
        };
    int[] moves = new int[]{1, 5, 3, 5, 1, 2, 1, 4};

    int answer = solution.solution(board, moves);

    assertEquals(answer, 4);
  }
}
