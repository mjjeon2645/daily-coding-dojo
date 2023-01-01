import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StarTest {
  @Test
  void star() {
    Star star = new Star();

    assertEquals("*****", star.row(5));
  }
}
