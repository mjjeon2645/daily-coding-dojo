import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void sample() {
        Solution solution = new Solution();

        assertArrayEquals(new int[]{5, 10}, solution.solution(new int[]{5, 9, 7, 10}, 5));
        assertArrayEquals(new int[]{1, 2, 3, 36}, solution.solution(new int[]{2, 36, 1, 3}, 1));
        assertArrayEquals(new int[]{-1}, solution.solution(new int[]{3, 2, 6}, 10));
    }
}
