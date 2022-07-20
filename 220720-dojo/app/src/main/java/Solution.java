import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
  public int[] solution(int n, int m) {
    int[] answer = new int[2];

    long smallNumber = 0;
    long largeNumber = 0;

    if (n > m) {
      smallNumber = m;
      largeNumber = n;
    }

    if (n < m) {
      smallNumber = n;
      largeNumber = m;
    }

    if (n == m) {
      answer[0] = n;
      answer[1] = n;
      return answer;
    }

    if (largeNumber % smallNumber == 0) {
      answer[0] = (int) smallNumber;
      answer[1] = (int) largeNumber;
      return answer;
    }

    String number = "";
    long dividend = largeNumber;

    for (int i = 2; i <= largeNumber; i += 1) {
      if (dividend % i == 0) {
        number += i;
        dividend /= i;
      }
    }

    String[] numbers1 = number.split("");

    number = "";
    dividend = smallNumber;

    for (int i = 2; i <= smallNumber; i += 1) {
      if (dividend % i == 0) {
        number += i;
        dividend /= i;
      }
    }

    String[] numbers2 = number.split("");

    Arrays.sort(numbers1);
    Arrays.sort(numbers2);



    return new int[]{0, 0};
  }
}
