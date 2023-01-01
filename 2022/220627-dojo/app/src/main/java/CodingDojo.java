public class CodingDojo {
  public int[] solution(int[] arr) {
    int[] answer = {};

    if (arr.length == 1) {
      answer = new int[]{-1};
      return answer;
    }

    int standardNumber = arr[0];

    for (int i = 0; i < arr.length; i += 1) {
      if (standardNumber > arr[i]) {
        standardNumber = arr[i];
      }
    }

    answer = new int[arr.length - 1];
    int count = 0;

    for (int i = 0; i < arr.length; i += 1) {
      if (arr[i] != standardNumber) {
        answer[count] = arr[i];
        count += 1;
      }
    }
    return answer;
  }
}
