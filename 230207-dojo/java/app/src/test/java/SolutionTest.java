import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void sample() {
        Solution solution = new Solution();

        assertArrayEquals(new int[]{2, 3, 3, 5}, solution.solution(new int[]{3, 5, 5, -1}));
        assertArrayEquals(new int[]{9, 1, 5, 3, 6, 2}, solution.solution(new int[]{-1, 5, 6, 6, -1, -1}));
    }
}
