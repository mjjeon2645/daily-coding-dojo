// 아는 것
// board는 정사각형 격자무늬(2차원 배열)
// moves는 크레인이 움직이는 column(인덱스는 moves 요소에서 1을 빼준값이 되겠다)
// 격자무늬 자리에서 인형을 빼면 그 자리는 0으로 채워짐
// 인형을 쌓아둘 때 두개의 인형이 같으면 터짐. 터진 인형수만큼 answer는 증가
// 인형을 터뜨려줘야 마지막 남은 인형이랑 또다른 갖다놓는 인형이랑 같은지 아닌지를 비교할 수 있음
// 즉 다 옮기고 난다음에 한번에 터뜨릴 생각은 하면 안됨.
// 그럼 순서. moves 원소에 따라 그 column을 탐색한다->0인지 아닌지 구분한다->0이 아닌순간 걔는 집는다
// -> 그 자리는 0으로 채운다 -> 인형을 쌓는다 -> 가장 최근에 쌓인 인형과 갖다놓는 인형을 비교한다
// -> 같지 않을경우 그대로 둔다 / 같을 경우 터뜨린다.
// pickTheDoll 메소드의 역할 -> (1) 탐색해서, (2) 인형이 있으면 집고, (3) 그 자리를 0으로 변환시킨다
// 탐색과 0으로 변환하는 것은 기능이므로 void, 집은 인형을 알려주는 것은 return 이 필요 => 리턴값을 int로?
// 리턴이 '집은 인형'이라는 부분에만 집중하자. 자꾸 뛰어넘어서 그 다음 스텝으로 가려하지 말고.
// 딱 하나의 인형을 가져오는 기능을 만들었음. column도 특정하긴 했지만...
// 그럼 그 인형을 쌓아두어야 할까? 쌓는다면 어디에..?
// 지난번엔 거의 무한한 배열에다가 쌓아줬는데, 이번에는 동적인 list 활용..?

import java.util.ArrayList;
import java.util.List;

public class Solution {
  private List<Integer> baskets;

  public Solution(List<Integer> baskets) {
    this.baskets = new ArrayList<>();
  }

  public int solution(int[][] board, int[] moves) {
    int answer = 0;

    int column = moves[0] - 1;
    int dollNumber = pickTheDoll(board, column);

    // 0으로 반환되는 값은 제외처리
    if (dollNumber != 0) {
      validator(dollNumber, answer);
    }
    return answer;
  }

  public void validator(int dollNumber, int answer) {
   // 경우의 수. list에 아무 값도 없다면? 비교고 나발이고 그냥 쌓아야 함
    // 근데 list가 비어있는데 만약 인덱스 0값과 비교한다고 하면 익셉션일까? 아님 그냥 널이랑 비교할까?
    // 익셉션이 뜨면 문제인데, 널이면 사실 여기서 예외처리를 해주면 되니까 문제가 없는데...

   if (baskets.get((baskets.size() - 1)) != dollNumber) {
     baskets.add(dollNumber);
   }

   // list에 있다면? 비교

  }

  public int pickTheDoll(int[][] board, int column) {
    int dollNumber = 0;

    for (int i = 0; i < board.length; i += 1) {
      if (board[i][column] != 0) {
        dollNumber = board[i][column];
        board[i][column] = 0;
        break;
      }
    }
    return dollNumber;
  }
}
