import java.util.*;

public class Sum {
  public int solution(int n) {
    int answer = 0;

   String numberChangedToString = Integer.toString(n);

   for (int i = 0; i < numberChangedToString.length(); i += 1) {
     char extractedNumber = numberChangedToString.charAt(i);
     answer += Character.getNumericValue(extractedNumber);
   }

    System.out.println("Hello Java");

    return answer;
  }
}
