import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RotateBracketTest {
    @Test
    void sample() {
        Solution solution = new Solution();

        assertEquals(3, solution.solution("[](){}"));
        assertEquals(2, solution.solution("}]()[{"));
        assertEquals(0, solution.solution("}}}"));
    }
}
