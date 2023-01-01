public class Solution {
  public int solution(int[][] sizes) {
    int answer = 0;

    int maxWidth = 0;
    int maxHeight = 0;

    for (int i = 0; i < sizes.length; i += 1) {
      int temp = 0;

      for (int j = 0; j < 2; j += 1) {
        // 가로보다 세로가 더 길면 두 값 서로 교환
        if (sizes[i][0] < sizes[i][1]) {
          temp = sizes[i][0];
          sizes[i][0] = sizes[i][1];
          sizes[i][1] = temp;
        }
      }

      // 가로 길이가 가장 긴 것
      if (maxWidth < sizes[i][0]) {
        maxWidth = sizes[i][0];
      }

      // 세로 길이가 가장 긴 것
      if (maxHeight < sizes[i][1]) {
        maxHeight = sizes[i][1];
      }

      answer = maxWidth * maxHeight;
    }

    return answer;
  }
}
