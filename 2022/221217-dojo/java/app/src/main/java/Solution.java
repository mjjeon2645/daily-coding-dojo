class Solution {
    public int solution(int n) {
        int result = process(n);

        return result;
    }

    public int process(int n) {
        for (int i = 2; i < n; i += 1) {
            if (n % i == 1) {
                return i;
            }
        }
        return n - 1;
    }
}
