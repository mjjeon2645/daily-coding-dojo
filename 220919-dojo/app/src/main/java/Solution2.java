// 아... 2차원 배열로 당연히 풀어야 할거라 생각했는데.
// 아래와 같은 이ㅏ유로 1차원으로도 해결이 가능하다는 걸 알았다. => 사실 어렴풋이 짐작은 했었을지도.
// 가로세로 길이가 같고, 어차피 하나의 퀸을 놓으면 그 행에는 앞으로 아무도 못 옴

// 추가로 새롭게 안 점은 대각선을 구하는 방법이다. 나는 2차원 행렬에서 컬럼을 1 빼거나 1 더하거나의 값을 비교하려 했는데
// 아래처럼 아주 일반화된 식으로 대각선에 있는 넘의 위치를 알 수 있음
// |기존 퀸의 컬럼 - 새롭게 올 퀸의 컬럼| == |기존 퀸의 로우 - 새롭게 올 퀸의 로우|
// 위 공식을 몰랐다는건...? 대각선 위치의 포지션을 한 6개만 써봐도 좀 각이 나왔을텐데!!

import java.util.*;

class Solution2 {
  public int solution(int n) {
    int answer = 0;

    // 첫번째 가로열에 오는 퀸은 선택지가 n개이다. (이건 알고 있던 사실임)
    for (int i = 0; i < n; i += 1) {
      int[] board = new int[n];
      Arrays.fill(board, -1);      // => 내가a 생각했던 까만색으로 색칠하는 것

      board[0] = i;
      answer += checkAvailable(board, n, 1);
    }
    return answer;
  }

  public int checkAvailable(int[] board, int n, int row) {
    if (row == n) {
      return 1;
    }

    int count = 0;
    // 컬럼
    for (int i = 0; i < n; i += 1) {
      boolean put = true;

      // row(큰 의미 있나..?)
      for (int j = 0; j < row; j += 1) {
        if (i == board[j] || row - j == Math.abs(i - board[j])) {
          put = false;
          break;
        }
      }
      if (put) {
        board[row] = i;
        count += checkAvailable(board, n, row + 1);
      }
    }
    return count;
  }
}
