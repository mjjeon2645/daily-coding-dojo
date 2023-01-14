import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void sample() {
        Solution solution = new Solution();

        assertEquals(2, solution.solution(new int[]{3, 1, 2, 3}));
        assertEquals(3, solution.solution(new int[]{3, 3, 3, 2, 2, 4}));
        assertEquals(2, solution.solution(new int[]{3, 3, 3, 2, 2, 2}));
    }
}
