import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void sample() {
        Solution solution = new Solution();

        assertEquals(7, solution.solution(45));
        assertEquals(229, solution.solution(125));
    }

    @Test
    void reversedTernary() {
        Solution solution = new Solution();

        assertEquals("0021", solution.reversedTernary(45));
        assertEquals("22111", solution.reversedTernary(125));
    }
}
