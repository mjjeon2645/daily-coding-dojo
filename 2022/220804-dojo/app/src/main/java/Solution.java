import java.util.Arrays;

public class Solution {
  public int solution(int[] d, int budget) {
    int answer = 0;
    int sum = 0;

    Arrays.sort(d);

    for (int i = 0; i < d.length; i += 1) {
      sum += d[i];

      if (sum > budget) {
        answer = i;
        break;
      }

      if (sum <= budget) {
        answer = d.length;
      }
    }
    return answer;
  }
}
