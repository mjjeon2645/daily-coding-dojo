import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
  public int solution(int n, int[] lost, int[] reserve) {
    int answer = 0;

    // 찐으로 빌려줄 수 있는 학생 목록 만들기
    int[] possibleGroup = new int[lost.length * 2];

    for (int i = 0; i < lost.length; i += 1) {
      possibleGroup[i] = lost[i] - 1;
      possibleGroup[i + lost.length] = lost[i] + 1;
    }

    List<Integer> possiblePeople = new ArrayList<>();

    for (int i = 0; i < possibleGroup.length; i += 1) {
      if (possibleGroup[i] < 1 || possibleGroup[i] > n) {
        continue;
      }

      possiblePeople.add(possibleGroup[i]);

      for (int j = 0; j < reserve.length; j += 1) {
        if (possibleGroup[i] == reserve[j]) {
          possiblePeople.remove(reserve[j]);
        }
      }
    }

    return answer;
  }
}
