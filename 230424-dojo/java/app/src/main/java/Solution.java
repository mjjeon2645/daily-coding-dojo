import java.util.*;
import java.util.stream.*;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        // 자바에는 큐가 있다...

        Queue<String> cards1Que = new LinkedList<>(Arrays.stream(cards1).collect(Collectors.toList()));
        Queue<String> cards2Que = new LinkedList<>(Arrays.stream(cards2).collect(Collectors.toList()));

        for (String s : goal) {
            if (cards1Que.stream().findFirst().orElse("불일치").equals(s)) {
                cards1Que.poll();
                continue;
            }

            if (cards2Que.stream().findFirst().orElse("불일치").equals(s)) {
                cards2Que.poll();
                continue;
            }

            return "No";
        }

        return "Yes";
    }
}
