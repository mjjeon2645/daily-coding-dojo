import org.junit.jupiter.api.Test;

import java.util.WeakHashMap;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
  @Test
  void sample1() {
  Solution solution = new Solution();

  assertEquals(3, solution.solution(10));
  }

  @Test
  void sample2() {
    Solution solution = new Solution();

    assertEquals(11, solution.solution(12));
  }
}
