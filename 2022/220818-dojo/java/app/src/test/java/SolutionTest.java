import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
  @Test
  void sample1() {
    Solution solution = new Solution();

  assertEquals("TrY HeLlO WoRlD", solution.solution("try hello world"));
  }

  @Test
  void sample2() {
    Solution solution = new Solution();

    assertEquals("TrY", solution.solution("try"));
  }

  @Test
  void sample3() {
    Solution solution = new Solution();

    assertEquals("T", solution.solution("t"));
  }

  @Test
  void sample4() {
    Solution solution = new Solution();

    assertEquals("T", solution.solution("t"));
  }

  @Test
  void sample5() {
    Solution solution = new Solution();

    assertEquals("Ap   Ba", solution.solution("AP   BA"));
  }

  @Test
  void sample6() {
    Solution solution = new Solution();

    assertEquals("AbC AbC AbC", solution.solution("abc abc abc"));
  }
}
