import java.util.*;

class Solution {
  public int[] solution(int n, String[] words) {
    int[] answer = new int[]{0, 0};

    Stack<String> rightWords = new Stack<>();
    for(int i = 0; i < words.length; i += 1) {
      // index가 0일 경우 무조건 add
      if (i == 0) {
        rightWords.push(words[i]);
        continue;
      }

      if (rightWords.contains(words[i])) {
        int person = (i % n) + 1;
        int turn = (i / n) + 1;

        return new int[]{person, turn};
      }

      // 중복된 문자는 없고
      if (!rightWords.contains(words[i])) {
        // 그런데 첫번째 턴 사람이면서 마지막 글자로 얘기를 안한경우면 리턴


        if (i % n == 0 && rightWords.peek().charAt()) {
          int person = (i % n) + 1;
          int turn = (i / n) + 1;

          return new int[]{person, turn};
        }

        rightWords.add(words[i]);
        continue;
      }
    }
    return answer;
  }
}
