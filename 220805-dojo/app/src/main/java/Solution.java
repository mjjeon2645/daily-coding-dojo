import java.util.Arrays;

public class Solution {
  public int solution(int[] nums) {
    int answer = 0;

    // 0. 총 N/2마리(nums 배열의 길이의 절반)를 가지고 갈 수 있으므로 N/2부터 구해준다.
    int choiceNumber = nums.length / 2;

    // 1. nums의 중복을 없애준다. -> 어차피 내가 선택하는 것은 '종류'이므로

    int[] newArray = Arrays.stream(nums).distinct().toArray();

    // 2. 중복을 없앤 새로운 배열을 오름차순으로 정리..? (필요한 과정인가?). 우선 필요없을 것 같아 패스.

    // 3. 새로운 배열의 길이에서 N/2만킁을 선택하는 경우의 수. 수학시간에 배운 numCnum. 해당 숫자 리턴

    int dividend = 1;
    for (int i = newArray.length; i > newArray.length - choiceNumber; i -= 1) {
      dividend *= i;
    }

    int base = 1;
    for (int i = choiceNumber; i > 1; i -= 1) {
      base *= 1;
    }

    answer = dividend / base;

    return answer;
  }
}
