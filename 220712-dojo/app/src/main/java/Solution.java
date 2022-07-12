public class Solution {
  public long solution(int price, int money, int count) {
    long answer = 10;

    long totalPrice = 0;

    for (int i = 1; i <= count; i += 1) {
      totalPrice += price * i;
    }

    long difference = money - totalPrice;

    if (difference < 0) {
      answer = (- 1) * difference;
      return answer;
    }

    answer = 0;

    return answer;
  }
}
