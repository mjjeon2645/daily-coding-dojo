class Solution {
  public String[] solution(int n, int[] arr1, int[] arr2) {
    String[] answer = {};
    arr1 = new int[n];
    String[] newArray1 = new String[n];

    for (int i = 0; i < n; i += 1) {
      int dividend = arr1[i];
      String number = "";

      while (dividend > 0) {
        number = dividend % 2 + number;
        dividend /= 2;
      }

      if (number.length() == 5) {
        newArray1[i] = number;
      }

      if (number.length() != 5) {
        while (number.length() < 5) {
          number = "0" + number;
        }
        newArray1[i] = number;
      }
    }

    arr2 = new int[n];
    String[] newArray2 = new String[n];

    for (int i = 0; i < n; i += 1) {
      int dividend = arr2[i];
      String number = "";

      while (dividend > 0) {
        number = dividend % 2 + number;
        dividend /= 2;
      }

      if (number.length() == 5) {
        newArray2[i] = number;
      }

      if (number.length() != 5) {
        while (number.length() < 5) {
          number = "0" + number;
        }
        newArray2[i] = number;
      }
    }

    for (int i = 0; i < n; i += 1) {
      String answerString = "";

      for (int j = 0; j < n; j += 1) {
        answerString = "";
        char a = newArray1[i].charAt(j);
        char b = newArray2[i].charAt(j);

        if (a == b && b == '0') {
          answerString += " ";
        }
        answerString += "#";
      }
      answer[i] = answerString;
    }
    return answer;
  }
}
