import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void sample() {
        Solution solution = new Solution();

        assertArrayEquals(new int[]{1, 3},
            solution.solution("2022.05.19",
                new String[]{"A 6", "B 12", "C 3"},
                new String[]{"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"}));

        assertArrayEquals(new int[]{1, 4, 5},
            solution.solution("2020.01.01",
                new String[]{"Z 3", "D 5"},
                new String[]{"2019.01.01 D", "2019.11.15 Z", "2019.08.02 D", "2019.07.01 D", "2018.12.28 Z"}));

        assertArrayEquals(new int[]{1},
            solution.solution("2020.01.01",
                new String[]{"Z 1", "D 1"},
                new String[]{"2000.01.01 Z", "2019.12.20 D"}));

        assertArrayEquals(new int[]{1},
            solution.solution("2020.01.28",
                new String[]{"Z 61"},
                new String[]{"2014.01.01 Z"}));
    }
}
