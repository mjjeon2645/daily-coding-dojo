import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
  @Test
  void onlyNumbers() {
    Solution solution = new Solution();

    assertEquals(123, solution.solution("123"));
  }

  @Test
  void inputStringNumberUnder10() {
    Solution solution = new Solution();

    assertEquals(8, solution.solution("eight"));
    assertEquals(5, solution.solution("five"));
  }

  @Test
  void inputStringNumberUnder100() {
    Solution solution = new Solution();

    assertEquals(38, solution.solution("38"));
    assertEquals(301, solution.solution("3zeroone"));
    assertEquals(819, solution.solution("eightonenine"));
    assertEquals(38, solution.solution("threeeight"));
  }
}
