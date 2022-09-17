import java.util.*;
import java.util.stream.*;

class Solution2 {
  public int[] solution(String[] id_list, String[] report, int k) {
    int[] answer = {};
    // 1. 리포트 배열의 중복을 없앤 후 리스트로 변환해줌. 해당 리포트는 중복값이 없는 찐 리포트('신고자 신고당한이' 로 구성)
    List<String> realReports = removeDuplicateReports(report);

    // 2. 입력한 아이디의 순서가 지켜지는 맵이 만들어져야 함.
    Map<String, List<String>> reportMap = makeReportMap(id_list);

    // 3. 찐 리포트를 split으로 쪼갠 후, reportMap의 키에 해당하는 유저가 신고한 내역이 있으면
    // 인덱스 1값을 밸류에 add시킴
    makeReportingHistory(reportMap, realReports);

    // 4. 여기서 뭘 할건지를 결정!!!! 위에까지 잘 만들어놓긴 했으니...
    // 여기부터 우선 동료 코드 참고하였음. 따로 풀어보기.
    List<String> lists = count(reportMap, k);

    // 5. 이메일 발송 카운트

    return countSentEmails(id_list, lists, reportMap);
  }

  public int[] countSentEmails(String[] id_list, List<String> lists, Map<String, List<String>> reportMap) {
    Map<String, Integer> countEmailsMap = new LinkedHashMap<>();

    for (String id : id_list) {
      countEmailsMap.put(id, 0);
    }

    for (String list : lists) {
      List<String> reporters = reportMap.get(list);

      for (String reporter : reporters) {
        countEmailsMap.replace(reporter, countEmailsMap.get(reporter) + 1);
      }
    }

    return countEmailsMap.values().stream()
        .collect(Collectors.toList())
        .stream().mapToInt(i -> i)
        .toArray();
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
    for (String report : realReports) {
      String[] words = report.split(" ");
      String user = words[0];
      String reportedUser = words[1];

      reportMap.get(user).add(reportedUser);
    }
  }

  public List<String> count(Map<String, List<String>> reportMap, int k) {
    List<String> lists = new ArrayList<>();

    for (String reportedUser : reportMap.keySet()) {
      int reportedCount = reportMap.get(reportedUser).size();

      if (reportedCount >= k) {
        lists.add(reportedUser);
      }
    }

    return lists;
  }
}
