import java.util.*;

class Solution {
  public int[] solution(int brown, int yellow) {
    int[] answer = {};

    int total = brown + yellow;

    List<Integer> divisors = findDivisors(total);

    for (int i = 0; i < divisors.size(); i += 1) {
      for (int j = 0; j < divisors.size(); j += 1) {
        // 0번째 조건. 가로 길이(i에 해당하는 약수)가 세로의 길이(j에 해당하는 약수)보다 길거나 같음
        int garo = divisors.get(i);
        int sero = divisors.get(j);

        if (garo < sero) {
          continue;
        }

        // 1번째 조건. 두 약수의 곱이 brown + yellow와 동일한가? 아니면 패쓰.
        int multipleNumber = garo * sero;

        if (multipleNumber != brown + yellow) {
          continue;
        }

        if (garo - 2 <= 0 || sero - 2 <= 0) {
          continue;
        }

        // 2번째 조건. 브라운 색깔
        int onlyBrownSquare = multipleNumber - ((garo - 2) * (sero - 2));
        if (onlyBrownSquare < 8 || onlyBrownSquare > 5000) {
          continue;
        }

        // 3번째 조건. 노란색 색깔
        int onlyYellowSquare = (garo - 2) * (sero - 2);
        if (onlyYellowSquare < 1 || onlyYellowSquare > 2000000) {
          continue;
        }

        answer = new int[]{garo, sero};

        return answer;
      }
    }
    return null;
  }

  public List<Integer> findDivisors(int total) {

    List<Integer> lists = new ArrayList<>();

    int sqrt = (int) Math.sqrt(total);

    for (int i = 1; i <= sqrt; i += 1) {
      if (total % i == 0) {
        lists.add(i);
        if (total / i != i) {
          lists.add(total / i);
        }
      }
    }

    lists.sort(Comparator.naturalOrder());

    return new ArrayList<>(lists);
  }
}
