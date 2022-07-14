import java.util.*;

public class Solution {
  public int[] solution(int []arr) {
    int[] answer = {};

    List<Integer> accumulator = new ArrayList<>();

    accumulator.add(arr[0]);

    for (int i = 1; i < arr.length; i += 1) {
      if (arr[i - 1] != (arr[i])) {
        accumulator.add(arr[i]);
      }
    }

    answer = new int[accumulator.size()];

    for (int i = 0; i < accumulator.size(); i += 1) {
      answer[i] = accumulator.get(i);
    }

    // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
    System.out.println("Hello Java");

    return answer;
  }
}
