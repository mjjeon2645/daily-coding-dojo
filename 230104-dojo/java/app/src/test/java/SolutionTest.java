import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void sample() {
        Solution solution = new Solution();

//        assertArrayEquals(new int[]{2, 1, 1, 0},
//            solution.solution(new String[]{"muzi", "frodo", "apeach", "neo"},
//                new String[]{"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"},
//                2));
        assertArrayEquals(new int[]{0, 0},
            solution.solution(new String[]{"con", "ryan"},
                new String[]{"ryan con", "ryan con", "ryan con", "ryan con"},
                3));
    }
}
