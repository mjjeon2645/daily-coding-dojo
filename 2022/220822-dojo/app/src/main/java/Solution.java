import java.util.Arrays;

public class Solution {
  public int[] solution(int[] array, int[][] commands) {
    int[] answer = new int[commands.length];

    for (int i = 0; i < commands.length; i += 1) {
      int tempArraySize = commands[i][1] - commands[i][0] + 1;
      int startIndex = commands[i][0] - 1;
      int[] tempArray = new int[tempArraySize];

      for (int j = 0; j < tempArray.length; j += 1) {
        tempArray[j] = array[startIndex + j];
      }

      int[] newArray = Arrays.stream(tempArray).sorted().toArray();

      int selectIndex = commands[i][2] - 1;

      answer[i] = newArray[selectIndex];
    }

    return answer;
  }
}
