class Solution {
  public int solution(int n) {
    int countNumberOfOne = countOne(n);

    int largerNumber = n + 1;

    while(true) {
      if (countNumberOfOne == countOne(largerNumber)) {
        return largerNumber;
      }
      largerNumber += 1;
    }
  }

  public int countOne(int number) {
    String binaryNumber = Integer.toBinaryString(number);

    int count = 0;

    for (int i = 0; i < binaryNumber.length(); i += 1) {
      if (binaryNumber.charAt(i) == '0') {
        continue;
      }
      count += 1;
    }

    return count;
  }
}
