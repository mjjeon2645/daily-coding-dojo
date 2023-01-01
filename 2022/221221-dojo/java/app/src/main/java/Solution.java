import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {

        return process(d, budget);
    }

    public int process(int[] array, int budget) {
        int[] sortedArray = Arrays.stream(array).sorted().toArray();

        for (int i = 0; i < sortedArray.length; i += 1) {
            budget -= sortedArray[i];

            if (budget == 0) {
                return i + 1;
            }

            if (budget < 0) {
                return i;
            }
        }

        return array.length;
    }
}
