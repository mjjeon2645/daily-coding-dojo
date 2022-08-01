import java.util.ArrayList;
import java.util.List;

class Solution {
  public int[] solution(int[] answers) {
    int[] answer = {};
    int[] person1 = {1,2,3,4,5};
    int[] person2 = {2,1,2,3,2,4,2,5};
    int[] person3 = {3,3,1,1,2,2,4,4,5,5};

    int answer1 = 0;
    int answer2 = 0;
    int answer3 = 0;

    for(int i = 0; i < answers.length; i += 1){
      if (person1[i % person1.length] == answers[i]) {
        answer1 += 1;
      }

      if(person2[i % person2.length] == answers[i]) {
        answer2 += 1;
      }

      if(person3[i % person3.length] == answers[i]) {
        answer3 += 1;
      }
    }

    int max = Math.max(Math.max(answer1, answer2), answer3);

    List<Integer> counts = new ArrayList<>();
    if(max == answer1) {
      counts.add(1);
    }

    if(max == answer2) {
      counts.add(2);
    }

    if(max == answer3) {
      counts.add(3);
    }

    answer = new int[counts.size()];

    for (int i = 0; i < answer.length; i += 1) {
      answer[i] = counts.get(i);
    }

    return answer;
  }
}