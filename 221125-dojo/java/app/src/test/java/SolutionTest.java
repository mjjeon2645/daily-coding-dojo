import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void sample() {
        Solution solution = new Solution();

        assertEquals(5, solution.solution(new int[]{1, 1, 1, 1, 1}, 3));
        assertEquals(2, solution.solution(new int[]{4, 1, 2, 1}, 4));
    }

    @Test
    void lengthOfNumbersIs2() {
        Solution solution = new Solution();

        assertEquals(1, solution.solution(new int[]{1, 1}, 2));
        assertEquals(0, solution.solution(new int[]{1, 1}, 4));
        assertEquals(1, solution.solution(new int[]{3, 1}, 2));
        assertEquals(0, solution.solution(new int[]{4, 50}, 3));
        assertEquals(1, solution.solution(new int[]{4, 50}, 54));
    }
}
