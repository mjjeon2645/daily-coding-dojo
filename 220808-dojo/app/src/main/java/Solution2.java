import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution2 {
  public int[] solution(int[] arr, int divisor) {
    int[] answer = {};

    List<Integer> numbers = new ArrayList<>();

    for (int i = 0; i < arr.length; i += 1) {
      if (arr[i] % divisor == 0) {
        numbers.add(arr[i]);
      }
    }

    if (numbers.size() == 0) {
      return new int[]{-1};
    }

    Integer[] newArrays = numbers.stream().toArray(Integer[]::new);

    answer = Arrays.stream(newArrays).mapToInt(i -> i).toArray();

    Arrays.sort(answer);

    return answer;
  }
}
