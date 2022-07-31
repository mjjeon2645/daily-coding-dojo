import java.util.*;

class Solution {
  public static int[] solution(String[] id_list, String[] report, int k) {
    int[] answer = {};
    answer = new int[id_list.length];

    Map<String, HashSet<String>> reportedMap = new HashMap<>();
    Map<String, Integer> resultMap = new HashMap<>();

    for (int i = 0; i < id_list.length; i++) {
      HashSet<String> reportingIds = new HashSet<>();
      reportedMap.put(id_list[i], reportingIds);
      resultMap.put(id_list[i], 0);
    }
    for (String word : report) {
      String[] words = word.split(" ");
      String reportingId = words[0];
      String reportedId = words[1];

      reportedMap.get(reportedId).add(reportingId);
    }

    for (String reportedUser : reportedMap.keySet()) { // reportedUser 는 신고된ID유저
      HashSet<String> reportingUser = reportedMap.get(reportedUser); // reportedUser(신고된유저)를 신고한 유저
      if (reportingUser.size() >= k) { // 신고된 횟수가 K번 이상일 경우
        for (String userId : reportingUser) {
          resultMap.put(userId, resultMap.get(userId) + 1); // answerMap 에 신고된Id 별 메일 수 넣기
        }
      }
    }

    for (int i = 0; i < id_list.length; i++) {
      answer[i] = resultMap.get(id_list[i]);
    }

    return answer;
  }
}
