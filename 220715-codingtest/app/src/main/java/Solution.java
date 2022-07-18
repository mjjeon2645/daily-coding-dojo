import java.sql.Array;
import java.util.*;
import java.util.stream.Collectors;

class Solution {
  public int[] solution(int N, int[] stages) {
    int[] answer = new int[N];
    int people = stages.length;
    int failPeople = 0;
    double failRate= 0;

    Map<Integer, Double> failRates = new HashMap<>();

    List<Integer> stageLists = Arrays.stream(stages).boxed().toList();

    for (int i = 1; i <= N; i += 1) {
      failPeople = Collections.frequency(stageLists, i);

      if (failPeople != 0) {
        failRate = (double) failPeople / people;
        people -= failPeople;
      }

      if (failPeople == 0) {
        failRate = 0;
      }

      failRates.put(i, failRate);
    }

    List<Integer> keyLists = new ArrayList<>(failRates.keySet());

    Collections.sort(keyLists, (val1, val2) -> failRates.get(val2).compareTo(failRates.get(val1)));

    int i = 0;
    for (Integer key : keyLists) {
      answer[i] = key;
    i += 1;
    }

    return answer;
  }
}
