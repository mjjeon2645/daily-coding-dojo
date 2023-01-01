import java.util.Arrays;

class Solution {
  public int solution(int[] absolutes, boolean[] signs) {
    int answer = 0;

// solution 1. signs의 원소 값이 true일 경우, absolutes의 원소값을 accumulator에 그냥 더함
//                   "        false일 경우, absolutes의 원소값을 accumulator에서 뺌
//             배열 끝까지 계산을 한 값인 accumulator를 answer에 할당한 뒤 그 answer을 리턴

    int accumulator = 0;

    for (int i = 0 ; i < absolutes.length; i += 1) {
      if (signs[i]) {
        accumulator += absolutes[i];
      }

      if (!signs[i]) {
        accumulator -= absolutes[i];
      }
    }

    answer = accumulator;

// solution 2. absolutes 원소를 각각 비교한 뒤 실제값이 들어있는 배열을 생성하여 그 배열에서 sum과 같은 함수 써보기

    int[] realNumbers = new int[absolutes.length];

    for (int i = 0; i < absolutes.length; i += 1) {
      realNumbers[i] = signs[i] ? absolutes[i] : -1 * absolutes[i];
    }

    answer = Arrays.stream(realNumbers).sum();

// solution 3. 타 풀이 참고. 별도의 변수나 어레이 생성하지 않고 바로 answer로 리턴해주기

    for (int i = 0; i < signs.length; i += 1) {
      answer += absolutes[i] * (signs[i] ? 1 : -1);
    }

    return answer;
  }
}
