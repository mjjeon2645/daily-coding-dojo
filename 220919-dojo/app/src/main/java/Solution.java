class Solution {
  public int solution(int n) {
    int answer = 0;

    int[][] matrix = new int[n][n];

    int result = process(matrix, n);

    return answer;
  }

  public int process(int[][] matrix, int n) {
    if (n == 1) {
      return 1;
    }

    // n이 2일 때를 천천히 쪼개보자. n[0][0]에 퀸을 놓자. 퀸을 1이라 치면.
    matrix[0][0] = 1;

    // 그리고나서 불가능한 자리를 for문을 둘리면서 다 0이나 -1로 메꿔버리면?(마치 까만색칠해놓듯이)
    // 우선 퀸의 좌, 우 색칠 필요(색칠할 필요 있나? 어차피 못오는 자린데. 아랫줄부터 가면 되는거 아냐?
    // 미리 칠해놓지 말고 그냥 하면서 칠하는 것도 방법...
    for (int i = 0; i < n; i += 1) {
      for (int j = 0; j < n; j += 1) {
        if (i == 0) {
          matrix[i][j] = 1;
          break;
        }
      }
    }




  return 0;
  }
}
