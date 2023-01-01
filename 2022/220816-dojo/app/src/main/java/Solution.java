public class Solution {
  public int solution(int n) {
    int answer = 0;

    for (int i = 0; n > 0; i += 1) {
      int addNumber = n % 10;

      answer += addNumber;

      n = (n - addNumber) / 10;
    }

    return answer;
  }
}
