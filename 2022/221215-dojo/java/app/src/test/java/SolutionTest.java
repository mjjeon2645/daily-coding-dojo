import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void sample() {
        Solution solution = new Solution();

        assertEquals(8, solution.solution(6));
        assertEquals(4, solution.solution(16));
        assertEquals(-1, solution.solution(626331));
    }
}
