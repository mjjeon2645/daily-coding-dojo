import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class Solution {
  public long solution(long n) {
    long answer = 0;
    // 정수를 문자로 변환
    String number = Long.toString(n);

    // 문자열을 for문을 돌려서 각 배열에 charAt으로 넣음
    String[] newArray = new String[number.length()];

    for (int i = 0; i < number.length(); i += 1) {
      newArray[i] = number.charAt(i) + "";
    }

    Arrays.sort(newArray, Collections.reverseOrder());

    answer = Long.parseLong(Arrays.stream(newArray).collect(Collectors.joining()));

    //해
    return answer;
  }
}
