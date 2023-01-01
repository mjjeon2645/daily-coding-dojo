import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
  @Test
  void transferFromDecimal1() {
    Solution solution = new Solution();

    assertEquals("0021", solution.transferFromDecimal(45));
  }

  @Test
  void transferFromDecimal2() {
    Solution solution = new Solution();

    assertEquals("22111", solution.transferFromDecimal(125));
  }

  @Test
  void toDecimalNumber() {
    Solution solution = new Solution();

    assertEquals(229, solution.toDecimalNumber("22111"));
  }

  @Test
  void sample1() {
    Solution solution = new Solution();

    assertEquals(7, solution.solution(45));
  }

  @Test
  void sample2() {
    Solution solution = new Solution();

    assertEquals(125, solution.solution(229));
  }
}
