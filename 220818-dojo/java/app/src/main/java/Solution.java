public class Solution {
  public String solution(String s) {
    String answer = "";

    String[] words = s.split("");

    int index = 0;

    for (int i = 0; i < words.length; i += 1) {
      if (words[i].equals(" ")) {
        index = 0;
        continue;
      }

      if (index % 2 == 0) {
        words[i] = words[i].toUpperCase();
      }

      if (index % 2 != 0) {
        words[i] = words[i].toLowerCase();
      }

      index += 1;
    }

    answer = String.join("", words);
    return answer;
  }
}
