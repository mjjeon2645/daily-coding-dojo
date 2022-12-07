import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void sample() {
        Solution solution = new Solution();

        assertEquals(5, solution.solution(new String[][]{{"yellow_hat", "headgear"},
            {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}}));
        assertEquals(3, solution.solution(new String[][]{{"crow_mask", "face"},
            {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}}));
    }
}
