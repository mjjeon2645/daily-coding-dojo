import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void sample() {
        Solution solution = new Solution();

        assertEquals(5, solution.solution(1041));
        assertEquals(2, solution.solution(9));
        assertEquals(1, solution.solution(20));
        assertEquals(4, solution.solution(529));
        assertEquals(1, solution.solution(11));
        assertEquals(0, solution.solution(15));
        assertEquals(0, solution.solution(32));
    }

    @Test
    void converter() {
        Solution solution = new Solution();

        assertEquals("1011", solution.converter(11));
        assertEquals("1010", solution.converter(10));
    }
}
