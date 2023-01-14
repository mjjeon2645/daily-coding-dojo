import java.util.*;

class Solution {
    public int solution(int[] nums) {
        Set<Integer> noDuplicatedItems = new LinkedHashSet<>();

        for (int number : nums) {
            noDuplicatedItems.add(number);
        }

        int options = noDuplicatedItems.size();
        int amountToGet = nums.length / 2;

        return Math.min(options, amountToGet);
    }
}
