import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
  @Test
  void sampleTest1() {
    Solution solution = new Solution();

    assertEquals(3, solution.solution(new int[]{1, 3, 2, 5, 4}, 9));
  }

  @Test
  void sampleTest2() {
    Solution solution = new Solution();

    assertEquals(4, solution.solution(new int[]{2, 2, 3, 3}, 10));
  }

  @Test
  void arraysSortTest() {
    int[] array = new int[]{2, 2, 3, 3};
    int[] array2 = new int[]{1, 3, 2, 5, 4};

    Arrays.sort(array);
    Arrays.sort(array2);

    for (int i = 0; i < array.length; i += 1) {
      System.out.println(array[i]);
    }

    for (int i = 0; i < array2.length; i += 1) {
      System.out.println(array2[i]);
    }



  }
}
