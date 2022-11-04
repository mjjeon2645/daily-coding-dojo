import org.junit.jupiter.api.*;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
  @Test
  void sample() {
    Solution solution = new Solution();

//    assertEquals(16384, solution.solution("FRANCE", "french"));
    assertEquals(65536, solution.solution("E=M*C^2", "e=m*c^2"));
    assertEquals(65536, solution.solution("=*^", "=*^"));
  }

  @Test
  void sliceWord() {
    Solution solution = new Solution();

    assertEquals(List.of("fr", "ra", "an", "nc", "ce"), solution.sliceWord("france"));
    assertEquals(List.of("fr", "ra", "an", "nc", "ce"), solution.sliceWord("france "));
    assertEquals(List.of("fr", "ra", "an", "nc", "ce"), solution.sliceWord("france +"));
    assertEquals(List.of(), solution.sliceWord("+++"));
    assertEquals(List.of(), solution.sliceWord("++"));
  }
}
