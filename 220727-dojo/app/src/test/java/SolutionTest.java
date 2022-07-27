import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
  @Test
  void sample1() {
    Solution solution = new Solution();
    String[] id_list = new String[]{"muzi", "frodo", "apeach", "neo"};
    String[] report =
        new String[]{"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
    int k = 2;

    assertArrayEquals(new int[]{2, 1, 1, 0}, solution.solution(id_list, report, k));
  }
}
