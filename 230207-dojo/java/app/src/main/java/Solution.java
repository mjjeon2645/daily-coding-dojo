import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = arr.length - 1; i > 0; i =- 1) {
            while (!stack.isEmpty()) {
                if (stack.peek() > arr[i]) {
                    answer[i] = stack.peek();
                    break;
                } else {
                    stack.pop();
                }
            }
            if (stack.isEmpty()) {
                answer[i] = -1;
            }
            stack.push(arr[i]);
        }
        return answer;
    }
}
