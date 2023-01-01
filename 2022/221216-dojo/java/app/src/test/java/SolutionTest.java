import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void sample() {
        Solution solution = new Solution();

        assertEquals(144, solution.solution(121));
        assertEquals(-1, solution.solution(3));
        assertEquals(4, solution.solution(1));
        assertEquals(-1, solution.solution(11));
    }
}
