public class Solution {
  public boolean solution(int x) {
    boolean answer = true;

    String number = Integer.toString(x);
    int accumulator = 0;

    for (int i = 0; i < number.length(); i += 1) {
      accumulator += Character.getNumericValue(number.charAt(i));
    }

    if (x % accumulator != 0) {
      answer = false;
    }

    return answer;
  }
}
