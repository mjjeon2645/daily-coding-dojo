import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void sample() {
        Solution solution = new Solution();

        assertEquals("Yes", solution.solution(
            new String[]{"i", "drink", "water"},
            new String[]{"want", "to"},
            new String[]{"i", "want", "to", "drink", "water"}
        ));

        assertEquals("No", solution.solution(
            new String[]{"i", "water", "drink"},
            new String[]{"want", "to"},
            new String[]{"i", "want", "to", "drink", "water"}
        ));
    }
}
