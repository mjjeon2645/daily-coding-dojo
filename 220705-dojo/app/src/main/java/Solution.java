// 문제: 콜라츠 추측: 주어진 수가 1이 될때까지 다음 작업을 반복하면 모든 수를 1로 만들 수 있음
// 1-1. 입력수가 짝수일 경우: 2로 나눔
// 1-2. 입력수가 홀수일 경우: 3을 곱하고 1 더함
// 2. 결과로 나온 수에 같은 작업을 1이 될 때까지 반복

// 위 작업을 몇 번 반복해야 하는지 반환하는 함수 완성하기
// 주어진 수가 1인 경우에는 0을 반환
// 작업을 500번 반복할 때까지 1이 되지 않으면 -1 반환

// 제한: 입력수는 1 이상 8,000,000 미만인 정수


public class Solution {
  public int solution(int num) {

    long number = (long) num;

    for (int i = 0; i < 500; i += 1) {
      if (number == 1) {
        return i;
      }

      number
          = (number % 2 == 0)
          ? number / 2
          : number * 3 + 1;
    }
    return -1;
  }
}
