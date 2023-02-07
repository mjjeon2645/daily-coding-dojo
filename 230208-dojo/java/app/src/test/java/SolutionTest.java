import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void sample() {
        Solution solution = new Solution();

        assertArrayEquals(new int[]{9, 7, 6, 3, 8}, solution.solution(new int[]{3, 8, 9, 7, 6}, 3));
//        assertArrayEquals(new int[]{0, 0, 0}, solution.solution(new int[]{0, 0, 0}, 1));
//        assertArrayEquals(new int[]{1, 2, 3, 4}, solution.solution(new int[]{1, 2, 3, 4}, 4));
//        assertArrayEquals(new int[]{-1000, 5}, solution.solution(new int[]{5, -1000}, 1));
    }
}
