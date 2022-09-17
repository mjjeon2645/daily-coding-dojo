import org.junit.jupiter.api.*;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
//  @Test
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

  @Test
  void removeDuplicateReports3() {
    Solution solution = new Solution();
    String[] report = new String[]{
        "muzi frodo","apeach frodo","frodo neo",
        "muzi neo","apeach muzi"
    };

    assertEquals(solution.removeDuplicateReports(report).size(), 5);
  }

  @Test
  void removeDuplicateReports4() {
    Solution solution = new Solution();
    String[] report =
        new String[]{"ryan con", "ryan con", "ryan con", "ryan con"};

    assertEquals(solution.removeDuplicateReports(report).size(), 1);
  }

  @Test
  void counter() {
    Solution solution = new Solution();

    String[] id_list = new String[]{"muzi", "frodo", "apeach", "neo"};

    LinkedHashMap<String, Long> maps = new LinkedHashMap<>();
    for (String id : id_list) {
      maps.put(id, 0L);
    }

    List<String> realReports = List.of(
        "muzi frodo",
        "apeach frodo",
        "frodo neo",
        "muzi neo",
        "apeach muzi"
    );

    LinkedHashMap<String, Long> reportedMaps = solution.counter(realReports, maps);

    assertEquals(reportedMaps.size(), 4);
    assertEquals(reportedMaps.get("muzi"), 1);
    assertEquals(reportedMaps.get("frodo"), 2);
  }
}
