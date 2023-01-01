public class Solution {
  public int[] solution(int n, int m) {
    int[] answer = new int[2];

    if (m % n == 0) {
      answer[0] = n;
      answer[1] = m;
    }

    if (m % n != 0) {
      for (int i = 1; i <= m; i++) {
        if (n % i == 0 && m % i == 0) {
          answer[0] = i;
        }
      }
      answer[1] = n * m / answer[0];
    }
    return answer;
  }
}
