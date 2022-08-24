import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
  public int[] solution(int[] answers) {
    int[] person1 = new int[]{1, 2, 3, 4, 5};
    int[] person2 = new int[]{2, 1, 2, 3, 2, 4, 2, 5};
    int[] person3 = new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

    int countPerson1 = 0;
    int countPerson2 = 0;
    int countPerson3 = 0;

    for (int i = 0; i < answers.length; i += 1) {
      if (answers[i] == person1[i % 5]) {
        countPerson1 += 1;
      }

      if (answers[i] == person2[i % 8]) {
        countPerson2 += 1;
      }

      if (answers[i] == person3[i % 10]) {
        countPerson3 += 1;
      }
    }

    int[] tempArray = {countPerson1, countPerson2, countPerson3};

    Arrays.sort(tempArray);

    int maxCount = tempArray[2];

    List<Integer> lists = new ArrayList<>();
    if (countPerson1 == maxCount) {
      lists.add(1);
    }

    if (countPerson2 == maxCount) {
      lists.add(2);
    }

    if (countPerson3 == maxCount) {
      lists.add(3);
    }

    int[] answer = new int[lists.size()];

    for (int i = 0; i < lists.size(); i += 1) {
      answer[i] = lists.get(i);
    }

    return answer;
  }
}
