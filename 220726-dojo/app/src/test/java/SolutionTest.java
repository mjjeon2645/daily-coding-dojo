import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
  @Test
  void sample1() {
    Solution solution = new Solution();

    String[] participants = new String[]{"leo", "kiki", "eden"};
    String[] completions = new String[]{"eden", "kiki"};

    assertEquals("leo", solution.solution(participants, completions));
  }

  @Test
  void sample2() {
    Solution solution = new Solution();

    String[] participants = new String[]{"marina", "josipa", "nikola", "vinko", "filipa"};
    String[] completions = new String[]{"josipa", "filipa", "marina", "nikola"};

    assertEquals("vinko", solution.solution(participants, completions));
  }

  @Test
  void sample3() {
    Solution solution = new Solution();

    String[] participants = new String[]{"mislav", "stanko", "mislav", "ana"};
    String[] completions = new String[]{"stanko", "ana", "mislav"};

    assertEquals("mislav", solution.solution(participants, completions));
  }
}
