import java.util.*;

class Solution {
    int[][] map;
    List<Integer> answer = new LinkedList<>();

    public int[] solution(String[] maps) {
        // maps 배열 int로 변환
        map = new int[maps.length][maps[0].length()];

        for (int i = 0; i < maps.length; i += 1) {
            char[] mapCharArray = maps[i].toCharArray();

            for (int j = 0; j < mapCharArray.length; j += 1) {
                char character = mapCharArray[j];

                if (character == 'X') {
                    map[i][j] = -1;
                    continue;
                }

                map[i][j] = character - '0';
            }
        }

        for (int i = 0; i < map.length; i += 1) {
            for (int j = 0; j < map[0].length; j += 1) {
                int isLandSum = dfs(i, j);
                if (isLandSum > 0) {
                    answer.add(isLandSum);
                }
            }
        }

        // 무인도가 없는 경우
        if (answer.size() == 0) {
            return new int[]{-1};
        }

        // 무인도가 있는 경우
        Collections.sort(answer);

        int[] answerArray = new int[answer.size()];

        for (int i = 0; i < answerArray.length; i += 1) {
            answerArray[i] = answer.get(i);
        }

        return answerArray;
    }

    // dfs 알고리즘
    public int dfs(int i, int j) {
        // 배열의 범위를 벗어나면 return
        if (i < 0 || j < 0 || i >= map.length || j >= map[0].length) {
            return 0;
        }

        // 이미 들린 곳
        if (map[i][j] == -1) {
            return 0;
        }

        int temp = map[i][j];
        map[i][j] = -1; // 들린 상태 저장

        return temp + dfs(i - 1, j) + dfs(i + 1, j) + dfs(i, j - 1) + dfs(i, j + 1);
    }
}

//
//class Solution {
//    public int[] solution(String[] maps) {
//        int[] answer = {};
//        int row = maps[0].length();
//        int column = maps.length;
//        List<Integer> results = new ArrayList<>();
//
//        List<String> reversedLists = new LinkedList<>();
//        for (int i = maps.length - 1; i >= 0; i -= 1) {
//            reversedLists.add(maps[i]);
//        }
//
//        String[] reversedArray = new String[maps.length];
//
//        for (int i = 0; i < maps.length; i += 1) {
//            reversedArray[i] = reversedLists.get(i);
//        }
//
//        // 상하좌우
//        int[] xIncrement = {0, 0, -1, 1};
//        int[] yIncrement = {1, -1, 0, 0};
//
//
//
//        return answer;
//    }
//}
//
//class Position {
//    int x;
//    int y;
//
//    public Position(int x, int y) {
//        this.x = x;
//        this.y = y;
//    }
//}
