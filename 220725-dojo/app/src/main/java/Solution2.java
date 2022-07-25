import java.util.Arrays;

public class Solution2 {
  public int solution(int[] numbers) {
    int answer = 0;

    answer = 45 - Arrays.stream(numbers).sum();

    return answer;
  }
}
