import java.util.*;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);

        for (int i = 0; i < citations.length; i += 1) {
            int h = citations.length - i;

            if (citations[i] >= h) {
                answer = h;
                break;
            }
        }
        return answer;
    }
}

// 내가 해결하려 했던 풀이 => 시간 초과
// if (citations.length == 1 && citations[0] == 0) {
//     return 0;
//     }
//
//     if (citations.length == 1 && citations[0] != 0) {
//     return 1;
//     }
//
//     int i = 0;
//
//     while(true) {
//     int finalI = i;
//
//     int[] filteredArray = Arrays.stream(citations)
//     .filter(citation -> citation >= finalI).toArray();
//
//     if (i == filteredArray.length) {
//     return i;
//     }
//     i += 1;
//     }
