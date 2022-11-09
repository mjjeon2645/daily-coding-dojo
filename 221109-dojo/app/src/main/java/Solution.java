import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;

        int[] sortedArray = sort(people);

        int count = 0;
        int accumulator = 0;

        int index = sortedArray.length - 1;
        int i = 0;

        while (true) {
            accumulator += sortedArray[index];

            if (accumulator >= limit) {
                i = 0;
                index = index - i + 1;
            }
        }

    }

    public int[] sort(int[] people) {
        return Arrays.stream(people).sorted().toArray();
    }
}
