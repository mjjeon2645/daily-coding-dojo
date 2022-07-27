import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {
  public int[] solution(String[] id_list, String[] report, int k) {
    int[] answer = new int[id_list.length];

    String[] temps = Arrays.stream(report).distinct().toArray(String[]::new);

    List<String> names = new ArrayList<>();

    for (String value : temps) {
      String[] words = value.split(" ");
      names.add(words[1]);
    }

    int count = 0;

    for (int i = 0; i < id_list.length; i += 1) {
        count = Collections.frequency(names, id_list[i]);
        if (count >= k) {
          answer[i] = k;
        }

        if (count < k) {
          answer[i] = count;
        }
    }

    return answer;
  }
}
