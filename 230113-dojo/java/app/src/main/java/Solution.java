import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        int sumOfArray = Arrays.stream(d).sum();

        if (sumOfArray <= budget) {
            return d.length;
        }

        return process(d, budget);
    }

    public int process(int[] d, int budget) {
        Arrays.sort(d);

        for (int i = 0; i < d.length; i += 1) {
            budget -= d[i];

            if (budget > 0) {
                continue;
            }

            if (budget == 0) {
                return i + 1;
            }

            return i;
        }

        return 0;
    }
}
