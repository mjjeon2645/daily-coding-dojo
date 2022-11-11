import java.util.*;

class Solution {
    public int[] solution(String msg) {
        int[] answer = {};

        // 사전 만들기 -> 해쉬맵으로 해보자.
        HashMap<Integer, String> dictionary = new HashMap<>();

        for (int i = 1; i <= 26; i += 1) {
            dictionary.put(i, (char) (24 + i) + "");
        }

        return answer;
    }
}
