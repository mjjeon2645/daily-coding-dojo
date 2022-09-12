// 각 유저는 한번에 한 명의 유저를 신고 가능(신고 횟수에 제한 없음)
// k번 이상 신고된 유저는 게시판 이용 정지
// 해당 유저를 신고한 모든 사람들에게 정지사실을 메일로 발송
// 유저가 신고한 모든 내용을 취합하여 마지막에 한꺼번에 게시판 이용을 정시시키면서 메일 발송
// 첫번째 해야할 일. report에서 중복되는 것들을 모두 지워주자
// => 왜냐면 한 사람이 같은 신고를 여러번 하더라도 1회로 취급하니까.


import java.util.*;

public class Solution {

  public int[] solution(String[] id_list, String[] report, int k) {
    int[] answer = {};

    // 1. report에서 중복되는 것들 지워주기 => 해쉬셋을 이용해서만 중복을 지워줄 수 있을까..? 너무 어렵다.
    // 차라리 리스트화 시키면서 예외를 처리해주는건 어때? 아래처럼 구현함

    List<String> realReports = removeDuplicateReports(report);
    for (int i = 0; i < realReports.size(); i += 1) {
    }
    // 2. 중복을 지웠으니 뭘 할까? 신고 당한 사람이 몇번 신고당했는지 카운트해서 새로운 뭔가를 만들어볼까?
    // => 예를들면 순서를 가진 해시맵 같은거 (key는 id_list의 순서를 따르고, 밸류는 신고당한 횟수)
    // 순서: 해시맵 선언, key:value put하기(value값 구하는게 우선이겠구나.)


    LinkedHashMap<String, Long> maps = new LinkedHashMap<>();
    for (String id : id_list) {
      maps.put(id, 0L);
    }

    LinkedHashMap<String, Long> reportedMaps = counter(realReports, maps);

    return answer;
  }

  public List<String> removeDuplicateReports(String[] report) {
    HashSet<String> filter = new HashSet<>();

    Collections.addAll(filter, report);

    return filter.stream().toList();
  }

  public LinkedHashMap<String, Long> counter(
      List<String> realReports, LinkedHashMap<String, Long> maps) {

    for (int i = 0; i < realReports.size(); i += 1) {
      String[] words = realReports.get(i).split(" ");
      Long originalValue = maps.get(words[1]);
      maps.put(words[1], originalValue + 1);
    }

    return maps;
  }
}
