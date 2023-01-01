import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CodingDojoTest {
  @Test
  void simpleTest() {
    CodingDojo codingDojo = new CodingDojo();

    int[] array = new int[]{1};

    int[] answer = codingDojo.solution(array);

    assertArrayEquals(new int[]{-1}, answer);
  }

  @Test
  void sampleTest() {
    CodingDojo codingDojo = new CodingDojo();

    int[] array = new int[]{4, 3, 2, 1};

    int[] answer = codingDojo.solution(array);

    assertArrayEquals(new int[]{4, 3, 2}, answer);
  }

  @Test
  void sampleTest2() {
    CodingDojo codingDojo = new CodingDojo();

    int[] array = new int[]{6, 8, 11, 4, 3, 2, 1};

    int[] answer = codingDojo.solution(array);

    assertArrayEquals(new int[]{6, 8, 11, 4, 3, 2}, answer);
  }
}
