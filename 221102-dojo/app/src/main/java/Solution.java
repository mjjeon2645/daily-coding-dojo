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
        // 스택이 비어있지 않으면서 스택의 가장 마지막 요소가 현재 요소와 같지 않으면 들어가기
        if (stack.peek() != selectedCharacter) {
          stack.push(selectedCharacter);
          continue;
        }

          if (i + 1 == s.length()) {
            if (stack.peek() == selectedCharacter) {
              stack.pop();
              break;
            }
          }

          System.out.println(stack.peek());

          answer = stack.empty() ? 1 : 0;
        }
      }
      return answer;
    }
  }
