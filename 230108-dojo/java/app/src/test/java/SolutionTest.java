import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void sample() {
        Solution solution = new Solution();

        assertEquals(6, solution.solution(16));
        assertEquals(16, solution.solution(2554));
        assertEquals(2, solution.solution(99));
        assertEquals(2, solution.solution(999));
        assertEquals(2, solution.solution(99999999));
        assertEquals(2, solution.solution(101));
        assertEquals(1, solution.solution(1));
        assertEquals(6, solution.solution(95));
        assertEquals(7, solution.solution(85));
    }
}
