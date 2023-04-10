class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int wallNumber = 0;

        for (int j : section) {
            if (j > wallNumber) {
                answer += 1;
                wallNumber = j + m - 1;
            }
        }
        return answer;
    }
}
