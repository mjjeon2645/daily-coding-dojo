public class Solution {
  public String solution(String s, int n) {
    String answer = "";

    String table1 = "abcdefghijklmnopqrstuvwxyz";
    String table2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    String[] words = s.split("");
    String[] words1 = table1.split("");
    String[] words2 = table2.split("");

    for (int i = 0; i < s.length(); i += 1) {
      if (words[i].equals(" ")) {
        answer += " ";
        continue;
      }

      for (int j = 0; j < words1.length; j += 1) {
        if (words[i].equals(words1[j])) {
          int indexNumber = j;
          int realIndex = 0;

          if (indexNumber + n <= 25) {
            realIndex = indexNumber + n;
          }

          if (indexNumber + n > 25) {
            realIndex = (indexNumber + n - 1) % 25;
          }

          answer += words1[realIndex];
        }
      }

      for (int j = 0; j < words2.length; j += 1) {
        if (words[i].equals(words2[j])) {
          int indexNumber = j;
          int realIndex = 0;

          if (indexNumber + n <= 25) {
            realIndex = indexNumber + n;
          }

          if (indexNumber + n > 25) {
            realIndex = (indexNumber + n - 1) % 25;
          }

          answer += words2[realIndex];
        }
      }
    }
    return answer;
  }
}
