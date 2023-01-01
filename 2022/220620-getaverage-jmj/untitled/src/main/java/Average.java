// 문제 해석
// 배열 array에는 정수가 담겨있음. 해당 array의 평균값을 리턴하는 함수 solution 완성하기
// 제한사항
//  - array는 길이가 1 이상, 100 이하인 배열
//  - array 원소는 -10,000 이상 10,000 이하인 정

// 생각하기
// 음수 원소는 어떻게 평균을 처리해야 하나? 예. {-5, 5 } array의 평균은 0인가?
// 평균이란 => 모든 원소를 다 더한 뒤, 원소의 갯수로 나누어준 값
//        => 평균값이 소수가 될 수 있으므로 변수 선언시 주의

import java.util.Scanner;

public class Average {
  public static void main(String[] args) {
    Average application = new Average();
    application.run();
  }

  public void run() {
    int[] array = new int[]{};
    solution(array);
  }

  public double solution(int[] array) {
    double sum = 0;
    double base = array.length;

    for (int i = 0; i < array.length; i += 1) {
      sum += array[i];
    }

    return sum / base;
  }
}
