import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void sample() {
        Solution solution = new Solution();

        assertEquals(3, solution.solution(new int[]{70, 50, 80, 50}, 100));
        assertEquals(3, solution.solution(new int[]{70, 80, 50}, 100));
    }

    @Test
    void sort() {
        Solution solution = new Solution();

        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, solution.sort(new int[]{3, 1, 2, 5, 4}));
    }
}
