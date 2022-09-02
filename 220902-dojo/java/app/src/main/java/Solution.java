// 게임화면은 1*1 칸들로 이루어진 n x n 정사각 격자. 위쪽에는 크레인, 오른쪽에는 바구니
// 모든 인형은 1 x 1 크기 격자 한 칸 차지. 격자의 가장 아래칸부터 차곡 차곡 ㅏㅆㅎ여있음
// 크레인을 좌우로 움직여ㅓㅅ 멈춘 위치 가장 위에있는 인형을 집어올릴 수 있음
// 집어올린 인형은 바구니에 쌓임. 아래칸부터 순서대로.
// 만약 같은모양 인형 2개가 연속으로 쌓일 경우 두 인형 터짐.
// 인형이 안집히는 경우는 없음. 다만 아무것도 없는 곳에선 집히는 게 없음

public class Solution {
  public int solution(int[][] board, int[] moves) {
    int answer = 0;
    return answer;
  }

  public int move(int[][] board, int[] moves) {
    int index = 0;
    int movesIndex = 0;

    for (int i = 0; i < board.length; i += 1) {
      if (board[i][0] == 0) {
        continue;
      }

      if (board[i][0] != 0) {
        moves[movesIndex] = board[i][0];
        break;
      }
    }


    return 0;
  }
}
