import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void sample() {
        Solution solution = new Solution();

        assertEquals(3, solution.solution(8, 4, 7));
    }

    @Test
    void validation() {
        Solution solution = new Solution();

        assertTrue(solution.validation(1, 2));
        assertFalse(solution.validation(4, 7));
    }

    @Test
    void renumbering() {
        Solution solution = new Solution();

        assertEquals(2, solution.renumbering(4));
        assertEquals(4, solution.renumbering(7));
    }
}
