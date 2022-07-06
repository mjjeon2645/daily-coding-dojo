// 1. 임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단
// n이 양의 정수 x의 제곱이라면 (x+1)의 제곱을 리턴
// 아니라면 -1을 리턴
// 1 <= n <= 50000000000000 이하의 양의 정수
// 주의할 것: n의 범위가 아주 넓고, int 정수로는 표현되지 않는 범위로 제공되었음
// 엣지 케이스에 대한 사전 추측 -> n의 최소값, 최대값을 테스트로 반드시 확인
// 테스트 시 -> 최대값 인식이 되지 않아 String 형태로 바꾼 후 다시 long으로 변환하는 작업 진행했음
// i가 증가할 때 모든 수를 다 탐색할 필요는 없고, i*i가 처음 입력수인 n을 넘어서는 순간부터 탐색을 중단하면 되므로 조건문 추가

public class Solution {
  public long solution(long n) {
    long answer = 4;
    long i = 1;

    while (i < n) {
      if (n == i * i) {
        answer = (i + 1) * (i + 1);
        break;
      }

      if (n < i * i) {
        break;
      }

      answer = -1;
      i += 1;
    }

    return answer;
  }
}
