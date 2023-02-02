import java.util.*;

class Solution {
    public int solution(int N) {
        // Implement your solution here

        String binaryNumber = converter(N);

        List<Integer> indexesOfOne = new LinkedList<>();

        for (int i = 0; i < binaryNumber.length(); i += 1) {
            if (binaryNumber.charAt(i) == '1') {
                indexesOfOne.add(i);
            }
        }

        if (indexesOfOne.size() < 2) {
            return 0;
        }

        int maxCountsOfZero = 0;

        for (int i = 1; i < indexesOfOne.size(); i += 1) {
            maxCountsOfZero = Math.max(maxCountsOfZero, indexesOfOne.get(i) - indexesOfOne.get(i - 1) - 1);
        }

        return maxCountsOfZero;
    }

    public String converter(int original) {
        String binaryNumber = "";

        int dividend = original;
        int remain = 0;

        while (dividend > 0) {
            remain = dividend % 2;
            dividend /= 2;

            binaryNumber = remain + binaryNumber;
        }

        return binaryNumber;
    }
}
