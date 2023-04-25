import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < players.length; i += 1) {
            map.put(players[i], i);
        }

        for (String calledName : callings) {
            int prevScore = map.get(calledName);

            String prevWinner = players[prevScore - 1];

            map.put(calledName, prevScore - 1);
            map.put(prevWinner, prevScore);

            players[prevScore] = prevWinner;
            players[prevScore - 1] = calledName;
        }

        return players;
    }
}
