import org.junit.jupiter.api.*;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void sample() {
        Solution solution = new Solution();

        assertEquals(new int[]{11, 1, 27, 15},
            solution.solution("KAKAO"));

        assertEquals(new int[]{20, 15, 2, 5, 15, 18, 14, 15, 20, 27, 29, 31, 36, 30, 32, 34},
            solution.solution("TOBEORNOTTOBEORTOBEORNOT"));

        assertEquals(new int[]{1, 2, 27, 29, 28, 31, 30},
            solution.solution("ABABABABABABABAB"));
    }

    @Test
    void initDictionary() {
        Solution solution = new Solution();

        HashMap<String, Integer> dictionary = new HashMap<>();
        solution.initDictionary(dictionary);

        assertEquals(2, dictionary.get("B"));
    }
}
