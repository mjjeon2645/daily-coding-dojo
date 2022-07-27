import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

class Solution {
  public static int[] solution(String[] id_list, String[] report, int k) {
    int[] answer = {};
    answer = new int[id_list.length];

    // 신고된 id, 신고한 id
    Map<String, HashSet<String>> reportedMap = new HashMap<>();

    // 신고한 id, 통지메일 수
    Map<String, Integer> resultMap = new HashMap<>();


    // 1. Map 초기화
    // hashset -> 신고한 id(여러명일 수 있음. 중복은 허용되지 않음 -> hashset)
    // reportedMap -> 신고된 id, 신고한 id(들)로 구성
    // resultMap -> 신고된 id는 id_list를 그대로 따르는 것으로. 메일 수(추후 확인. 처음은 0으로.)

    for (int i = 0; i < id_list.length; i++) {
      HashSet<String> reportingIds = new HashSet<>();
      reportedMap.put(id_list[i], reportingIds);
      resultMap.put(id_list[i], 0);
    }


    // 2. report(신고기록) = 신고한 id 신고된 id 이므로 split 활용
    // 신고된 id는 key값(유일), 신고한 id(들)은 value
    for (String word : report) {
      String[] words = word.split(" ");
      String reportingId = words[0];
      String reportedId = words[1];

      reportedMap.get(reportedId).add(reportingId);
    }

    // 3. 메일 갯수 세기
    // keySet() -> 키값만 가져오는 메서드.
    // 기본적으로 해시맵에서는 get(key)를 하면 그 키에 해당하는 밸류값을 반환해줌.

    for (String reportedUser : reportedMap.keySet()) { // reportedUser 는 신고된ID유저
      HashSet<String> reportingUser = reportedMap.get(reportedUser); // reportedUser(신고된유저)를 신고한 유저
      if (reportingUser.size() >= k) { // 신고된 횟수가 K번 이상일 경우
        for (String userId : reportingUser) {
          resultMap.put(userId, resultMap.get(userId) + 1); // answerMap 에 신고된Id 별 메일 수 넣기
        }
      }
    }

    // 4. 신고한 유저 id 별로 받은 메일 수 카운트.

    for (int i = 0; i < id_list.length; i++) {
      answer[i] = resultMap.get(id_list[i]);
    }

    return answer;
  }

}
