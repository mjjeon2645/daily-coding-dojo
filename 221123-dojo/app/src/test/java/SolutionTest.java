import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void sample() {
        Solution solution = new Solution();

        assertEquals(3, solution.solution(new int[]{3, 0, 6, 1, 5}));
        assertEquals(0, solution.solution(new int[]{0}));
        assertEquals(1, solution.solution(new int[]{4}));
    }
}
