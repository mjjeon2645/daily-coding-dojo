import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
  @Test
  void samples() {
    Solution solution = new Solution();

    assertEquals("leo", solution.solution(new String[]{"leo", "kiki", "eden"},
        new String[]{"eden", "kiki"}));
  }
}
