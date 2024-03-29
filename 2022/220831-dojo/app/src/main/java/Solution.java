// 이거 지난번에 못풀었던 문제... 하. 제한 시간 안에 못풀더라도 이 문제는 쪼개는 연습을 하기엔 좋을것같다.
// 작업단위를 계속 쪼개고 '하나'를 실현하는데 집중해보자.
// 학생들이 있는데 일부 체육복을 도난당함. **학생들의 번호는 체격 순으로 매겨짐**
// => 바로 앞번호, 또는 뒷번호에게만 체육복을 빌려줄 수 있음
// 전체 학생 수는 n. 도난당한 학생들의 번호가 담긴 배열 lost. 여벌옷을 가져온 학생들의 번호 배열 reserve
// 리턴해야 하는 것? 체육수업을 들을 수 있는 학생의 최댓값

// 제한사항: 전체 학생 수는 2명 이상 30명 이하
// 도난당한 학생 수, 여벌체육복 가져온 학생수는 각각 1명 이상 n명(전체 학생 수) 이하. 중복 없음
// 여벌 체육복이 있는 학생만 다른 학생에게 체육복 빌려줄 수 있음
// 여벌체육복 가져온 애도 도난당했을 수 있음!!!! 주의

// 시작을 어떻게 해야할까... 쉬운 예시를 만들어서 생각해보자.
// 전체 학생수 3명. 잃어버린애 1번, 여벌 가져온애 2번. ㅇㅋ 가즈아
// 전체 학생 수가 3명인데 잃어버린애가 1번임. 근데 여벌을 가져온 애가 1번 바로 옆,
// 즉 1번이라는 숫자에서 -1을 하거나 +1을 했을 때에 해당하므로 빌려줄수 있음
// 최대값을 구하는거니까... 먼저는 (1) 참여 가능한 학생의 최소값을 구하고, (2) 그 다음 그 숫자에
// 추가로 참여할 수 있는 애를 더해주는 방식으로 가는게 어떨까? 해보자.
// => 리스트로 어찌저찌 해보려했는데 실패. 와.. 이거 어떻게 해야하는거지..?
// 우선 내가 설정한 상황에 대해서만큼은 그린을 띄웠음. 그다음 상황 설정을 또 해보자.. 주어진 예시를 활용할까..?
// n = 5, lost [2, 4], reserve[1, 3, 5], return 5

import java.util.Arrays;

public class Solution {
   public int solution(int n, int[] lost, int[] reserve) {
     int answer = n - lost.length;

     Arrays.sort(lost);
     Arrays.sort(reserve);

     for (int i = 0; i < lost.length; i += 1) {
       for (int j = 0; j < reserve.length; j += 1) {
         if (lost[i] == reserve[j]) {
           answer += 1;
           lost[i] = -1;
           reserve[j] = -1;
           break;
         }
       }
     }

     for (int i = 0; i < lost.length; i += 1) {
       for (int j = 0; j < reserve.length; j += 1) {
         if (lost[i] - 1 == reserve[j] ||
         lost[i] + 1 == reserve[j]) {
           answer += 1;
           reserve[j] = -1;
           break;
         }
       }
     }

     return answer;
   }
}
