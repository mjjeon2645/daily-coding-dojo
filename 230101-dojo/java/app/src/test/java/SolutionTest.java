import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void sample() {
        Solution solution = new Solution();

        assertEquals(3, solution.solution("banana"));
//        assertEquals(6, solution.solution("abracadabra"));
//        assertEquals(3, solution.solution("aaabbaccccabba"));
        assertEquals(1, solution.solution("a"));
    }
}
