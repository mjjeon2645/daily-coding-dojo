import java.util.*;

class Solution {
  public int solution(int[][] board, int[] moves) {
    int answer = 0;
    // moaves를 column으로 정해서 인형 pick하기
    int column = moves[0] - 1;
    Stack<Integer> basket = new Stack<>();

    int doll = pickTheDoll(board, column);

    // 우선 스택을 만들고!
    // doll이 0이 아닌경우에 한해 => 이거 복잡하면 잠깐 생각지 말고 넘어가자.
    // (1) basket에 아무것도 없다면 그냥 집어넣기
    // (2) basket에 무언가 있는데 마지막 요소와 동일하지 않으면 그냥 집어넣기
    // (3) basket에 무언가 있는데 마지막 요소와 동일하다면
    //    = basket 마지막 요소 없애기
    //    = answer은 2 증가시키기

    if (!basket.empty()) {
      if (basket.peek() == doll) {
        basket.pop();
        answer += 2;
      }

      if (basket.peek() != doll) {
        basket.push(doll);
      }
    }

    if (basket.empty()) {
      basket.push(doll);
    }

    return answer;
  }

  // 스택은 파라미터로 전달이 안되나...? ;; 밖에다 만들자 우선은.( 메소드 만들기 실패)
  //------

  public int pickTheDoll(int[][] board, int column) {
    int doll = 0;
    for (int i = 0; i < board.length; i += 1) {
      if (board[i][column] != 0) {
        doll = board[i][column];
        board[i][column] = 0;
        return doll;
      }
    }
    return doll;
  }
}
