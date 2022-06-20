import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AverageTest {
  @Test
  void creation() {
    Average average = new Average();
    int[] array = { 1, 2, 3, 4 };
    assertEquals(5, average.solution(array));
  }
}
