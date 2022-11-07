import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
  @Test
  void sample() {
    Solution solution = new Solution();

    assertArrayEquals(new int[]{3, 3}, solution.solution(3,
        new String[]{"tank", "kick", "know", "wheel", "land", "dream", "mother",
            "robot", "tank"}));
    assertArrayEquals(new int[]{0, 0}, solution.solution(5,
        new String[]{"hello", "observe", "effect", "take", "either", "recognize",
            "encourage", "ensure", "establish", "hang", "gather", "refer",
            "reference", "estimate", "executive"}));
    assertArrayEquals(new int[]{1, 3}, solution.solution(2,
        new String[]{"hello", "one", "even", "never", "now", "world", "draw"}));
  }
}
