import java.util.*;

//  미해결
class Solution {
    public int[] solution(int[] A, int K) {
        // Implement your solution here

        // guard clause 1.
        if (A.length == K) {
            return A;
        }

        // guard clause 2.
        Set<Integer> set = new HashSet<>();

        for (int element : A) {
            set.add(element);
        }

        if (set.size() == 1) {
            return A;
        }

        // 본문.
        int standardIndex = A.length - (K % A.length);

        int[] before = new int[A.length - standardIndex];

        for (int i = 0; i < standardIndex; i += 1) {
            before[i] = A[standardIndex + i];
        }

        int[] after = new int[standardIndex];

        for (int i = 0; i < standardIndex; i += 1) {
            after[i] = A[i];
        }

        List<Integer> list1 = new ArrayList(Arrays.asList(before));
        List<Integer> list2 = new ArrayList(Arrays.asList(after));

        list1.addAll(list2);

        int[] answer = new int[A.length];

        for (int i = 0; i < A.length; i += 1) {
            int value = list1.get(i);

            answer[i] = value;
        }

        return answer;
    }
}
