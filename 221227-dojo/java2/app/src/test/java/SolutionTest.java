import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void sample() {
        Solution solution = new Solution();

        assertArrayEquals(new int[][]{{4, 6}, {7, 9}},
            solution.solution(new int[][]{{1, 2}, {2, 3}}, new int[][]{{3, 4}, {5, 6}}));

        assertArrayEquals(new int[][]{{4}, {6}},
            solution.solution(new int[][]{{1}, {2}}, new int[][]{{3}, {4}}));

        assertArrayEquals(new int[][]{{4}, {6}, {3}},
            solution.solution(new int[][]{{1}, {2}, {1}}, new int[][]{{3}, {4}, {2}}));

        assertArrayEquals(new int[][]{{4, 6}, {6, 5}, {3, 3}},
            solution.solution(new int[][]{{1, 2}, {2, 3}, {1, 1}}, new int[][]{{3, 4}, {4, 2}, {2, 2}}));

        assertArrayEquals(new int[][]{{4, 6, 3}, {6, 5, 3}, {3, 3, 3}},
            solution.solution(new int[][]{{1, 2, 1}, {2, 3, 1}, {1, 1, 1}}, new int[][]{{3, 4, 2}, {4, 2, 2}, {2, 2, 2}}));
    }
}
