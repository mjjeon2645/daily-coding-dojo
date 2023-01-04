import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = {};

        Map<String, List<String>> map = new HashMap<>();

        answer = makeMap(map, id_list, report, k);

        return answer;
    }

    public int[] makeMap(Map<String, List<String>> map, String[] id_list, String[] report, int k) {
        // 1. 동일한 유저를 여러번 신고한 것에 대한 제거 -> array를 set으로 바꿔주기
        Set<String> removeDuplicatedItem = new LinkedHashSet<>();

        Collections.addAll(removeDuplicatedItem, report);

        // 2. 신고당한 id, 그리고 몇번이 신고되었으며 누가 신고했는지를 나타내기. 이 때 k회 미만 신고되었다면 애초에 안더해주는게 나을듯..?
        for (String id : id_list) {
            removeDuplicatedItem.iterator()
        }






        List<String> reportedList = Arrays.stream(report).map(value -> value.split(" ")[1]).toList();

        Map<String, Integer> countMap = new LinkedHashMap<>();

        for (String id : id_list) {
            int size = reportedList.stream().filter(value -> value.equals(id)).toList().size();

            if (size >= k) {
                countMap.put(id, size);
            }
        }

        if (countMap.size() == 0) {
            int[] answer = new int[id_list.length];

            for (int i = 0; i < answer.length; i += 1) {
                answer[i] = 0;
            }

            return answer;
        }

        return new int[4];
    }
}
