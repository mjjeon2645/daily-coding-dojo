import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        // 1. 스택으로 풀어보기
        Stack<Integer> stack = new Stack<>();

        for (int number : arr) {
            if (stack.empty()) {
                stack.push(number);
                continue;
            }

            if (stack.peek() != number) {
                stack.push(number);
            }
        }

        int[] answer = new int[stack.size()];

        for (int i = answer.length - 1; i >= 0; i -= 1) {
            answer[i] = stack.pop();
        }

        return answer;
    }
}
