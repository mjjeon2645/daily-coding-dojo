import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
  @Test
  void sampleTest1() {
    Solution solution = new Solution();

    int[] arr = new int[]{1, 1, 3, 3, 0, 1, 1};

    assertArrayEquals(new int[]{1, 3, 0, 1}, solution.solution(arr));
  }

  @Test
  void sampleTest2() {
    Solution solution = new Solution();

    int[] arr = new int[]{4, 4, 4, 3, 3};

    assertArrayEquals(new int[]{4, 3}, solution.solution(arr));
  }
}
