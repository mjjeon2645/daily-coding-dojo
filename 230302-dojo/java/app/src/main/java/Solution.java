//import java.util.*;
//
//class Solution {
//    public int solution(int[] elements) {
//    Set set = new HashSet();
//
//        int length = elements.length;
//
//        // 원소의 갯수
//        for (int i = 1; i <= length; i += 1) {
//            int sum = 0;
//
//            for (int j = 0; j < length; j += 1) {
//                if (j == 0) {
//                    for (int k = 0; k < i; k += 1) {
//                        sum += elements[k];
//                    }
//                }
//
//                if (j != 0) {
//                    sum -= elements[j - 1];
//                    sum += elements[(j + i - 1) % length];
//                }
//                set.add(sum);
//            }
//        }
//        return set.size();
//    }
//}

import java.util.*;

class Solution {
    public int solution(int[] elements) {
        Set set = new HashSet();

        int length = elements.length;
        int[] extended = new int[length * 2];

        for (int i = 0; i < length * 2; i += 1) {
            if (i < length) {
                extended[i] = elements[i];
                continue;
            }

            extended[i] = elements[i - length];
        }

        // 원소 갯수
        for (int i = 1; i <= length; i += 1) {
            int sum = 0;

            for (int j = 0; j < length; j += 1) {
                sum += extended[i + j];
                set.add(sum);
            }
        }

        return set.size();
    }
}
