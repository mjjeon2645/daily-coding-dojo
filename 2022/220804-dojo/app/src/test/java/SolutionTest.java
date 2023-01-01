import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
  @Test
  void sample1() {
    Solution solution= new Solution();

    assertEquals(3, solution.solution(new int[]{1, 3, 2, 5, 4}, 9));
  }

  @Test
  void sample2() {
    Solution solution= new Solution();

    assertEquals(4, solution.solution(new int[]{2, 2, 3, 3}, 10));
  }
}
