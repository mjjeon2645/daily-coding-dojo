import java.util.*;

class Solution {
  public int[] solution(int n, int[] info) {
    int[] answer = {};

    int totalScoreOfApeach = apeachTotalScore(info);

    int[] result = process(n, info);

    answer = result;

    return answer;
  }

  public int apeachTotalScore(int[] info) {

    return 0;
  }

  public int[] process(int n, int[] info) {
    int[] lose = {-1};

    // 어피치가 10점을 1개라도 맞춰버리면 뭔짓을 해도 이길수가 없음
    if (info[0] == n) {
      return lose;
    }

    return null;
  }
}
