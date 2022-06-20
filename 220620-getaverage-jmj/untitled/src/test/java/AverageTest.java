import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AverageTest {
  @Test
  void run() {
    Average average = new Average();

    int[] array = { 1, 2, 3, 4 };
    assertEquals(2.5, average.solution(array));

  }
}
