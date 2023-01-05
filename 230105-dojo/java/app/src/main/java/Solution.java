import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;

        List<Integer> losts = new LinkedList<>();
        List<Integer> reserves = new LinkedList<>();

        Arrays.sort(lost);
        Arrays.sort(reserve);

        for (int item : reserve) {
            reserves.add(item);
        }

        for (int value : lost) {
            if (reserves.contains(value)) {
                int index = reserves.indexOf(value);
                reserves.remove(index);
                continue;
            }

            losts.add(value);
        }

        // 진짜 잃어버린 아이와 진짜 빌려줄수 있는 아이가 각각 losts, reserves에 남아있음
        if (losts.size() == 0) {
            return n;
        }

        n -= losts.size();

        for (int theNumberOfLost : losts) {
            if (reserves.contains(theNumberOfLost - 1)) {
                n += 1;
                int index = reserves.indexOf(theNumberOfLost - 1);
                reserves.remove(index);
                continue;
            }

            if (reserves.contains(theNumberOfLost + 1)) {
                n += 1;
                int index = reserves.indexOf(theNumberOfLost + 1);
                reserves.remove(index);
            }
        }

        answer = n;

        return answer;
    }
}
