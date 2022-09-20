// 진님이 스택과 큐에 대해 이야기하셨는데... 흠......
// 오늘은 뽑은 인형을 스택에 넣어보는 실험을 해봐야겠다.

import java.util.Stack;

class Solution {
  public int solution(int[][] board, int[] moves) {
    int answer = 0;
    // moves에 따라 column을 설정하고 하나의 인형을 뽑아 -> 뽑은자리를 0으로 만들고 ->
    // 스택과 비교 -> 없으면 쌓고 -> 겹치면 없애고 -> answer 값 변경하고. 여기까지 해보자.
    // 딱 한가지 경우의 수만 생각할것. 다른 것 말고 딱 한가지.

    int column = moves[0] - 1;
    int pickedDoll = pick(board, column);

    Stack<Integer> stack = new Stack<>();

    // 만약에.....
    // 1. pickedDoll이 0이라면 바로 다시 저 pick 메소드를 돌려야하지 않나? => 이게 재귀함수인가?
    //    물론 column과 board는 바뀐 상태여야겠지.
    // 2. pickedDoll이 0이 아니라면 stack과 비교한 다음에 다시 또 pick을 돌려야 하고.
    // 돌고도네 돌아가네~ 어케하는거지.

    //TODO.  요 if문은 필요없는 것 같은데 잠깐 pickedDoll이 헷갈려서 잠시 내버려둠. 판단 후 삭제필요
    if (pickedDoll == 0) {
      column = moves[1] - 1;
      pickedDoll = pick(board, column);
    }

    // (1) 스택이 비어있으면 넣거나,
    // (2) 비어있지 않을 경우 비교한 다음
    // -> 넣거나,
    // -> 아님 원래 있던것 터뜨리고 answer 증가시키고.

    if (pickedDoll != 0) {
      if (stack.empty() ||
          stack.lastElement() != pickedDoll) {
        stack.push(pickedDoll);
        // 진짜 board의 [0][3] 값이 변해서 들어가나? 확인해보자. 정상이라면 0, 안바뀌었다면 4. 변한다!
        System.out.println(board[0][3]);
      }

      if (stack.lastElement() == pickedDoll) {
        answer += 2;
        stack.pop();
      }
    }

    return answer;
  }

  public int pick(int[][] board, int column) {
    int doll = 0;
    for (int i = 0; i < board.length; i += 1) {
      if (board[i][column] != 0) {
        doll = board[i][column];
        board[i][column] = 0;
        break;
      }
    }
    return doll;
  }
}