import java.util.Arrays;

public class Solution {
  public int[] solution(int[] arr, int divisor) {
    int[] answer = {};

    Arrays.sort(arr);

    answer = Arrays.stream(arr)
        .filter(i -> i % divisor == 0)
        .toArray();

    if (answer.length == 0) {
      answer = new int[]{-1};
    }

    return answer;
  }
}
