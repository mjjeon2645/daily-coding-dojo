import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int sum = Arrays.stream(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}).sum();

        return sum - Arrays.stream(numbers).sum();
    }
}
