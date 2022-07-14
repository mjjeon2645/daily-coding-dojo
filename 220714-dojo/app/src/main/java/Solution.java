import java.util.*;

public class Solution {
  public int[] solution(int []arr) {
    int[] answer = {};

    String accumulator = "";

    accumulator += arr[0];

    for (int i = 1; i < arr.length; i += 1) {
      if (arr[i - 1] != (arr[i])) {
        accumulator += arr[i];
      }
    }

    answer = new int[accumulator.length()];

    for (int i = 0; i < accumulator.length(); i += 1) {
      answer[i] = Character.getNumericValue(accumulator.charAt(i));
    }

    // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
    System.out.println("Hello Java");

    return answer;
  }
}
