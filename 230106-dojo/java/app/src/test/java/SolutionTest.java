import org.junit.jupiter.api.*;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void sample() {
        Solution solution = new Solution();

        assertArrayEquals(new int[]{2, 1, 1, 0},
            solution.solution(new String[]{"muzi", "frodo", "apeach", "neo"},
                new String[]{"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"},
                2));
        assertArrayEquals(new int[]{0, 0},
            solution.solution(new String[]{"con", "ryan"},
                new String[]{"ryan con", "ryan con", "ryan con", "ryan con"},
                3));
    }

    @Test
    void removeDuplicateItem1() {
        Solution solution = new Solution();

        String[] report = new String[]{"ryan con", "ryan con", "ryan con", "ryan con"};

        Set<String> removingDuplicateReportItem = new LinkedHashSet<>();

        solution.removeDuplicateReport(report, removingDuplicateReportItem);

        assertEquals(1, removingDuplicateReportItem.size());
    }

    @Test
    void removeDuplicateItem2() {
        Solution solution = new Solution();

        String[] report = new String[]{"muzi frodo", "apeach frodo", "frodo neo",
            "muzi frodo", "muzi neo", "apeach muzi"};

        Set<String> removingDuplicateReportItem = new LinkedHashSet<>();

        solution.removeDuplicateReport(report, removingDuplicateReportItem);

        assertEquals(5, removingDuplicateReportItem.size());
    }

    @Test
    void makeRealReportMap() {
        Solution solution = new Solution();

        String[] id_list = new String[]{"muzi", "frodo", "apeach", "neo"};

        List<String> rawRealReport = new LinkedList<>();
        rawRealReport.add("muzi frodo");
        rawRealReport.add("apeach frodo");
        rawRealReport.add("frodo neo");

        Map<String, List<String>> realReportMap = new LinkedHashMap<>();

        int k = 1;

        solution.makeRealReportMap(id_list , rawRealReport, realReportMap, k);

        assertEquals(2, realReportMap.get("frodo").size());
        assertEquals("muzi", realReportMap.get("frodo").get(0));
    }
}
