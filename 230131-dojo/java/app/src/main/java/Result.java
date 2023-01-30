import java.util.*;

public class Result {
    public static int queensAttack(int n, int k, int r_q, int c_q, List<List<Integer>> obstacles) {
        // Write your code here

        Map<String, String> obstaclesMap = new HashMap<>();

        for (List<Integer> integers : obstacles) {
            obstaclesMap.put(integers.get(0) + ":" + integers.get(1), "obstacle");
        }

        int answer = 0;

        Vertex queen = new Vertex(r_q, c_q);

        // 여왕의 이동범위
        int[] rowPosition = {1, -1, 0, 0, -1, -1, 1, 1};
        int[] columnPosition = {0, 0, 1, -1, -1, 1, -1, 1};

        for (int i = 0; i < n; i += 1) {
            // 초기 여왕의 위치 입력
            int qx = queen.xPosition;
            int qy = queen.yPosition;

            while (qx > 0 && qy > 0 && qx <= n && qy <= n) {
                qx += rowPosition[i];
                qy += columnPosition[i];

                String key = qx + ":" + qy;
                if (obstaclesMap.containsKey(key)) {
                    break;
                }

                answer += 1;
            }
        }

        return answer;
    }
}
