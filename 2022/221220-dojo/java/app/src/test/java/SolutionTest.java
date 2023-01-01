import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void sample() {
        Solution solution = new Solution();

        assertEquals(10L, solution.solution(3, 20, 4));
    }

    @Test
    void calculate() {
        Solution solution = new Solution();

        assertEquals(30, solution.calculate(3, 4));
        assertEquals(600, solution.calculate(100, 3));
    }
}
