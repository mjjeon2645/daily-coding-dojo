import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void sample() {
        Solution solution = new Solution();

        assertEquals(43, solution.solution(13, 17));
        assertEquals(52, solution.solution(24, 27));
    }
}
