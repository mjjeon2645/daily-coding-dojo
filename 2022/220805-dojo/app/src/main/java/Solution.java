// 1. 총 개수 4, 종류 3, 2마리 뽑는데 맥스 종류 = 2
// 2. 총 개수 6, 종류 3, 3마리 뽑는 데 맥스 종류 = 3
// 3. 총 개수 6, 종류 2, 3마리 뽑는데 맥스 종류 = 2
// 가정. 3마리 뽑는데 종류가 5개면?

import java.util.Arrays;

public class Solution {
  public int solution(int[] nums) {
    int answer = 0;

    int choiceNumber = nums.length / 2;

    int[] newArray = Arrays.stream(nums).distinct().toArray();

    if (choiceNumber <= newArray.length) {
      answer = choiceNumber;
    }

    if (choiceNumber > newArray.length) {
      answer = newArray.length;
    }

    return answer;
  }
}
