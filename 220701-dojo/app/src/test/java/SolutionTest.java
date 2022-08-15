import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
  @Test
  void noOption() {
    Solution solution = new Solution();

    String dartResult = "1D2S0T";

    assertEquals(3, solution.solution(dartResult));
  }

}