import static java.lang.Math.pow;

public class Solution {
  public int solution(int n) {
    int answer = 0;

    int quotation = 0;
    String reversedNumber = "";

    if (n < 3) {
      answer = n;
      return answer;
    }

    while ( n > 0 ) {

      quotation = n / 3;

      reversedNumber += Integer.toString(n % 3);

      n = quotation;

      if (n < 3) {
        reversedNumber += Integer.toString(n);
        break;
      }
    }

    for (int i = 1; i <= reversedNumber.length(); i += 1) {

      int base = Character.getNumericValue(reversedNumber.charAt(i - 1));

      int placeValue = (int) Math.pow(3, reversedNumber.length() - i);

      answer += placeValue * base;
    }

    return answer;
  }
}
