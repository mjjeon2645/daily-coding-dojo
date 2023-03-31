import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void sample() {
        Solution solution = new Solution();

        assertArrayEquals(new int[]{0, 1, 3, 4},
            solution.solution(new String[]{".#...", "..#..", "...#."}));
        assertArrayEquals(new int[]{1, 3, 5, 8},
            solution.solution(new String[]{"..........", ".....#....", "......##..",
                "...##.....", "....#....."}));
        assertArrayEquals(new int[]{0, 0, 7, 9},
            solution.solution(new String[]{".##...##.", "#..#.#..#", "#...#...#",
                ".#.....#.", "..#...#..", "...#.#...", "....#...."}));
        assertArrayEquals(new int[]{1, 0, 2, 1},
            solution.solution(new String[]{"..", "#."}));
    }
}
