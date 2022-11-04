import java.util.*;

class Solution {
  public int solution(String str1, String str2) {
    int answer = 0;

    int countOfSumOfSets = 0;
    int countOfintersection = 0;

    String toLower1 =str1.toLowerCase();
    String toLower2 =str2.toLowerCase();

    // 두 문자열이 같을 때
    if (toLower1.equals(toLower2)) {
      return 65536;
    }

    // 문자열 2개씩 쪼개가면서 list에 넣기

    List<String> listsFromString1 = sliceWord(toLower1);
    List<String> listsFromString2 = sliceWord(toLower2);

    // 둘 다 공집합일 경우 1을 리턴
    if (listsFromString1.size() == 0 && listsFromString2.size() == 0) {
      return 65536;
    }

    // 원소 비교. 합집합

   return answer;
  }

  public List<String> sliceWord(String str) {
    List<String> listsFromString = new ArrayList<>();
    for (int i = 0; i < str.length() - 1; i += 1 ) {
      char word1 = str.charAt(i);
      char word2 = str. charAt(i + 1);

      if ((word1 >= 97 && word1 <= 122) && (word2 >= 97 && word2 <= 122)) {
        listsFromString.add(str.substring(i, i + 2));
      }
    }
    return listsFromString;
  }
}