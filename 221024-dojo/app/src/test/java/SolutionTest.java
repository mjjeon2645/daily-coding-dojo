import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
  @Test
  void sample() {
    Solution solution = new Solution();

    assertArrayEquals(new int[]{3, 8}, solution.solution("110010101001"));
    assertArrayEquals(new int[]{3, 3}, solution.solution("01110"));
    assertArrayEquals(new int[]{4, 1}, solution.solution("1111111"));
  }

  @Test
  void removeZero() {
    Solution solution = new Solution();

    assertEquals("11", solution.removeZero("110"));
    assertEquals("111111", solution.removeZero("110010101001"));
    assertEquals("1", solution.removeZero("10"));
  }

  @Test
  void countZero() {
    Solution solution = new Solution();

    assertEquals(1, solution.countZero("10", "1"));
    assertEquals(1, solution.countZero("110", "11"));
    assertEquals(6, solution.countZero("110010101001", "111111"));
  }

  @Test
  void toBinary() {
    Solution solution = new Solution();

    assertEquals("10", solution.toBinary("11"));
    assertEquals("1", solution.toBinary("1"));
    assertEquals("11", solution.toBinary("111"));
    assertEquals("100", solution.toBinary("1111"));
  }
}
