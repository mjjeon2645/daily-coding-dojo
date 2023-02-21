import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void sample() {
        Solution solution = new Solution();

        assertEquals(2, solution.solution(new int[]{1, 2, 1, 3, 1, 4, 1, 2}));
        assertEquals(0, solution.solution(new int[]{1, 2, 3, 1, 4}));
    }
}
