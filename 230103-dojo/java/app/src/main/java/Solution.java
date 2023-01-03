import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        Arrays.sort(participant);
        Arrays.sort(completion);

        Queue<String> completionQueue = new LinkedList<>(Arrays.stream(completion).toList());

        for (int i = 0; i < completion.length; i += 1) {
            String name = completionQueue.poll();

            if (!participant[i].equals(name)) {
                answer = participant[i];
                break;
            }

            answer = participant[participant.length - 1];
        }

        return answer;
    }
}
