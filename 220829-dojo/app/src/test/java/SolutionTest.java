import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
  @Test
  void samples() {
    Solution solution = new Solution();

    assertEquals("leo", solution.solution(new String[]{"leo", "kiki", "eden"},
        new String[]{"eden", "kiki"}));
  }

  @Test
  void samples2() {
    Solution solution = new Solution();

    assertEquals("vinko",
        solution.solution(new String[]{"marina", "josipa", "nikola", "vinko", "filipa"},
            new String[]{"josipa", "filipa", "marina", "nikola"}));
  }
}
