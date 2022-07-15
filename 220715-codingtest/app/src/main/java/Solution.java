import java.util.ArrayList;
import java.util.List;

class Solution {
  public int[] solution(int N, int[] stages) {
    int[] answer = new int[N];
    float[] failRate = new float[N];

    int people = stages.length;
    int accumulator = 0;

    for(int i = 0; i < N; i += 1) {
      for (int j = 0; j < stages.length; j += 1) {
        if (stages[j] == (i + 1)) {
          accumulator += 1;
        }
        failRate[i] = accumulator / people;
        people -= accumulator;
        accumulator = 0;

        if (people == 0) {
          people = 1;
          // TODO. 남은 배열이 있다면 그 자리에 모두 0을 집어넣고 탈출
        }
      }
    }




    return answer;
  }
}





//    List<Integer> stagesLists = new ArrayList<>();
//
//    for (int stage : stages) {
//      stagesLists.add(stage);
//    }
//
//    int people = stages.length;
//
//    for (int i = 0; i < N; i += 1) {
//      int finalI = i;
//      int number = (int) stagesLists.stream().filter(num -> num == (finalI + 1)).count();
//
//      failRate[i] = number / people;
//
//      people -= number;
//    }
//
//
//
//
//    for (int i = 1; i <= N + 1; i += 1) {
//
//    }