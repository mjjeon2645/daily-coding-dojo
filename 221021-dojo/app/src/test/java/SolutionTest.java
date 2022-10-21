import org.junit.jupiter.api.*;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
  @Test
  void sample() {
    Solution solution = new Solution();

    assertEquals(true, solution.solution("()()"));
//    assertEquals(false, solution.solution(")()("));
  }
}
