import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution2Test {
  @Test
  void sampleTest1() {
    Solution2 solution2 = new Solution2();

    assertEquals(3, solution2.solution2(10));
  }

  @Test
  void sampleTest2() {
    Solution2 solution2 = new Solution2();

    assertEquals(11, solution2.solution2(12));
  }

  @Test
  void minNumberTest() {
    Solution2 solution2 = new Solution2();

    assertEquals(2, solution2.solution2(3));
  }

  @Test
  void maxNumberTest() {
    Solution2 solution2 = new Solution2();

    assertEquals(3, solution2.solution2(1000000));
  }
}
