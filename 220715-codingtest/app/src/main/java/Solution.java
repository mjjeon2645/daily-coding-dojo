import java.util.ArrayList;
import java.util.List;

class Solution {
  public int[] solution(int N, int[] stages) {
    int[] answer = new int[N];
    float[] failRate = new float[N];

    List<Integer> stagesLists = new ArrayList<>();

    for (int stage : stages) {
      stagesLists.add(stage);
    }

    int people = stages.length;

    for (int i = 0; i < N; i += 1) {
      int finalI = i;
      int number = (int) stagesLists.stream().filter(num -> num == (finalI + 1)).count();

      failRate[i] = number / people;

      people -= number;
    }




    for (int i = 1; i <= N + 1; i += 1) {

    }

    return answer;
  }
}
