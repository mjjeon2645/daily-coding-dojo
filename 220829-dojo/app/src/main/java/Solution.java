// 마라톤 경기에 참여한 선수 수는 1명 이상 100,000명 이하
// 완주자 길이는 참여자 길이보다 1 작음
// 참가자 이름은 1개 이상 20개 이하 알파벳 소문자로 이루어짐
// 참가자 중에는 동명이인 있을 수 있음

// 컴플리션에 있는 1명씩을 참자가 명단에서 비교하면서, 컴플리션=참가자일 경우 완주자 수를 1개씩 늘리고
// 참가자 명단에서는 그 명단을 지워버리고.
// 그렇게 완주자 수가 실제 완주자 수와 동일하게 되는 순간 참여자에 남은 명단 1사람을 리턴하게 하는건 어떨까?

import java.util.Arrays;
import java.util.List;

public class Solution {
  public String solution(String[] participant, String[] completion) {
    String answer = "";

    List<String> participants = Arrays.stream(participant).toList();

    int count = 0;
    for (int i = 0; i < completion.length; i += 1) {
      for(int j = 0; j < participant.length; j += 1) {
       if (completion[i].equals(participants.get(j))) {
         participants.remove(j);
       }
      }
    }
    return answer;
  }
}