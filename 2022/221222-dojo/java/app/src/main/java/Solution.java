import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<>();

        for (int number : arr) {
            if (stack.empty()) {
                stack.push(number);
                continue;
            }

            if (!stack.peek().equals(number)) {
                stack.push(number);
            }
        }

        int[] newArray = new int[stack.size()];

        for (int i = newArray.length - 1; i >= 0; i -= 1) {
            newArray[i] = stack.pop();
        }

        return newArray;
    }
}
