// 원하는 것
// 문자를 큰 -> 작은 순으로 정렬한 문자열

// 아는 것
// - 대문자는 소문자 보다 작다
// - 입력받는 문자열 s의 길이 >= 1

// 계획
// 각 문자의 유니코드 값을 비교
// 유니코드 값으로 정렬
// 정렬한 문자를 뒤집는다.


import java.util.Arrays;
import java.util.stream.Collectors;

public class BestPracticeClone {
  public String solution1(String s) {
    String[] letters = s.split("");
    String answer = Arrays.stream(letters).sorted().collect(Collectors.joining(""));

    return new StringBuilder(answer).reverse().toString();
  }

}
