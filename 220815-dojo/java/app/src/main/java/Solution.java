public class Solution {
  public int[] solution(long n) {
    int[] answer = {};

    String number = Long.toString(n);

    String[] tempArray = new String[number.length()];

    for (int i = 0; i < number.length(); i += 1) {
      tempArray[number.length() - i - 1] = number.charAt(i) + "";
    }
    answer = new int[tempArray.length];

    for (int i = 0; i < tempArray.length; i += 1) {
      answer[i] = Integer.parseInt(tempArray[i]);
    }

    return answer;
  }
}
