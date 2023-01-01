// x만큼 간격이 있는 n개의 숫자
// 함수 solution은 정수 x, 자연수 n을 입력 받아 x 부터 시작해 x씩 증가하는 숫자 n개를 지니는 리스트를 리턴


public class Solution {
  public long[] solution(int x, int n) {

    long[] answer = new long[n];

    long baseNumber = x;

    for (int i = 0; i < n; i += 1) {
      answer[i] = baseNumber;
      baseNumber += x;
    }

    return answer;
  }
}
