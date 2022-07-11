import java.util.Arrays;

public class Solution {
  private final String STANDARDWORDS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

  public String solution(String s) {
    String answer = "";

    answer = process(s);

    return answer;
  }

  public String process(String words) {
    int[] indexArray = new int[words.length()];
    String answer = "";

    if (words.length() == 1) {
      return words;
    }

    for (int i = 0; i < words.length(); i += 1) {
      indexArray[i] = STANDARDWORDS.indexOf(words.charAt(i));
    }

    int[] newArray = Arrays.sort(indexArray);

    return words;
  }
}
