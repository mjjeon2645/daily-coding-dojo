public class Solution {
  public int solution(int n) {
    int answer = 0;
    int remainder = 0;

    for (int i = 1; i <= n; i += 1 ) {
      switch (n % i) {
        case 0 -> answer += i;
        default ->answer += 0;
      }
    }

    return answer;
  }
}
