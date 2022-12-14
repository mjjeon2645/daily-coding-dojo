import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void trueCase() {
        Solution solution = new Solution();

        assertTrue(solution.solution(10));
        assertTrue(solution.solution(12));
        assertTrue(solution.solution(1));
        assertTrue(solution.solution(2));
        assertTrue(solution.solution(100));
        assertTrue(solution.solution(201));
        assertTrue(solution.solution(1008));
        assertTrue(solution.solution(21));
    }

    @Test
    void falseCase() {
        Solution solution = new Solution();

        assertFalse(solution.solution(11));
        assertFalse(solution.solution(13));
    }
}
