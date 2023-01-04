import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void sample() {
        Solution solution = new Solution();

        assertEquals(5, solution.solution(5, new int[]{2, 4}, new int[]{1, 3, 5}));
        assertEquals(4, solution.solution(5, new int[]{2, 4}, new int[]{3}));
        assertEquals(2, solution.solution(3, new int[]{3}, new int[]{1}));
        assertEquals(5, solution.solution(5, new int[]{3}, new int[]{3}));
        assertEquals(5, solution.solution(5, new int[]{4, 2}, new int[]{3, 5}));
        assertEquals(5, solution.solution(5, new int[]{1, 2, 3, 4, 5}, new int[]{1, 2, 3, 4, 5}));
    }
}
