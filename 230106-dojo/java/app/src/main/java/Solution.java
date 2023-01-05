import java.util.Set;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.stream.*;


class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        Set<String> removingDuplicateReportItem = new LinkedHashSet<>();

        removeDuplicateReport(report, removingDuplicateReportItem);

        List<String> rawRealReport = removingDuplicateReportItem.stream().collect(Collectors.toList());

        Map<String, List<String>> realReportMap = new LinkedHashMap<>();

        makeRealReportMap(id_list, rawRealReport, realReportMap, k);

        return count(id_list, realReportMap);
    }

    public void removeDuplicateReport(String[] report, Set<String> set) {
        set.addAll(Arrays.asList(report));
    }

    public void makeRealReportMap(String[] id_list, List<String> rawRealReport, Map<String, List<String>> realReportMap, int k) {
        for (String id : id_list) {
            List<String> reportingUsers = new LinkedList<>();

            for (String reportHistory : rawRealReport) {
                String reportingUser = reportHistory.split(" ")[0];
                String reportedUser = reportHistory.split(" ")[1];

                if (id.equals(reportedUser)) {
                    reportingUsers.add(reportingUser);
                }
            }

            if (reportingUsers.size() < k) {
                continue;
            }

            realReportMap.put(id, reportingUsers);
        }
    }

    private int[] count(String[] id_list, Map<String, List<String>> realReportMap) {
        Map<String, Integer> realResult = new LinkedHashMap<>();

        for (String id : id_list) {
            realResult.put(id, 0);
        }

        List<List<String>> lists = realReportMap.values().stream().collect(Collectors.toList());

        for (List<String> list : lists) {
            for (String reportingUser : list) {
                realResult.put(reportingUser, realResult.get(reportingUser) + 1);
            }
        }

        int[] result = new int[id_list.length];

        for (int i = 0; i < id_list.length; i += 1) {
            if (!realResult.containsKey(id_list[i])) {
                result[i] = 0;
                continue;
            }

            result[i] = realResult.get(id_list[i]);
        }
        return result;
    }
}
