import org.junit.jupiter.api.*;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Solution2Test {
  @Test
  void removeDuplicateReports1() {
    Solution2 solution2 = new Solution2();
    String[] report = new String[]{
        "muzi frodo","apeach frodo","frodo neo",
        "muzi neo","apeach muzi"
    };

    assertEquals(solution2.removeDuplicateReports(report).size(), 5);
    assertEquals(solution2.removeDuplicateReports(report).contains("muzi frodo"), true);
  }

  @Test
  void removeDuplicateReports2() {
    Solution2 solution2 = new Solution2();
    String[] report =
        new String[]{"ryan con", "ryan con", "ryan con", "ryan con"};

    assertEquals(solution2.removeDuplicateReports(report).size(), 1);
    assertEquals(solution2.removeDuplicateReports(report).contains("ryan con"), true);
  }

  @Test
  void makeReportMap() {
    Solution2 solution2 = new Solution2();
    String[] id_list = new String[]{"con", "ryan"};

    Map<String, List<String>> reportMap = solution2.makeReportMap(id_list);

    assertEquals(reportMap.size(), 2);
    assertTrue(reportMap.containsKey("con"));
    assertTrue(reportMap.containsKey("ryan"));
    assertEquals(reportMap.get("con").size(), 0);
  }

  @Test
  void makeReportingHistory() {
    Solution2 solution2 = new Solution2();

    Map<String, List<String>> reportMap = new LinkedHashMap<>();
    reportMap.put("con", new ArrayList<>());
    reportMap.put("ryan", new ArrayList<>());
    reportMap.put("muzi", new ArrayList<>());

    List<String> realReports = new ArrayList<>();
    realReports.add("con ryan");
    realReports.add("muzi ryan");
    realReports.add("muzi con");

    solution2.makeReportingHistory(reportMap, realReports);

    assertEquals(reportMap.get("con"), List.of("ryan"));
    assertEquals(reportMap.get("muzi"), List.of("ryan", "con"));
    assertEquals(reportMap.get("ryan").size(), 0);
  }
}
