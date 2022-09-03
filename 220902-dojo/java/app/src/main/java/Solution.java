// 게임화면은 1*1 칸들로 이루어진 n x n 정사각 격자. 위쪽에는 크레인, 오른쪽에는 바구니
// 모든 인형은 1 x 1 크기 격자 한 칸 차지. 격자의 가장 아래칸부터 차곡 차곡 ㅏㅆㅎ여있음
// 크레인을 좌우로 움직여ㅓㅅ 멈춘 위치 가장 위에있는 인형을 집어올릴 수 있음
// 집어올린 인형은 바구니에 쌓임. 아래칸부터 순서대로.
// 만약 같은모양 인형 2개가 연속으로 쌓일 경우 두 인형 터짐.
// 인형이 안집히는 경우는 없음. 다만 아무것도 없는 곳에선 집히는 게 없음

public class Solution {
  public int solution(int[][] board, int[] moves) {

    int answer = 0;

    int[] basket = new int[999];
    int basketIndex = 1;

    for (int i = 0; i < moves.length; i += 1) {
      int column = moves[i] - 1;
      System.out.println("집게를 움직입니다~: " + column);

      for (int j = 0; j < board.length; j += 1) {
        if (board[j][column] == 0) {
          System.out.println("탐색합니다~: " + board[j][column]);
          continue;
        }

        if (board[j][column] != 0) {
          System.out.println("0이 아니다!!: " + board[j][column]);

          basket[basketIndex] = board[j][column];
          System.out.println("인형을 배스킷에 넣습니다~: " + basket[basketIndex]);

          basketIndex += 1;
          System.out.println("바뀐 basketIndex(즉 직전건 -1): " + basketIndex);

          board[j][column] = 0;
          System.out.println("인형 빠진 자리는 0으로 만듭니다~: " + board[j][column]);

          // 배스킷에 인형 2개가 같은게 만났는지 검증
          if (basket[basketIndex - 1] == basket[basketIndex - 2]) {
            System.out.println("위에 인형이랑: " + basket[basketIndex - 1]);
            System.out.println("아래인형이 같나요?: " + basket[basketIndex - 2]);

            basket[basketIndex - 1] = 0;
            System.out.println("basket[basketIndex - 1]: " + basket[basketIndex - 1]);

            basket[basketIndex - 2] = 0;
            System.out.println("basket[basketIndex - 2]: " + basket[basketIndex - 2]);

            basketIndex -= 2;
            System.out.println("basketIndex: " + basketIndex);

            answer += 2;
            System.out.println("answer: " + answer);

            break;
          }
          break;
        }
      }
    }
    System.out.println("최종 answer: " + answer);
    return answer;
  }
}
