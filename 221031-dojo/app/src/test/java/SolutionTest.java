import org.junit.jupiter.api.*;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
  @Test
  void sample() {
    Solution solution = new Solution();

    assertArrayEquals(new int[]{4, 3}, solution.solution(10, 2));
    assertArrayEquals(new int[]{3, 3}, solution.solution(8, 1));
    assertArrayEquals(new int[]{8, 6}, solution.solution(24, 24));
    assertArrayEquals(new int[]{6, 4}, solution.solution(16, 8));
  }

  @Test
  void findDivisors() {
    Solution solution = new Solution();

    assertEquals(List.of(1, 2, 4), solution.findDivisors(4));
    assertEquals(List.of(1, 2, 3, 4, 6, 8, 12, 24), solution.findDivisors(24));
  }
}
