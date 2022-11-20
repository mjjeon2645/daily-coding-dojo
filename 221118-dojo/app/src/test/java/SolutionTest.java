import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void sample() {
        Solution solution = new Solution();

//        assertEquals(50, solution.solution(3, new String[]{"Jeju", "Pangyo",
//            "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"}));
//        assertEquals(21, solution.solution(3, new String[]{"Jeju", "Pangyo", "Seoul",
//            "Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul"}));
//        assertEquals(60, solution.solution(2, new String[]{"Jeju", "Pangyo", "Seoul",
//            "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"}));
//        assertEquals(52, solution.solution(5, new String[]{"Jeju", "Pangyo", "Seoul",
//            "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"}));
        assertEquals(16, solution.solution(2, new String[]{"Jeju", "Pangyo", "NewYork", "newyork"}));
//        assertEquals(25, solution.solution(0, new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA"}));
    }
}
