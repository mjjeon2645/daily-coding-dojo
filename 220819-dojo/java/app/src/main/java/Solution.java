import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution {
  public String solution(String s, int n) {
    String answer = "";
    String alphabetCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz"; // 0~25, 26~51
//    String lowerCase = "abcdefghijklmnopqrstuvwxyz";

    String[] words = s.split("");

    for (int i = 0; i < words.length; i += 1) {
      if (words[i].equals(" ")) {
        continue;
      }

      int index = alphabetCase.indexOf(words[i]);

      if (index >= 0 && index <= 25) {
        words[i] = alphabetCase.charAt((index + n) % 25) + "";
      }

      if (index >= 26 && index <= 51) {
        if (index + n <= 51) {
          words[i] = alphabetCase.charAt(index + n)+ "";
        }

        words[i] = alphabetCase.charAt(index + n - 26) + "";
      }
    }

    answer = Arrays.stream(words).collect(Collectors.joining(""));

    return answer;
  }
}
