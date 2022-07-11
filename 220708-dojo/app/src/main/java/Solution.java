import java.util.ArrayList;
import java.util.List;

public class Solution {
  private List<String> maps1;
  private List<String> maps2;

  public String[] solution(int n, int[] array1, int[] array2) {
    String[] answer = new String[n];

    String temp = "";

    for (int j = 0; j < n; j += 1) {
      int number = array1[j];
      int dividend = number;

      int quotation = 0;
      int remainder = 0;
      int base = 2;

      // array1[i]를 2진수로 변환하는 과정
      for (int i = 0; dividend > 0; i += 1) {
        quotation = dividend / base;
        remainder = dividend % base;

        temp += Integer.toString(remainder);

        dividend = quotation;
      }

      String map = "";

      if (temp.length() < n) {
        for (int i = 0; i < n - temp.length(); i += 1) {
          temp += "0";
        }
      }

      StringBuffer stringBuffer = new StringBuffer(temp);
      map = stringBuffer.reverse().toString();

      maps1 = new ArrayList<>();
      maps1.add(map);
    }


    for (int j = 0; j < n; j += 1) {
      int number = array2[j];

      int dividend = number;

      int quotation = 0;
      int remainder = 0;
      int base = 2;

      // array1[i]를 2진수로 변환하는 과정
      for (int i = 0; dividend > 0; i += 1) {
        quotation = dividend / base;
        remainder = dividend % base;

        temp += Integer.toString(remainder);

        dividend = quotation;
      }

      String map = "";

      if (temp.length() < n) {
        for (int i = 0; i < n - temp.length(); i += 1) {
          temp += "0";
        }
      }

      StringBuffer stringBuffer = new StringBuffer(temp);
      map = stringBuffer.reverse().toString();

      maps2 = new ArrayList<>();
      maps2.add(map);
    }

    for (int i = 0; i < n; i += 1) {
      String textFromMaps1 = maps1.get(i);
      String textFromMaps2 = maps2.get(i);
      String tempAnswer = "";

      for (int j = 0; j < n; j += 1) {
        if (textFromMaps1.charAt(j) == 0 && (textFromMaps2.charAt(j)) == 0) {
          tempAnswer += " ";
        }
        tempAnswer += "#";
      }
      answer[i] = tempAnswer;
    }

    return answer;
  }
}
