import java.util.ArrayList;
import java.util.List;

public class Solution {
  public int[] solution(int []arr) {
    List<Integer> numbers = new ArrayList<>();

    numbers.add(arr[0]);

    for (int i = 1; i < arr.length; i += 1) {
      if(arr[i - 1] == arr[i]) {
        continue;
      }
      numbers.add(arr[i]);
    }

    int[] answer = new int[numbers.size()];

    for (int i = 0; i < numbers.size(); i += 1) {
      answer[i] = numbers.get(i);
    }

    return answer;
  }
}
