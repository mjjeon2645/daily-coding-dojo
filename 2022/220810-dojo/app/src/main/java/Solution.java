public class Solution {
  public long solution(int price, int money, int count) {
    long answer = 0;
    long accumulator = 0;

    for (int i = 1; i <= count; i += 1) {
     accumulator += (long) price * i;
    }

    if (money - accumulator < 0) {
      answer = -1 * (money - accumulator);
      return answer;
    }

    return answer;
  }
}
