class Solution2 {
  static int[] result = { -1 };
  static int[] lion;
  // 우선 이 max값이 뭔지는 잘 모르겠으므로 그냥 음흠 하고 넘어가자.
  static int max = -1000;

  // DFS는 완전탐색이라고 함
  public void dfs(int[] info, int cnt, int n) {
    if(cnt == n + 1) {
      int apeach_point = 0;
      int lion_point = 0;
      for(int i = 0; i <= 10; i += 1) {
        if(info[i] != 0 || lion[i] != 0) {
          if(info[i] < lion[i]) {
            lion_point += 10 - i;
          }
          if (info[i] >= lion[i]) {
            apeach_point += 10 - i;
          }
        }
      }
      if (lion_point > apeach_point) {
        if (lion_point - apeach_point >= max) {
          result = lion.clone();
          max = lion_point - apeach_point;
        }
      }
      return ;
    }

    // for문 반복조건 안에 조건이라....
    for(int j = 0; j <= 10 && lion[j] <= info[j]; j += 1) {
      lion[j] += 1;
      dfs(info, cnt + 1, n);
      lion[j] -= 1;
    }
  }
  public int[] solution(int n, int[] info) {
    lion = new int[11];
    dfs(info, 1, n);
    return result;
  }
}

// 참고
// https://velog.io/@qodlstjd12/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4-Kakao-%EC%96%91%EA%B6%81-%EB%8C%80%ED%9A%8C-Java
