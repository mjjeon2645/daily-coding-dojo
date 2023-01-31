import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void sample() {
        Solution solution = new Solution();

        assertArrayEquals(new int[]{1, 1, 27}, solution.solution(new String[]{"X591X","X1X5X","X231X", "1XXX1"}));
        assertArrayEquals(new int[]{-1}, solution.solution(new String[]{"XXX","XXX","XXX"}));
    }
}
