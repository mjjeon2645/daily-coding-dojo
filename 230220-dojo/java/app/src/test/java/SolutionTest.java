import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void sample() {
        Solution solution = new Solution();

        assertEquals(3, solution.solution(6, new int[]{1, 3, 2, 5, 4, 5, 2, 3}));
        assertEquals(2, solution.solution(4, new int[]{1, 3, 2, 5, 4, 5, 2, 3}));
        assertEquals(1, solution.solution(2, new int[]{1, 1, 1, 1, 2, 2, 2, 3}));
    }
}
