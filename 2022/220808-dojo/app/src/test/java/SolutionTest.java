import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
  @Test
  void sample1() {
    Solution solution = new Solution();

    assertArrayEquals(new int[]{5, 10},
        solution.solution(new int[]{5, 9, 7, 10}, 5));
  }

  @Test
  void sample2() {
    Solution solution = new Solution();

    assertArrayEquals(new int[]{1, 2, 3, 36},
        solution.solution(new int[]{2, 36, 1, 3}, 1));
  }

  @Test
  void sample3() {
    Solution solution = new Solution();

    assertArrayEquals(new int[]{-1},
        solution.solution(new int[]{3, 2, 6}, 10));
  }

  @Test
  void test() {
    Solution solution = new Solution();

    int[] arr = new int[]{3, 2, 6};
    int divisor = 10;

    int[] newArray = Arrays.stream(arr)
        .filter(number -> number % divisor == 0)
        .toArray();

    assertArrayEquals(new int[]{}, newArray);
  }
}
