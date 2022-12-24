import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];

        Map<Integer, Double> map = new LinkedHashMap<>();

        for (int i = 1; i <= N; i += 1) {
            int index = i;
            double usersAtStage = Arrays.stream(stages)
                .filter(value -> value == stages[index])
                .toArray().length;

            map.put(index, usersAtStage / (double) N);
        }

        return answer;
    }
}
