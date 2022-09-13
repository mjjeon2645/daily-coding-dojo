import java.util.*;

class Solution2 {
  public int[] solution(String[] id_list, String[] report, int k) {
    int[] answer = {};
    // 1. 리포트 배열의 중복을 없앤 후 리스트로 변환해줌. 해당 리포트는 중복값이 없는 찐 리포트('신고자 신고당한이' 로 구성)
    List<String> realReports = removeDuplicateReports(report);

    // 2. 입력한 아이디의 순서가 지켜지는 맵이 만들어져야 함.
    Map<String, List<String>> reportMap = makeReportMap(id_list);

    // 3. 찐 리포트를 split으로 쪼갠 후, reportMap의 키에 해당하는 유저가 신고한 내역이 있으면 인덱스 1값을 밸류에 add시킴
    makeReportingHistory(reportMap, realReports);

    return answer;
  }

  public List<String> removeDuplicateReports(String[] report) {
    HashSet<String> filter = new HashSet<>();

    Collections.addAll(filter, report);

    return filter.stream().toList();
  }

  public Map<String, List<String>> makeReportMap(String[] id_list) {
    Map<String, List<String>> reportMap = new LinkedHashMap<>();

    for (String user : id_list) {
      reportMap.put(user, new ArrayList<>());
    }

    return reportMap;
  }

  public void makeReportingHistory(Map<String, List<String>> reportMap, List<String> realReports) {

  }
}