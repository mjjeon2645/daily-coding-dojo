// 가장 쉬운것 부터. 147을 눌렀을 때는 L, 369를 눌렀을 때는 배열에 R을 뱉어내도록 만들어보자.

// 반드시 왼손, 오른손을 써야만 하는 것에 대해서만 변환해주는 processor라는 메소드를 만들어서 해보자.
// 써야하는 손이 왼손일땐 L, 오른손일땐 R, 이외의 숫자는 스트링 타입으로 만들어보자. => List로 뱉어내게.
// 배열은.. strict해서 사용하기 힘드니까? ㅎㅎ

// 아래 테스트 통과. 그럼 이 리스트에서 N인 항목에 대한 판단하기.
//    List<String> filteredLists = processor(numbers);
//
//    List<String> results = validator(filteredLists, hand);

//    왼손의 시작점은 10, 오른손의 시작점은 12

import java.util.*;

class Solution {
  public String solution(int[] numbers, String hand) {
    String answer = "";

    List<String> lists = new ArrayList<>();

    int left = 10;
    int right = 12;

    int distanceFromLeft = 0;
    int distanceFromRight = 0;

    for (int i = 0; i < numbers.length; i += 1) {
      int number = numbers[i]; // 계속 사용하게될 변수

      if (number == 1 || number == 4 || number == 7) {
        left = number;
        lists.add("L");
      }

      if (number == 3 || number == 6 || number == 9) {
        right = number;
        lists.add("R");
      }

      if (number == 2 || number == 5 || number == 8 || number == 0) {
        if (number == 0) {
          number = 11;
        }

        distanceFromLeft = (Math.abs(number - left) / 3) + (Math.abs(number - left) % 3);
        distanceFromRight = (Math.abs(number - right) / 3) + (Math.abs(number - right) % 3);

        if (distanceFromLeft == distanceFromRight) {
          if (hand.equals("right")) {
            right = number;
            lists.add("R");
          }

          if (hand.equals("left")) {
            left = number;
            lists.add("L");
          }
        }

        if (distanceFromLeft > distanceFromRight) {
          right = number;
          lists.add("R");
        }

        if (distanceFromLeft < distanceFromRight) {
          left = number;
          lists.add("L");
        }
      }
    }

    for (String list : lists) {
      answer += list;
    }

    return answer;
  }
//
//  public List<String> validator(List<String> filteredLists, String hand) {
//    return null;
//  }
//
//  public List<String> processor(int[] numbers) {
//    List<String> filteredLists = new ArrayList<>();
//
//    for (int number : numbers) {
//      if (number == 1 || number == 4 || number == 7) {
//        filteredLists.add("L");
//        continue;
//      }
//
//      if (number == 3 || number == 6 || number == 9) {
//        filteredLists.add("R");
//        continue;
//      }
//
//      if (number == 2 || number == 5 || number == 8 || number == 0) {
//        filteredLists.add(Integer.toString(number));
//      }
//    }
//    return new ArrayList<>(filteredLists);
//  }
}
