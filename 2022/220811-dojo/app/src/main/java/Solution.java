public class Solution {
  public int solution(int n) {
    int answer = 0;
    int i = 1;

    while(i <= n) {
      if (Math.floorMod(n, i) == 1) {
        answer = i;
        break;
      }
      i += 1;
    }
    return answer;
  }
}
