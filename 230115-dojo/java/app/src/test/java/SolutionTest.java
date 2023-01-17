import org.junit.jupiter.api.*;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void sample() {
        Solution solution = new Solution();

//        assertArrayEquals(new int[]{5, 10}, solution.solution(new int[]{5, 9, 7, 10}, 5));
//        assertArrayEquals(new int[]{1, 2, 3, 36}, solution.solution(new int[]{2, 36, 1, 3}, 1));
//        assertArrayEquals(new int[]{-1}, solution.solution(new int[]{3, 2, 6}, 10));
    }

    @Test
    void stringSortTest() {
        Solution solution = new Solution();

        String[] testArray = new String[]{"1", "11", "21", "111"};

        Arrays.sort(testArray);

        System.out.println(testArray[0]);
        System.out.println(testArray[1]);
        System.out.println(testArray[2]);
        System.out.println(testArray[3]);

        String[] testArray2 = new String[]{"apple", "mary", "Mary", "app"};

        Arrays.sort(testArray2);

        System.out.println(testArray2[0]);
        System.out.println(testArray2[1]);
        System.out.println(testArray2[2]);
        System.out.println(testArray2[3]);

        assertArrayEquals(new int[]{1, 11, 21, 111, 1111}, solution.solution(new int[]{1, 21, 11, 1111, 111}, 1));
    }
}
