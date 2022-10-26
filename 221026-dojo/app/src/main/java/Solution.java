class Solution {
  public int solution(int n) {
    int answer = 0;

    for (int i = 1; i <= n; i += 1) {
      int accumulator = 0;

      for (int j = i; j <= n; j += 1) {
        accumulator += j;

        if (accumulator == n) {
          answer += 1;
          break;
        }

        if (accumulator > n) {
          break;
        }
      }
    }
    return answer;
  }
}
