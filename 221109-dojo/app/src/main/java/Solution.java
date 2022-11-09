import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        int heavyIndex = people.length - 1;
        int lightIndex = 0;

        int[] sortedArray = sort(people);

        while(heavyIndex >= lightIndex) {
            answer += 1;

            if (sortedArray[heavyIndex] + sortedArray[lightIndex] <= limit) {
                lightIndex += 1;
            }

            heavyIndex -= 1;
        }

        return answer;
    }

    public int[] sort(int[] people) {
        return Arrays.stream(people).sorted().toArray();
    }
}
