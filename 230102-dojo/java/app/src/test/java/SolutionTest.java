import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void sample() {
        Solution solution = new Solution();
        assertEquals(14, solution.solution(new int[]{1, 2, 3, 4, 6, 7, 8, 0}));
        assertEquals(6, solution.solution(new int[]{5, 8, 4, 0, 6, 7, 9}));
    }
}
