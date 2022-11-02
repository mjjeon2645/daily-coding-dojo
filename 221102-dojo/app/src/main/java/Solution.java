import java.util.*;

class Solution {
  public int solution(String s) {
    int answer = -1;

    Stack<Character> stack = new Stack<>();

    // start
    stack.push(s.charAt(0));
    int count = 0;

    // process
    for (int i = 1; i < s.length(); i += 1) {
      char selectedCharacter = s.charAt(i);

      // 스택이 비어있을 땐 무조건 들어가야 함
      if (stack.empty()) {
        stack.push(selectedCharacter);
        continue;
      }

      if (!stack.empty()) {
        // 스택이 비어있지 않으면서 스택의 가장 마지막 요소가 현재 요소와 같으면 맨 위에거 빼기
        if (stack.peek() == selectedCharacter) {
          stack.pop();
          continue;
        }

        // 스택이 비어있지 않으면서 스택의 가장 마지막 요소가 현재 요소와 다르면 집어넣기
        if (stack.peek() != selectedCharacter) {
          stack.push(selectedCharacter);
        }
      }
    }
    return stack.empty() ? 1 : 0;
  }
}
