import java.util.*;

class Solution {
  public String solution(String s) {
    String answer = "";

    int maxNumber = max(s);

    int minNumber = min(s);

    return Integer.toString(minNumber) + " " + Integer.toString(maxNumber);
  }

  public int max(String numbers) {
    String[] numbersArray = split(numbers);

    int[] convertedArray = Arrays.stream(numbersArray).mapToInt(Integer::parseInt).toArray();

    return Arrays.stream(convertedArray).max().getAsInt();
  }

  public int min(String numbers) {
    String[] numbersArray = split(numbers);

    int[] convertedArray = Arrays.stream(numbersArray).mapToInt(Integer::parseInt).toArray();

    return Arrays.stream(convertedArray).min().getAsInt();
  }

  public String[] split(String numbers) {
    return numbers.split(" ");
  }
}
