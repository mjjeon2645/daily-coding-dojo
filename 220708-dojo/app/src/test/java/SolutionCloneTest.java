import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionCloneTest {
  @Test
  void sampleTest1() {
    SolutionClone solutionClone = new SolutionClone();
    int n = 5;
    int[] array1 = {9, 20, 28, 18, 11};
    int[] array2 = {30, 1, 21, 17, 28};

    String[] answer = {"#####", "# # #", "### #", "# ##", "#####"};

    Assertions.assertArrayEquals(answer, solutionClone.solution(n, array1, array2));

  }
}
