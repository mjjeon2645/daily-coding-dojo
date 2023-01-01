import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void sample() {
        Solution solution = new Solution();

        assertArrayEquals(new int[]{1, 3, 0, 1}, solution.solution(new int[]{1, 1, 3, 3, 0, 1, 1}));
        assertArrayEquals(new int[]{4, 3}, solution.solution(new int[]{4, 4, 4, 3, 3}));
    }
}
