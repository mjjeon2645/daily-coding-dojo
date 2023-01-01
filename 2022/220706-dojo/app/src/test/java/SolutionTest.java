import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
  @Test
  void testSample() {
    Solution solution = new Solution();

    assertEquals(144, solution.solution(121));
  }

  @Test
  void testSample2() {
    Solution solution = new Solution();

    assertEquals(-1, solution.solution(3));
  }

  @Test
  void maxNumberTest() {
    Solution solution = new Solution();
    String number = "50000000000000";
    long n = Long.parseLong(number);
    assertEquals(-1, solution.solution(n));
  }

  @Test
  void minNumberTest() {
    Solution solution = new Solution();

    assertEquals(4, solution.solution(1));
  }

}