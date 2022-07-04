public class Solution {
  public boolean solution(int x) {
    boolean answer = true;

    int accumulator = 0;

    for (int i = 0; i < (int)(Math.log10(x) + 1); i += 1) {
      int devidend = x;
    int number = devidend / Math.pow(10, (int)(Math.log10(x) + 1) - (i + 1));
      accumulator += number;
      devidend -= Math.pot(10, (int)(Math.log10(x) + 1) - (i + 1));
    }

    if (x % accumulator != 0) {
      answer = false;
    }

    return answer;
  }
}
