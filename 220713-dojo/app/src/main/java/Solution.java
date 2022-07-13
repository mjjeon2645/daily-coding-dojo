import java.util.Arrays;

public class Solution {
  public int solution(int[] d, int budget) {
    int amount = 0;
    int answer = 0;

    Arrays.sort(d);

    for (int i = 0; i < d.length; i += 1) {
      amount += d[i];

      if (amount > budget) {
        answer = i;
        break;
      }
    }

    if (amount <= budget) {
      answer = d.length;
    }
    return answer;
  }
}
