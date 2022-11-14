import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
  @Test
  void onlyOneElementInArray() {
        Solution solution = new Solution();

        assertEquals(solution.process(new int[]{2}), 2);
  }

  @Test
  void twoElementsInArray() {
    Solution solution = new Solution();

    assertEquals(solution.process(new int[]{2, 5}), 10);
  }

  @Test
  void sample() {
    Solution solution = new Solution();

    assertEquals(solution.process(new int[]{2, 8, 8, 14}), 168);
  }
}
