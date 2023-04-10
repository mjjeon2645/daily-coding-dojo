import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void sample() {
        Solution solution = new Solution();

        assertEquals(2, solution.solution(8, 4, new int[]{2, 3, 6}));
        assertEquals(1, solution.solution(5, 3, new int[]{1, 3}));
        assertEquals(4, solution.solution(4, 1, new int[]{1, 2, 3, 4}));
    }
}
