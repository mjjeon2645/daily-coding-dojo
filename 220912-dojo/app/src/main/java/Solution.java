// 각 유저는 한번에 한 명의 유저를 신고 가능(신고 횟수에 제한 없음)
// k번 이상 신고된 유저는 게시판 이용 정지
// 해당 유저를 신고한 모든 사람들에게 정지사실을 메일로 발송
// 유저가 신고한 모든 내용을 취합하여 마지막에 한꺼번에 게시판 이용을 정시시키면서 메일 발송
// 첫번째 해야할 일. report에서 중복되는 것들을 모두 지워주자
// => 왜냐면 한 사람이 같은 신고를 여러번 하더라도 1회로 취급하니까.


import java.util.*;
import java.util.stream.*;

public class Solution {

  public int[] solution(String[] id_list, String[] report, int k) {
    int[] answer = {};

    // 1. report에서 중복되는 것들 지워주기 => 해쉬셋을 이용해서만 중복을 지워줄 수 있을까..? 너무 어렵다.
    // 차라리 리스트화 시키면서 예외를 처리해주는건 어때?

    List<String> realReports = removeDuplicateReports(report);

    // 2. 중복을 지웠으니 뭘 할까? 신고 당한 사람이 몇번 신고당했는지 카운트 해볼까?
    // 해쉬셋에 들어간 string을 하나씩 꺼내와서 두번째 string의 갯수를 세어야 함
    // 해쉬셋에 들어간 스트링을 빼오고 -> split으로 쪼갠 배열에서 -> 인덱스 1값만 모아 또다른 배열을 만들기
    // 그 배열에서 각 원소별로 몇 개가 카운트되었는지 유저id 순서대로 배열을 만들자


    return answer;
  }

  public List<String> removeDuplicateReports(String[] report) {
    HashSet<String> filter = new HashSet<>();

    Collections.addAll(filter, report);

    List<String> realReports = filter.stream().toList();

    return realReports;
  }
}
