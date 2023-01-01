class Solution {
    public int solution(String s) {
        char x = s.charAt(0);
        int count = 0;
        int different = 0;
        int answer = 0;

        for (int i = 0; i < s.length(); i += 1) {
            if (count == different) {
                answer += 1;
                x = s.charAt(i);
            }

            


        }

        return answer;
    }
}

//import java.util.*;
//
//class Solution {
//    public int solution(String s) {
//        int answer = 0;
//
//        String[] words = s.split("");
//
//        Queue<String> queue = new LinkedList<>(Arrays.asList(words));
//
//        answer = process(answer, queue);
//
//        return answer;
//    }
//
//    public int process(int answer, Queue<String> queue) {
//        String x = queue.poll();
//
//        int countForSame = 1;
//        int countForDifferent = 0;
//
//        if (queue.size() == 0) {
//            answer += 1;
//            return answer;
//        }
//
//        while (queue.size() >= 0) {
//            if(countForSame == countForDifferent) {
//                answer += 1;
//                process(answer, queue);
//            }
//
//            if (Objects.equals(queue.peek(), x)) {
//                countForSame += 1;
//                continue;
//            }
//
//            if (!Objects.equals(queue.peek(), x)) {
//                queue.poll();
//                countForDifferent += 1;
//            }
//        }
//
//        return answer;
//    }
//}
