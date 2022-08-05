import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
  @Test
  void distinct() {
    Solution solution = new Solution();

    int[] sampleArray = {3, 1, 2, 3};

    int[] newArray = Arrays.stream(sampleArray).distinct().toArray();

    assertEquals(3, newArray.length);
    assertEquals(3, newArray[0]);
    assertEquals(1, newArray[1]);
    assertEquals(2, newArray[2]);
  }

  @Test
  void sample1() {
    Solution solution = new Solution();

    assertEquals(2, solution.solution(new int[]{3, 1, 2, 3}));
  }
}
