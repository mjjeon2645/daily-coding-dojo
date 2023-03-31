import java.util.*;

class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = new int[4];

        List<Integer> x = new ArrayList<>();
        List<Integer> y = new ArrayList<>();

        for (int i = 0; i < wallpaper.length; i += 1) {
            for (int j = 0; j < wallpaper[0].length(); j += 1) {
                if (wallpaper[i].charAt(j) == '#') {
                    x.add(i);
                    y.add(j);
                }
            }
        }

        Collections.sort(x);
        Collections.sort(y);

        answer[0] = x.get(0);
        answer[1] = y.get(0);
        answer[2] = x.get(x.size() - 1) + 1;
        answer[3] = y.get(y.size() - 1) + 1;

        return answer;
    }
}
