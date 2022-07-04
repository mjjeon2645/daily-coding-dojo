public class Solution {
  public boolean solution(int x) {
    boolean answer = true;

    int accumulator = 0;
    String number = Integer.toString(x);
    String[] numbers = number.split("");

    for (int i = 0; i < numbers.length; i += 1) {
      accumulator += Integer.valueOf(numbers[i]);
    }

    if (x % accumulator != 0) {
      answer = false;
    }

    return answer;
  }
}
