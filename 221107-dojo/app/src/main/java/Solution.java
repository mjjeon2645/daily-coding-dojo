import java.util.*;

class Solution {
  public int[] solution(int n, String[] words) {
    int[] answer = new int[]{0, 0};

    List<String> rightWords = new ArrayList<>();

    for(int i = 0; i < words.length; i += 1) {
      // index가 0일 경우 무조건 add
      if (i == 0) {
        rightWords.add(words[i]);
        continue;
      }

      // 중복된 문자가 있을 경우 return
      if (rightWords.contains(words[i])) {
        int person = (i % n) + 1;
        int turn = (i / n) + 1;

        return new int[]{person, turn};
      }

      // 중복된 문자가 없는데 앞사람 단어의 마지막글자를 따라가지 않았을 경우
      char lastCharacterOfLastPersonSaid = words[i - 1].charAt(words[i - 1].length() - 1);
      char firstCharacterOfThisTurnPersonSaid = words[i].charAt(0);
      if (lastCharacterOfLastPersonSaid != firstCharacterOfThisTurnPersonSaid) {
        int person = (i % n) + 1;
        int turn = (i / n) + 1;

        return new int[]{person, turn};
      }

      rightWords.add(words[i]);
    }
    return answer;
  }
}
