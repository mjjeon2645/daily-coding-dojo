import java.util.*;

class Solution {
  public int[] solution(int[] lottos, int[] win_nums) {
    int[] answer = {};

    int minWinGrade = 7;
    int maxWinGrade = 7;

    Arrays.sort(lottos);
    Arrays.sort(win_nums);

    for (int i = 0; i < lottos.length; i += 1) {
      if (lottos[i] == 0) {
        maxWinGrade -= 1;
        continue;
      }

      for (int j = 0; j < win_nums.length; j += 1) {
        if (lottos[i] == win_nums[j]) {
          minWinGrade -= 1;
          maxWinGrade -= 1;
          break;
        }
      }
    }

    if (minWinGrade > 6) {
      minWinGrade = 6;
    }

    if (maxWinGrade > 6) {
      maxWinGrade = 6;
    }

    answer = new int[]{maxWinGrade, minWinGrade};

    return answer;
  }
}
