import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution {
  public String solution(String s, int n) {
    String answer = "";
    String alphabetCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz"; // 0~25, 26~51

    String[] words = s.split("");

    for (int i = 0; i < words.length; i += 1) {
      if (words[i].equals(" ")) {
        continue;
      }

      int index = alphabetCase.indexOf(words[i]);

      if (index >= 0 && index <= 25) {
        words[i] = index + n <= 25
            ? alphabetCase.charAt(index + n) + ""
            : alphabetCase.charAt(index + n - 26) + "";
      }

      if (index >= 26) {
        words[i] = index + n <= 51
            ? alphabetCase.charAt(index + n) + ""
            : alphabetCase.charAt(index + n - 26) + "";
      }
    }

    answer = Arrays.stream(words).collect(Collectors.joining(""));

    return answer;
  }
}
