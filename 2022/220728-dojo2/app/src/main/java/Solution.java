import java.util.Arrays;

public class Solution {
  public int solution(int n, int[] lost, int[] reserve) {
    int count = 0;
    Arrays.sort(lost);
    Arrays.sort(reserve);

    for(int i = 0; i < lost.length; i += 1) {
      for(int j = 0; j < reserve.length; j += 1) {
        if(lost[i] == reserve[j]) {
          lost[i] = -1;
          reserve[j] = -1;
          count += 1;
          break;
        }
      }
    }
    for (int i = 0; i < lost.length; i += 1) {
      for (int j = 0; j < reserve.length; j += 1) {
        if(lost[i] == reserve[j]+1 || lost[i] == reserve[j]-1) {
          count += 1;
          reserve[j] = -1;
          break;

        }
      }
    }
    return n - lost.length + count;
  }
}
