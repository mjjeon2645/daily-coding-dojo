import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void sample() {
        Solution solution = new Solution();

        assertEquals(new int[]{2, 1, 3, 4}, "{{2},{2,1},{2,1,3},{2,1,3,4}}");
        assertEquals(new int[]{2, 1, 3, 4}, "{{1,2,3},{2,1},{1,2,4,3},{2}}");
        assertEquals(new int[]{111, 20}, "{{20,111},{111}}");
        assertEquals(new int[]{123}, "{{123}}");
        assertEquals(new int[]{3, 2, 4, 1}, "{{4,2,3},{3},{2,3,4,1},{2,3}}");
    }

    @Test
    void convertToArray() {
        Solution solution = new Solution();

        assertArrayEquals(new String[]{"2", "2,1", "2,1,3", "2,1,3,4"},
            solution.convertToArray("{{2},{2,1},{2,1,3},{2,1,3,4}}"));
    }

    @Test
    void sortedArray() {
        Solution solution = new Solution();

        assertArrayEquals(new String[]{"2", "2,1", "2,1,3", "2,1,3,4"},
            solution.sortedArray(new String[]{"2,1", "2", "2,1,3", "2,1,3,4"}));
    }
}
