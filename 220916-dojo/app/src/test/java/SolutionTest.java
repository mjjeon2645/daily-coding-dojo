import org.junit.jupiter.api.*;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
  //  @Test
  void sample1() {
    Solution solution = new Solution();

    int[] numbers = new int[]{1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
    String hand = "right";
    String result = "LRLLLRLLRRL";
    assertEquals(solution.solution(numbers, hand), result);
  }

  //  @Test
  void sample2() {
    Solution solution = new Solution();

    int[] numbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
    String hand = "right";
    String result = "LLRLLRLLRL";
    assertEquals(solution.solution(numbers, hand), result);
  }

  //  @Test
  void sample3() {
    Solution solution = new Solution();

    int[] numbers = new int[]{7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
    String hand = "left";
    String result = "LRLLRRLLLRR";
    assertEquals(solution.solution(numbers, hand), result);
  }

  @Test
  void processor() {
    Solution solution = new Solution();
    int[] numbers = new int[]{7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};


    List<String> lists = solution.processor(numbers);

    assertEquals(lists.size(), 11);
    assertEquals(lists, List.of("L", "0", "8", "2", "8", "R", "L", "5", "L", "R", "2"));
  }

  // 가운데 있는 숫자 2, 5, 8, 11은 손가락이 있는 숫자랑 1, 또는 3 차이가 날때는 거리가 1
  // 또는 2, 4 차이가 날때는 2
  // 또는 5 차이 날때는 3
  // 6 이상부터는 그냥 왼손/오른손잡이에 의해서만. 판단하면 되지 ㅇ낳을까?

  @Test
  void validator() {
    Solution solution = new Solution();
    int[] numbers = new int[]{7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
    List<String> lists = new ArrayList<>();
    String hand = "right";

    int leftHandsPosition = 10;
    int rightHandsPosition = 12;

    int i = 0;
    if (numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {
      leftHandsPosition = numbers[i];
      lists.add("left");
    }

    if (numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) {
      rightHandsPosition = numbers[i];
      lists.add("right");
    }

    if (numbers[i] == 2 || numbers[i] == 5 || numbers[i] == 8 || numbers[i] == 11) {
      if (hand.equals("right") ) {
        rightHandsPosition = numbers[i];
        lists.add("right");
      }

      if (hand.equals("left") ) {
        leftHandsPosition = numbers[i];
        lists.add("left");
      }
    }

    i = 1;
    if (numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {
      leftHandsPosition = numbers[i];
      lists.add("left");
    }

    if (numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) {
      rightHandsPosition = numbers[i];
      lists.add("right");
    }

    if (numbers[i] == 2 || numbers[i] == 5 || numbers[i] == 8 || numbers[i] == 11) {

      int tempRight = Math.abs(rightHandsPosition - numbers[i]);
      int themLeft = Math.abs(leftHandsPosition - numbers[i]);
    }
      if (hand.equals("right") ) {
        rightHandsPosition = numbers[i];
        lists.add("right");
      }

      if (hand.equals("left") ) {
        leftHandsPosition = numbers[i];
        lists.add("left");
      }


  }
}
