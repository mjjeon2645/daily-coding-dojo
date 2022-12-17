import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void sample() {
        Solution solution = new Solution();

        assertArrayEquals(new String[]{"#####","# # #", "### #", "#  ##", "#####"},
            solution.solution(5, new int[]{9, 20, 28, 18, 11}, new int[]{30, 1, 21, 17, 28}));
        assertArrayEquals(new String[]{"######", "###  #", "## ##", " #### ", " #####", "### # "},
            solution.solution(6, new int[]{46, 33, 33 ,22, 31, 50}, new int[]{27 ,56, 19, 14, 14, 10}));
    }

    @Test
    void convertedToBinary() {
        Solution solution = new Solution();

        assertArrayEquals(new String[]{"011", "101", "111"},
            solution.convertToBinary(3, new int[]{3, 5, 7}));
        assertArrayEquals(new String[]{"01001", "10100", "11100", "10010", "01011"},
            solution.convertToBinary(5, new int[]{9, 20, 28, 18, 11}));
        assertArrayEquals(new String[]{"11110", "00001", "10101", "10001", "11100"},
            solution.convertToBinary(5, new int[]{30, 1, 21, 17, 28}));
    }
}
