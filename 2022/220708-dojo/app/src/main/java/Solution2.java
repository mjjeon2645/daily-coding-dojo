public class Solution2 {
  public String[] solution(int n, int[] array1, int[] array2) {

    String[] answer = new String[n];

    String[] binaryNumberMap1 = new String[n];
    String[] binaryNumberMap2 = new String[n];

    // array1의 각 요소들을 2진수로 변경

    for (int i = 0; i < n; i += 1) {
      String binaryNumber = "";

      int dividend = array1[i];

      while (dividend > 0) {
        int remainder = dividend % 2;

        binaryNumber = remainder + binaryNumber;

        dividend /= 2;
      }

      while (binaryNumber.length() < n) {
        binaryNumber = "0" + binaryNumber;
      }

      binaryNumberMap1[i] = binaryNumber;
    }

    // array2의 각 요소들을 2진수로 변경

    for (int i = 0; i < n; i += 1) {
      String binaryNumber = "";

      int dividend = array2[i];

      while (dividend > 0) {
        int remainder = dividend % 2;

        binaryNumber = remainder + binaryNumber;

        dividend /= 2;
      }

      while (binaryNumber.length() < n) {
        binaryNumber = "0" + binaryNumber;
      }

      binaryNumberMap2[i] = binaryNumber;
    }

    // map1, 2 완성. 해당 맵을 가지고 secret 맵 만들기

    for (int i = 0; i < n; i += 1) {
      String secretMapElement = "";

      for (int j = 0; j < n; j += 1) {
        secretMapElement = secretMapElement + (
            binaryNumberMap1[i].charAt(j) == '0' &&
                binaryNumberMap2[i].charAt(j) == '0' ?
                " " :
                "#"
        );
      }
      answer[i] = secretMapElement;
    }

    return answer;
  }
}
