class Solution {
    int answer = 0;
    public void dfs(int[] num, int total, int depth, int target) {
        if (depth == 0) {
            if (total == target)
                answer++;
            return;
        }
        dfs(num, total + num[num.length - depth], depth - 1, target);
        dfs(num, total - num[num.length - depth], depth - 1, target);
    }
    public int solution(int[] numbers, int target) {
        dfs(numbers, 0, numbers.length, target);
        return answer;
    }
}
