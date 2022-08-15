// 나누어 떨어지게 하는 수들 중에서 가장 작은 수는 1, 그 다음 수는 2 이상일것인데
// (1) 만약 두번째로 작은 약수가 2라면 그 다음 큰 수를 정해서 그 수에서 1을 뺀 것을 리턴
// (2) 만약 두번째로 작은 약수가 2가 아니라면 그 수에서 1을 뺀 것을 리턴

import java.util.ArrayList;
import java.util.List;
public class Solution2{
    public int solution2 (int n){
    List<Integer> collections = new ArrayList<>();

    for (int i = 1; i <= n; i += 1) {
      if (n % i == 0) {
        collections.add(i);
        continue;
      }
    }
      int number = collections.get(1);

      if (number == 2) {
        return number + 1;
      }
      return number - 1;
    }
  }


