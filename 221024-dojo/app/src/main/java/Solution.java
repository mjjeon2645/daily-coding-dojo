import java.util.*;
import java.util.stream.*;

class Solution {
  public int[] solution(String s) {
    int[] answer = {};
    int countRemovedZero = 0;
    int countConverting = 0;

    String inputString = s;

    while(true) {
      String numberBeforeConverted = removeZero(inputString);

      countRemovedZero += countZero(inputString, numberBeforeConverted);

      String binaryNumber = toBinary(numberBeforeConverted);
      countConverting += 1;

      if (binaryNumber.equals("1")) {
        answer = new int[]{countConverting, countRemovedZero};
        break;
      }

      inputString = binaryNumber;
    }

    return answer;
  }

  public String removeZero(String s) {
    String[] words = s.split("");

    String convertedWord = Arrays.stream(words).filter(value -> value.equals("1")).collect(Collectors.joining());

    return convertedWord;
  }

  public int countZero(String s, String numberBeforeConverted) {
    return s.length() - numberBeforeConverted.length();
  }

  public String toBinary(String numberBeforeConverted) {
    int length = numberBeforeConverted.length();
    return Integer.toBinaryString(length);
  }
}
