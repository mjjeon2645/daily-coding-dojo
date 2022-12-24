import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void sample() {
        Solution solution = new Solution();

        assertArrayEquals(new int[]{3, 4, 2, 1,5},
            solution.solution(5, new int[]{2, 1, 2, 6, 2, 4, 3, 3}));
        assertArrayEquals(new int[]{4, 1, 2, 3},
            solution.solution(4, new int[]{4, 4, 4, 4, 4}));
    }

    @Test
    void calculateLength() {
        Solution solution = new Solution();

        assertEquals(0, solution.calculateLength()
    }
}
