import java.util.*;

class Solution {
  boolean solution(String s) {
    boolean answer = false;

    Stack<Character> stack = new Stack<>();

    for (int i = 0; i < s.length(); i += 1) {
      if (s.charAt(i) == '(') {
        stack.push(s.charAt((i)));
      }

      if (s.charAt(i) == ')') {
        if (stack.empty()) {
          return false;
        }

        if (!stack.empty()) {
          stack.pop();
        }
      }
    }

    if (stack.empty()) {
      answer = true;
    }

    return answer;
  }
}
