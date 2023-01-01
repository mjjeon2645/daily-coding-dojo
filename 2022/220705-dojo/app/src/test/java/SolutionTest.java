import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
  @Test
  void test() {
    Solution solution = new Solution();

    assertEquals(8, solution.solution(6));
  }

  @Test
  void test2() {
    Solution solution = new Solution();

    assertEquals(4, solution.solution(16));
  }

  @Test
  void test3() {
    Solution solution = new Solution();

    assertEquals(-1, solution.solution(626331));
  }
}