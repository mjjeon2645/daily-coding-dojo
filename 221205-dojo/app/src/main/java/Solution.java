import java.util.Stack;

public class Solution {
    public int solution(String s) {
        int answer = 0;
        String newStr = s;

        for (int i = 0; i < s.length(); i++) {
            if (check(newStr)) {
                answer += 1;
            }

            newStr = newStr.substring(1, s.length()) + newStr.charAt(0);
        }

        return answer;
    }

    public boolean check(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i += 1) {
            switch (s.charAt(i)) {
                case '(':
                    stack.push('(');
                    break;
                case '{':
                    stack.push('{');
                    break;
                case '[':
                    stack.push('[');
                    break;
                case ')':
                    if (stack.isEmpty() || stack.peek() != '(') {
                        return false;
                    }
                    stack.pop();
                    break;
                case '}':
                    if (stack.isEmpty() || stack.peek() != '{') {
                        return false;
                    }
                    stack.pop();
                    break;
                case ']':
                    if (stack.isEmpty() || stack.peek() != '[') {
                        return false;
                    }
                    stack.pop();
                    break;
            }
        }
        return stack.isEmpty();
    }
}
