public class Solution {
  public long solution(int n) {
    long answer = 0;

    String reversedNumber = transferFromDecimal(n);

    answer = toDecimalNumber(reversedNumber);

    return answer;
  }

  public String transferFromDecimal(int decimalNumber) {
    String transferNumber = "";

    while (decimalNumber > 0) {
      int quotation = decimalNumber / 3;

      transferNumber += decimalNumber % 3;

      decimalNumber = quotation;
    }

    return transferNumber;
  }

  public long toDecimalNumber(String reversedNumber) {
    String[] words = reversedNumber.split("");

    long accumulator = 0;

    for (int i = 0; i < words.length; i += 1) {
      accumulator += Long.parseLong(words[i]) * (long) Math.pow(3, words.length - (i + 1));
    }

    return accumulator;
  }
}
