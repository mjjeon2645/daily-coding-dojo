import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
  @Test
  void sampleTest1() {
    Solution solution = new Solution();

    assertEquals(3, solution.solution(10));
  }

  @Test
  void sampleTest2() {
    Solution solution = new Solution();

    assertEquals(11, solution.solution(12));
  }

  @Test
  void minNumberTest() {
    Solution solution = new Solution();

    assertEquals(2, solution.solution(3));
  }

  @Test
  void maxNumberTest() {
    Solution solution = new Solution();

    assertEquals(3, solution.solution(1000000));
  }
}
