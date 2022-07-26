public class Solution {
  public int solution(int[] numbers) {
    int answer = -1;
    int accumulator = 0;

    for (int number : numbers) {
      accumulator += number;
    }

    answer = (1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9) - accumulator;

    return answer;
  }
}
