import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
  @Test
  void simpleTest() {
//    전체 학생수 3명. 잃어버린애 1번, 여벌 가져온애 2번.
    Solution solution = new Solution();

    int n = 3;
    int[] lost = new int[]{1};
    int[] reserve = new int[]{2};

    assertEquals(3, solution.solution(3, lost, reserve));
  }
  @Test
  void simpleTest2() {
//    전체 학생수 5명. 잃어버린애 2, 4번, 여벌 가져온애 1, 3, 5번. 결과값 5
    Solution solution = new Solution();

    int n = 5;
    int[] lost = new int[]{2, 4};
    int[] reserve = new int[]{1, 3, 5};

    assertEquals(5, solution.solution(5, lost, reserve));
  }
}
