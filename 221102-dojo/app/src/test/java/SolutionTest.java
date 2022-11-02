import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
  @Test
  void sample() {
    Solution solution = new Solution();

    assertEquals(1, solution.solution("baabaa"));
  }
}
