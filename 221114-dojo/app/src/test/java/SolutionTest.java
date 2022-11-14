import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void sample() {
        Solution solution = new Solution();

        assertEquals(168, solution.solution(new int[]{2, 6, 8, 14}));
        assertEquals(6, solution.solution(new int[]{1, 2, 3}));
        assertEquals(3, solution.solution(new int[]{3}));
        assertEquals(3, solution.solution(new int[]{1, 3}));
        assertEquals(12, solution.solution(new int[]{4, 6}));
    }
}
