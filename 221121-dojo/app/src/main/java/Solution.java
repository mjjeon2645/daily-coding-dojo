class Solution {
    public long solution(int n) {
        long[] array = new long[2001];

        array[1] = 1;
        array[2] = 2;

        for (int i = 3; i <= 2000; i += 1) {
            array[i] = (array[i - 1] + array[i - 2]) % 1234567;
        }

        return array[n] % 1234567;
    }
}
