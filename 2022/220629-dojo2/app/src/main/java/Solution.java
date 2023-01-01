import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Solution {
  public int solution(int n) {
    int answer = 0;
    int i = 1;
    List<Integer> numbers = new ArrayList<>();

    while ( i <= n ) {
      if (n % i == 0) {
       numbers.add(i);
      }

      i += 1;
    }

    for (int j = 0; j < numbers.size(); j += 1) {
      answer += numbers.get(j);
    }

    return answer;
  }
}
