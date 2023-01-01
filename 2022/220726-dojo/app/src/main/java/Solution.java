import java.util.Arrays;

public class Solution {
  public String solution(String[] participant, String[] completion) {
    String answer = "";

    Arrays.sort(participant);
    Arrays.sort(completion);

    for (int i = 0; i < completion.length; i += 1) {
      if (!participant[i].equals(completion[i])) {
        answer = participant[i];
        break;
      }
      answer = participant[i + 1];
    }
    return answer;
  }
}
