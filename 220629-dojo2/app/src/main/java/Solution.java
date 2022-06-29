public class Solution {
  public int solution(int n) {
    int answer = 0;
    int base = 1;

    while (base <= n ) {
      if (n % base == 0) {
        answer += base;
      }

      base += 1;
    }

    return answer;
  }
}
