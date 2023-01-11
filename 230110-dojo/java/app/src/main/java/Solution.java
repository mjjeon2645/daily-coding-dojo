class Solution {
    public int solution(int left, int right) {
        int accumulator = 0;

        for (int i = left; i <= right; i += 1) {
            int count = 0;

            for (int j = 1; j <= i; j += 1) {
                count += i % j == 0 ? 1 : 0;
            }

            accumulator += count % 2 == 0 ? i : i * (- 1);
        }

        return accumulator;
    }
}
