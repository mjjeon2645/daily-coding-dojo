import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        Arrays.sort(arr);

        List<Integer> result = new LinkedList<>();

        for (int value : arr) {
            if (value % divisor == 0) {
                result.add(value);
            }
        }

        if (result.size() != 0) {
            return result.stream().mapToInt(Integer::intValue).toArray();
        }

        return new int[]{-1};
    }
}

//
//import java.util.*;
//
//class Solution {
//    public int[] solution(int[] arr, int divisor) {
//        Arrays.sort(arr);
//
//        int[] filteredArray = Arrays.stream(arr).filter(value -> value % divisor == 0).toArray();
//
//        return filteredArray.length != 0 ? filteredArray : new int[]{-1};
//    }
//}
