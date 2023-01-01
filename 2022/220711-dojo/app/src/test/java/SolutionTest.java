import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
  @Test
  void simple() {
    Solution solution = new Solution();
    String n = "s";
    String answer = solution.solution(n);

    assertEquals("s", answer);
  }

  @Test
  void doubleString() {
    Solution solution = new Solution();
    String n = "sS";
    String answer = solution.solution(n);

    assertEquals("sS", answer);
  }

  @Test
  void reversedDoubleString() {
    Solution solution = new Solution();
    String n = "Ss";
    String answer = solution.solution(n);

    assertEquals("sS", answer);

    n = "Ba";
    answer = solution.solution(n);

    assertEquals("aB", answer);
  }

  @Test
  void tripleString() {
    Solution solution = new Solution();
    String n = "saS";
    String answer = solution.solution(n);

    assertEquals("saS", answer);
  }

  @Test
  void reversedTripleString() {
    Solution solution = new Solution();
    String n = "aSs";
    String answer = solution.solution(n);

    assertEquals("asS", answer);
  }
}
