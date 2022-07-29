import java.util.*;

class Solution {
  public static int[] solution(String[] id_list, String[] report, int k) {
    int[] answer = {id_list.length};

    // 신고당한 id, 신고한 유저(들). 헷갈리니까 신고당한 사람은 id로, 신고한 사람은 user로 쓰자..
    Map<String, HashSet<String>> reportsMap = new HashMap<>();

    // 신고한 유저, 메일 수
    Map<String, Integer> resultUserMap = new HashMap<>();

    // 1. 맵 초기화.
    // 신고한 유저는은 여러명일 수 있지만 중복은 카운트 안해줌. -> HashSet(중복허용 안함)
    // 신고한 유저 -> id_list 순서 그대로 따르기.

    for(int i = 0; i < id_list.length; i += 1) {
      HashSet<String> reportingUsers = new HashSet<>();
      reportsMap.put(id_list[i], reportingUsers);
      resultUserMap.put(id_list[i], 0);
    }

    // 2. report 어레이 쪼개서 신고당한 아이디와 신고한 유저 가져오기.
      for(String word : report) {
        String[] words = word.split(" ");
        String reportedId = words[0];
        String reportingUser = words[1];

        reportsMap.get(reportedId).add(reportingUser);
      }

    // 3. 메일 개수 세팅.
    for (String reportedID : reportsMap.keySet()) {
      
    }


    return answer;
  }
}
