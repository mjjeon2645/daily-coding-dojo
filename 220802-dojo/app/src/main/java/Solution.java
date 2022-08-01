public class Solution {
  public int solution(int left, int right) {
    int answer = 0;

    int[] numbers = new int[right - left + 1];

    for (int i = 0; i < right - left + 1; i += 1) {
      numbers[i] = left + i;
    }

    int count = 0;

    for (int i = 0; i < numbers.length; i += 1) {
      for (int j = 1; j <= numbers[i]; j += 1) {
        if (numbers[i] % j == 0) {
          count += 1;
        }
      }

      if (count % 2 == 0) {
        answer += numbers[i];
      }

      if (count % 2 != 0) {
        answer -= numbers[i];
      }

      count = 0;
    }
    return answer;
  }
}
