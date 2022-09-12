import org.junit.jupiter.api.*;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
  @Test
  void sample1() {
    Solution solution = new Solution();

    String[] id_list = new String[]{"con", "ryan"};

    String[] report = new String[]{"ryan con", "ryan con", "ryan con", "ryan con"};

    int k = 3;

    assertArrayEquals(solution.solution(id_list, report, k), new int[]{0, 0});
  }

//  @Test
  void removeDuplicateReports1() {
    // 해쉬셋에 대해 알아봄 1
    String[] id_list = new String[]{"con", "ryan"};
    String[] report = new String[]{"ryan con", "ryan con", "ryan con", "ryan con"};
    int k = 3;

    Solution solution = new Solution();

    HashSet<String> renewalReport = new HashSet<>();

    Arrays.stream(report).forEach(item -> renewalReport.add(item));

    assertEquals(renewalReport.size(), 1);

    assertEquals(solution.removeDuplicateReports(report).size(), 1);
  }

//  @Test
  void removeDuplicateReports2() {
    // 해쉬셋에 대해 알아봄 2
    String[] report = new String[]{
        "muzi frodo","apeach frodo","frodo neo",
        "muzi neo","apeach muzi"
    };

    Solution solution = new Solution();

    assertEquals(solution.removeDuplicateReports(report).size(), 5);
  }
}