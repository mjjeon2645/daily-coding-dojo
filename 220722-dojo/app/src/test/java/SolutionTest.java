import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
  @Test
  void sample1() {
    Solution solution = new Solution();

    assertEquals("a", solution.solution("z", 1));
  }

  @Test
  void sample2() {
    Solution solution = new Solution();

    assertEquals("e F d", solution.solution("a B z", 4));
  }
}
