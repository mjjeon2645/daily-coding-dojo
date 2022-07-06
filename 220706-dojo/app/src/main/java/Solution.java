public class Solution {
  public long solution(long n) {
    long answer = 4;
    long i = 1;

    while (i < n) {
      if (n == i * i) {
        answer = (i + 1) * (i + 1);
        break;
      }

      if (n < i * i) {
        break;
      }

      answer = -1;
      i += 1;
    }

    return answer;
  }
}
